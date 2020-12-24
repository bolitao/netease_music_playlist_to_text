package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TracksItem {

    @JsonProperty("no")
    private long no;

    @JsonProperty("rt")
    private String rt;

    @JsonProperty("copyright")
    private long copyright;

    @JsonProperty("fee")
    private long fee;

    @JsonProperty("rurl")
    private Object rurl;

    @JsonProperty("mst")
    private long mst;

    @JsonProperty("pst")
    private long pst;

    @JsonProperty("pop")
    private long pop;

    @JsonProperty("dt")
    private long dt;

    @JsonProperty("rtype")
    private long rtype;

    @JsonProperty("s_id")
    private long sId;

    @JsonProperty("rtUrls")
    private List<Object> rtUrls;

    @JsonProperty("id")
    private long id;

    @JsonProperty("st")
    private long st;

    @JsonProperty("a")
    private Object A;

    @JsonProperty("cd")
    private String cd;

    @JsonProperty("publishTime")
    private long publishTime;

    @JsonProperty("cf")
    private String cf;

    @JsonProperty("originCoverType")
    private long originCoverType;

    @JsonProperty("h")
    private H H;

    @JsonProperty("mv")
    private long mv;

    @JsonProperty("al")
    private Al al;

    @JsonProperty("originSongSimpleData")
    private Object originSongSimpleData;

    @JsonProperty("l")
    private L L;

    @JsonProperty("m")
    private M M;

    @JsonProperty("cp")
    private long cp;

    @JsonProperty("alia")
    private List<Object> alia;

    @JsonProperty("djId")
    private long djId;

    @JsonProperty("noCopyrightRcmd")
    private Object noCopyrightRcmd;

    @JsonProperty("crbt")
    private Object crbt;

    @JsonProperty("single")
    private long single;

    @JsonProperty("ar")
    private List<ArItem> ar;

    @JsonProperty("rtUrl")
    private Object rtUrl;

    @JsonProperty("ftype")
    private long ftype;

    @JsonProperty("t")
    private long T;

    @JsonProperty("v")
    private long V;

    @JsonProperty("name")
    private String name;

    @JsonProperty("mark")
    private long mark;

    @JsonProperty("pc")
    private Pc pc;

    @JsonProperty("tns")
    private List<String> tns;

    public void setNo(long no) {
        this.no = no;
    }

    public long getNo() {
        return no;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRt() {
        return rt;
    }

    public void setCopyright(long copyright) {
        this.copyright = copyright;
    }

    public long getCopyright() {
        return copyright;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public long getFee() {
        return fee;
    }

    public void setRurl(Object rurl) {
        this.rurl = rurl;
    }

    public Object getRurl() {
        return rurl;
    }

    public void setMst(long mst) {
        this.mst = mst;
    }

    public long getMst() {
        return mst;
    }

    public void setPst(long pst) {
        this.pst = pst;
    }

    public long getPst() {
        return pst;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public long getPop() {
        return pop;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getDt() {
        return dt;
    }

    public void setRtype(long rtype) {
        this.rtype = rtype;
    }

    public long getRtype() {
        return rtype;
    }

    public void setSId(long sId) {
        this.sId = sId;
    }

    public long getSId() {
        return sId;
    }

    public void setRtUrls(List<Object> rtUrls) {
        this.rtUrls = rtUrls;
    }

    public List<Object> getRtUrls() {
        return rtUrls;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setSt(long st) {
        this.st = st;
    }

    public long getSt() {
        return st;
    }

    public void setA(Object A) {
        this.A = A;
    }

    public Object getA() {
        return A;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getCd() {
        return cd;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getCf() {
        return cf;
    }

    public void setOriginCoverType(long originCoverType) {
        this.originCoverType = originCoverType;
    }

    public long getOriginCoverType() {
        return originCoverType;
    }

    public void setH(H H) {
        this.H = H;
    }

    public H getH() {
        return H;
    }

    public void setMv(long mv) {
        this.mv = mv;
    }

    public long getMv() {
        return mv;
    }

    public void setAl(Al al) {
        this.al = al;
    }

    public Al getAl() {
        return al;
    }

    public void setOriginSongSimpleData(Object originSongSimpleData) {
        this.originSongSimpleData = originSongSimpleData;
    }

    public Object getOriginSongSimpleData() {
        return originSongSimpleData;
    }

    public void setL(L L) {
        this.L = L;
    }

    public L getL() {
        return L;
    }

    public void setM(M M) {
        this.M = M;
    }

    public M getM() {
        return M;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public long getCp() {
        return cp;
    }

    public void setAlia(List<Object> alia) {
        this.alia = alia;
    }

    public List<Object> getAlia() {
        return alia;
    }

    public void setDjId(long djId) {
        this.djId = djId;
    }

    public long getDjId() {
        return djId;
    }

    public void setNoCopyrightRcmd(Object noCopyrightRcmd) {
        this.noCopyrightRcmd = noCopyrightRcmd;
    }

    public Object getNoCopyrightRcmd() {
        return noCopyrightRcmd;
    }

    public void setCrbt(Object crbt) {
        this.crbt = crbt;
    }

    public Object getCrbt() {
        return crbt;
    }

    public void setSingle(long single) {
        this.single = single;
    }

    public long getSingle() {
        return single;
    }

    public void setAr(List<ArItem> ar) {
        this.ar = ar;
    }

    public List<ArItem> getAr() {
        return ar;
    }

    public void setRtUrl(Object rtUrl) {
        this.rtUrl = rtUrl;
    }

    public Object getRtUrl() {
        return rtUrl;
    }

    public void setFtype(long ftype) {
        this.ftype = ftype;
    }

    public long getFtype() {
        return ftype;
    }

    public void setT(long T) {
        this.T = T;
    }

    public long getT() {
        return T;
    }

    public void setV(long V) {
        this.V = V;
    }

    public long getV() {
        return V;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMark(long mark) {
        this.mark = mark;
    }

    public long getMark() {
        return mark;
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }

    public Pc getPc() {
        return pc;
    }

    public void setTns(List<String> tns) {
        this.tns = tns;
    }

    public List<String> getTns() {
        return tns;
    }

    @Override
    public String toString() {
        return
                "TracksItem{" +
                        "no = '" + no + '\'' +
                        ",rt = '" + rt + '\'' +
                        ",copyright = '" + copyright + '\'' +
                        ",fee = '" + fee + '\'' +
                        ",rurl = '" + rurl + '\'' +
                        ",mst = '" + mst + '\'' +
                        ",pst = '" + pst + '\'' +
                        ",pop = '" + pop + '\'' +
                        ",dt = '" + dt + '\'' +
                        ",rtype = '" + rtype + '\'' +
                        ",s_id = '" + sId + '\'' +
                        ",rtUrls = '" + rtUrls + '\'' +
                        ",id = '" + id + '\'' +
                        ",st = '" + st + '\'' +
                        ",a = '" + A + '\'' +
                        ",cd = '" + cd + '\'' +
                        ",publishTime = '" + publishTime + '\'' +
                        ",cf = '" + cf + '\'' +
                        ",originCoverType = '" + originCoverType + '\'' +
                        ",h = '" + H + '\'' +
                        ",mv = '" + mv + '\'' +
                        ",al = '" + al + '\'' +
                        ",originSongSimpleData = '" + originSongSimpleData + '\'' +
                        ",l = '" + L + '\'' +
                        ",m = '" + M + '\'' +
                        ",cp = '" + cp + '\'' +
                        ",alia = '" + alia + '\'' +
                        ",djId = '" + djId + '\'' +
                        ",noCopyrightRcmd = '" + noCopyrightRcmd + '\'' +
                        ",crbt = '" + crbt + '\'' +
                        ",single = '" + single + '\'' +
                        ",ar = '" + ar + '\'' +
                        ",rtUrl = '" + rtUrl + '\'' +
                        ",ftype = '" + ftype + '\'' +
                        ",t = '" + T + '\'' +
                        ",v = '" + V + '\'' +
                        ",name = '" + name + '\'' +
                        ",mark = '" + mark + '\'' +
                        ",pc = '" + pc + '\'' +
                        ",tns = '" + tns + '\'' +
                        "}";
    }
}