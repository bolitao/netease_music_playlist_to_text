package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NoCopyrightRcmd {

    @JsonProperty("typeDesc")
    private String typeDesc;

    @JsonProperty("type")
    private long type;

    @JsonProperty("songId")
    private Object songId;

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setType(long type) {
        this.type = type;
    }

    public long getType() {
        return type;
    }

    public void setSongId(Object songId) {
        this.songId = songId;
    }

    public Object getSongId() {
        return songId;
    }

    @Override
    public String toString() {
        return
                "NoCopyrightRcmd{" +
                        "typeDesc = '" + typeDesc + '\'' +
                        ",type = '" + type + '\'' +
                        ",songId = '" + songId + '\'' +
                        "}";
    }
}