package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class H {

    @JsonProperty("br")
    private long br;

    @JsonProperty("fid")
    private long fid;

    @JsonProperty("size")
    private long size;

    @JsonProperty("vd")
    private long vd;

    public void setBr(long br) {
        this.br = br;
    }

    public long getBr() {
        return br;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public long getFid() {
        return fid;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void setVd(long vd) {
        this.vd = vd;
    }

    public long getVd() {
        return vd;
    }

    @Override
    public String toString() {
        return
                "H{" +
                        "br = '" + br + '\'' +
                        ",fid = '" + fid + '\'' +
                        ",size = '" + size + '\'' +
                        ",vd = '" + vd + '\'' +
                        "}";
    }
}