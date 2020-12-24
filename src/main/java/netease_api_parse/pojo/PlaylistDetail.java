package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistDetail {

    @JsonProperty("privileges")
    private List<PrivilegesItem> privileges;

    @JsonProperty("urls")
    private Object urls;

    @JsonProperty("code")
    private long code;

    @JsonProperty("playlist")
    private Playlist playlist;

    @JsonProperty("relatedVideos")
    private Object relatedVideos;

    public void setPrivileges(List<PrivilegesItem> privileges) {
        this.privileges = privileges;
    }

    public List<PrivilegesItem> getPrivileges() {
        return privileges;
    }

    public void setUrls(Object urls) {
        this.urls = urls;
    }

    public Object getUrls() {
        return urls;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setRelatedVideos(Object relatedVideos) {
        this.relatedVideos = relatedVideos;
    }

    public Object getRelatedVideos() {
        return relatedVideos;
    }

    @Override
    public String toString() {
        return
                "PlaylistDetail{" +
                        "privileges = '" + privileges + '\'' +
                        ",urls = '" + urls + '\'' +
                        ",code = '" + code + '\'' +
                        ",playlist = '" + playlist + '\'' +
                        ",relatedVideos = '" + relatedVideos + '\'' +
                        "}";
    }
}