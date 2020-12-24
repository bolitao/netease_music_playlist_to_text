package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrivilegesItem {

    @JsonProperty("st")
    private long st;

    @JsonProperty("flag")
    private long flag;

    @JsonProperty("chargeInfoList")
    private List<ChargeInfoListItem> chargeInfoList;

    @JsonProperty("subp")
    private long subp;

    @JsonProperty("fl")
    private long fl;

    @JsonProperty("fee")
    private long fee;

    @JsonProperty("dl")
    private long dl;

    @JsonProperty("freeTrialPrivilege")
    private FreeTrialPrivilege freeTrialPrivilege;

    @JsonProperty("downloadMaxbr")
    private long downloadMaxbr;

    @JsonProperty("cp")
    private long cp;

    @JsonProperty("preSell")
    private boolean preSell;

    @JsonProperty("cs")
    private boolean cs;

    @JsonProperty("toast")
    private boolean toast;

    @JsonProperty("playMaxbr")
    private long playMaxbr;

    @JsonProperty("maxbr")
    private long maxbr;

    @JsonProperty("id")
    private long id;

    @JsonProperty("pl")
    private long pl;

    @JsonProperty("sp")
    private long sp;

    @JsonProperty("payed")
    private long payed;

    public void setSt(long st) {
        this.st = st;
    }

    public long getSt() {
        return st;
    }

    public void setFlag(long flag) {
        this.flag = flag;
    }

    public long getFlag() {
        return flag;
    }

    public void setChargeInfoList(List<ChargeInfoListItem> chargeInfoList) {
        this.chargeInfoList = chargeInfoList;
    }

    public List<ChargeInfoListItem> getChargeInfoList() {
        return chargeInfoList;
    }

    public void setSubp(long subp) {
        this.subp = subp;
    }

    public long getSubp() {
        return subp;
    }

    public void setFl(long fl) {
        this.fl = fl;
    }

    public long getFl() {
        return fl;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public long getFee() {
        return fee;
    }

    public void setDl(long dl) {
        this.dl = dl;
    }

    public long getDl() {
        return dl;
    }

    public void setFreeTrialPrivilege(FreeTrialPrivilege freeTrialPrivilege) {
        this.freeTrialPrivilege = freeTrialPrivilege;
    }

    public FreeTrialPrivilege getFreeTrialPrivilege() {
        return freeTrialPrivilege;
    }

    public void setDownloadMaxbr(long downloadMaxbr) {
        this.downloadMaxbr = downloadMaxbr;
    }

    public long getDownloadMaxbr() {
        return downloadMaxbr;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public long getCp() {
        return cp;
    }

    public void setPreSell(boolean preSell) {
        this.preSell = preSell;
    }

    public boolean isPreSell() {
        return preSell;
    }

    public void setCs(boolean cs) {
        this.cs = cs;
    }

    public boolean isCs() {
        return cs;
    }

    public void setToast(boolean toast) {
        this.toast = toast;
    }

    public boolean isToast() {
        return toast;
    }

    public void setPlayMaxbr(long playMaxbr) {
        this.playMaxbr = playMaxbr;
    }

    public long getPlayMaxbr() {
        return playMaxbr;
    }

    public void setMaxbr(long maxbr) {
        this.maxbr = maxbr;
    }

    public long getMaxbr() {
        return maxbr;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setPl(long pl) {
        this.pl = pl;
    }

    public long getPl() {
        return pl;
    }

    public void setSp(long sp) {
        this.sp = sp;
    }

    public long getSp() {
        return sp;
    }

    public void setPayed(long payed) {
        this.payed = payed;
    }

    public long getPayed() {
        return payed;
    }

    @Override
    public String toString() {
        return
                "PrivilegesItem{" +
                        "st = '" + st + '\'' +
                        ",flag = '" + flag + '\'' +
                        ",chargeInfoList = '" + chargeInfoList + '\'' +
                        ",subp = '" + subp + '\'' +
                        ",fl = '" + fl + '\'' +
                        ",fee = '" + fee + '\'' +
                        ",dl = '" + dl + '\'' +
                        ",freeTrialPrivilege = '" + freeTrialPrivilege + '\'' +
                        ",downloadMaxbr = '" + downloadMaxbr + '\'' +
                        ",cp = '" + cp + '\'' +
                        ",preSell = '" + preSell + '\'' +
                        ",cs = '" + cs + '\'' +
                        ",toast = '" + toast + '\'' +
                        ",playMaxbr = '" + playMaxbr + '\'' +
                        ",maxbr = '" + maxbr + '\'' +
                        ",id = '" + id + '\'' +
                        ",pl = '" + pl + '\'' +
                        ",sp = '" + sp + '\'' +
                        ",payed = '" + payed + '\'' +
                        "}";
    }
}