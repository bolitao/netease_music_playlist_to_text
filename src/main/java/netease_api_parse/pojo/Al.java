package netease_api_parse.pojo;

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
    private List<String> tns;

    @JsonProperty("pic_str")
    private String picStr;

    @JsonProperty("id")
    private long id;

    @JsonProperty("pic")
    private long pic;

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

    public void setTns(List<String> tns) {
        this.tns = tns;
    }

    public List<String> getTns() {
        return tns;
    }

    public void setPicStr(String picStr) {
        this.picStr = picStr;
    }

    public String getPicStr() {
        return picStr;
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

    @Override
    public String toString() {
        return
                "Al{" +
                        "picUrl = '" + picUrl + '\'' +
                        ",name = '" + name + '\'' +
                        ",tns = '" + tns + '\'' +
                        ",pic_str = '" + picStr + '\'' +
                        ",id = '" + id + '\'' +
                        ",pic = '" + pic + '\'' +
                        "}";
    }
}