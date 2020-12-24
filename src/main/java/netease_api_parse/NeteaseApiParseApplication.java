package netease_api_parse;

import netease_api_parse.json.Parser;
import netease_api_parse.net.SimpNetHandler;
import netease_api_parse.pojo.PlaylistDetail;
import netease_api_parse.pojo.TrackIdsItem;
import netease_api_parse.pojo.songdetail.SongDetail;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bolitao
 */
public class NeteaseApiParseApplication {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("歌单 ID: ");
        return scanner.next();
    }

    private void songDetailHandle(String songUrl, SimpNetHandler simpNetHandler) throws Exception {
        Parser<SongDetail> songDetailParser = new Parser<>(SongDetail.class);
        simpNetHandler.simpReq(new URL(songUrl));

    }

    public static void main(String[] args) throws Exception {
        String playlistId = getInput();
        String apiUrl = "http://localhost:3000/playlist/detail?id=" + playlistId;
        String songDetailUrlPrefix = "/song/detail?ids=";

        SimpNetHandler simpNetHandler = new SimpNetHandler();

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
            System.out.println(j);
            for (int i = j; i < j + loop && i < ids.size(); i++) {
                songDetailUrl.append(ids.get(i)).append(",");
            }
            songDetailUrl.deleteCharAt(songDetailUrl.length() - 1);
            Thread.sleep(500);
            System.out.println(songDetailUrl.toString()); // 调用 parse detail
        }
    }
}
