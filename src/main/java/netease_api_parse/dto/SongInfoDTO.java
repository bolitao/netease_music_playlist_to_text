package netease_api_parse.dto;

public class SongInfoDTO {
    String songInfo;

    public SongInfoDTO(String songInfo) {
        this.songInfo = songInfo;
    }

    public String getSongInfo() {
        return songInfo;
    }

    public void setSongInfo(String songInfo) {
        this.songInfo = songInfo;
    }

    @Override
    public String toString() {
        return "SongInfoDTO{" +
                "songInfo='" + songInfo + '\'' +
                '}';
    }
}
