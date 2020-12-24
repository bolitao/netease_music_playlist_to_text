package netease_api_parse.pojo.songdetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Al {

    @JsonProperty("picUrl")
    private String picUrl;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tns")
    private List<Object> tns;

    @JsonProperty("id")
    private long id;

    @JsonProperty("pic")
    private long pic;

    @JsonProperty("pic_str")
    private String picStr;

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTns(List<Object> tns) {
        this.tns = tns;
    }

    public List<Object> getTns() {
        return tns;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setPic(long pic) {
        this.pic = pic;
    }

    public long getPic() {
        return pic;
    }

    public void setPicStr(String picStr) {
        this.picStr = picStr;
    }

    public String getPicStr() {
        return picStr;
    }

    @Override
    public String toString() {
        return
                "Al{" +
                        "picUrl = '" + picUrl + '\'' +
                        ",name = '" + name + '\'' +
                        ",tns = '" + tns + '\'' +
                        ",id = '" + id + '\'' +
                        ",pic = '" + pic + '\'' +
                        ",pic_str = '" + picStr + '\'' +
                        "}";
    }
}