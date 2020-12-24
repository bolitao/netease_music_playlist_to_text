package netease_api_parse;

import netease_api_parse.json.Parser;
import netease_api_parse.net.SimpNetHandler;
import netease_api_parse.pojo.PlaylistDetail;
import netease_api_parse.pojo.TrackIdsItem;
import netease_api_parse.pojo.songdetail.SongDetail;
import netease_api_parse.pojo.songdetail.SongsItem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bolitao
 */
public class NeteaseApiParseApplication {
    public static String getInput(String hint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint);
        return scanner.next();
    }

    private static void songDetailHandle(String songUrl, SimpNetHandler simpNetHandler, String fileName) throws Exception {
        Parser<SongDetail> songDetailParser = new Parser<>(SongDetail.class);
        SongDetail songDetail = songDetailParser.ret(simpNetHandler.simpReq(new URL(songUrl)));
        try (OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(fileName, true),
                StandardCharsets.UTF_8)) {
            for (SongsItem song : songDetail.getSongs()) {
                String tmp = song.getName() + " - " + song.getAr().get(0).getName() + "\n";
                // TODO: write to file
                fileWriter.write(tmp);
                fileWriter.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String apiPath = "http://localhost:3000";
        String playlistId = getInput("歌单 ID: ");
        String fileName = getInput("输出文件名: ") + ".txt";
        String apiUrl = apiPath + "/playlist/detail?id=" + playlistId;
        String songDetailUrlPrefix = apiPath + "/song/detail?ids=";

        SimpNetHandler simpNetHandler = new SimpNetHandler();

        // 先把文件清空
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.print("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Parser<PlaylistDetail> playlistDetailParser = new Parser<>(PlaylistDetail.class);
        PlaylistDetail playlistDetail = playlistDetailParser.ret(simpNetHandler.simpReq(new URL(apiUrl)));
        List<TrackIdsItem> trackIds = playlistDetail.getPlaylist().getTrackIds();

        List<Long> ids = new ArrayList<>();
        for (TrackIdsItem trackIdsItem : trackIds) {
            ids.add(trackIdsItem.getId());
        }

        int loop = 100;
        for (int j = 0; j < ids.size(); j = j + loop) {
            StringBuilder songDetailUrl = new StringBuilder(songDetailUrlPrefix);
            for (int i = j; i < j + loop && i < ids.size(); i++) {
                songDetailUrl.append(ids.get(i)).append(",");
            }
            songDetailUrl.deleteCharAt(songDetailUrl.length() - 1);
            Thread.sleep(500);
            songDetailHandle(songDetailUrl.toString(), simpNetHandler, fileName);
        }
    }
}
