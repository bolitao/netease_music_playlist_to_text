package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Creator {

    @JsonProperty("birthday")
    private long birthday;

    @JsonProperty("detailDescription")
    private String detailDescription;

    @JsonProperty("backgroundUrl")
    private String backgroundUrl;

    @JsonProperty("gender")
    private long gender;

    @JsonProperty("city")
    private long city;

    @JsonProperty("signature")
    private String signature;

    @JsonProperty("description")
    private String description;

    @JsonProperty("remarkName")
    private Object remarkName;

    @JsonProperty("accountStatus")
    private long accountStatus;

    @JsonProperty("avatarImgId")
    private long avatarImgId;

    @JsonProperty("defaultAvatar")
    private boolean defaultAvatar;

//    @JsonProperty("avatarImgIdStr")
//    private String avatarImgIdStr;

    @JsonProperty("backgroundImgIdStr")
    private String backgroundImgIdStr;

    @JsonProperty("province")
    private long province;

    @JsonProperty("nickname")
    private String nickname;

    @JsonProperty("expertTags")
    private Object expertTags;

    @JsonProperty("djStatus")
    private long djStatus;

    @JsonProperty("avatarUrl")
    private String avatarUrl;

    @JsonProperty("authStatus")
    private long authStatus;

    @JsonProperty("vipType")
    private long vipType;

    @JsonProperty("followed")
    private boolean followed;

    @JsonProperty("userId")
    private long userId;

    @JsonProperty("authenticationTypes")
    private long authenticationTypes;

    @JsonProperty("mutual")
    private boolean mutual;

//    @JsonProperty("avatarImgId_str")
//    private String avatarImgIdStr;

    @JsonProperty("authority")
    private long authority;

    @JsonProperty("anchor")
    private boolean anchor;

    @JsonProperty("userType")
    private long userType;

    @JsonProperty("backgroundImgId")
    private long backgroundImgId;

    @JsonProperty("experts")
    private Object experts;

    @JsonProperty("avatarDetail")
    private Object avatarDetail;

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setGender(long gender) {
        this.gender = gender;
    }

    public long getGender() {
        return gender;
    }

    public void setCity(long city) {
        this.city = city;
    }

    public long getCity() {
        return city;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRemarkName(Object remarkName) {
        this.remarkName = remarkName;
    }

    public Object getRemarkName() {
        return remarkName;
    }

    public void setAccountStatus(long accountStatus) {
        this.accountStatus = accountStatus;
    }

    public long getAccountStatus() {
        return accountStatus;
    }

    public void setAvatarImgId(long avatarImgId) {
        this.avatarImgId = avatarImgId;
    }

    public long getAvatarImgId() {
        return avatarImgId;
    }

    public void setDefaultAvatar(boolean defaultAvatar) {
        this.defaultAvatar = defaultAvatar;
    }

    public boolean isDefaultAvatar() {
        return defaultAvatar;
    }

//    public void setAvatarImgIdStr(String avatarImgIdStr) {
//        this.avatarImgIdStr = avatarImgIdStr;
//    }
//
//    public String getAvatarImgIdStr() {
//        return avatarImgIdStr;
//    }

    public void setBackgroundImgIdStr(String backgroundImgIdStr) {
        this.backgroundImgIdStr = backgroundImgIdStr;
    }

    public String getBackgroundImgIdStr() {
        return backgroundImgIdStr;
    }

    public void setProvince(long province) {
        this.province = province;
    }

    public long getProvince() {
        return province;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setExpertTags(Object expertTags) {
        this.expertTags = expertTags;
    }

    public Object getExpertTags() {
        return expertTags;
    }

    public void setDjStatus(long djStatus) {
        this.djStatus = djStatus;
    }

    public long getDjStatus() {
        return djStatus;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAuthStatus(long authStatus) {
        this.authStatus = authStatus;
    }

    public long getAuthStatus() {
        return authStatus;
    }

    public void setVipType(long vipType) {
        this.vipType = vipType;
    }

    public long getVipType() {
        return vipType;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setAuthenticationTypes(long authenticationTypes) {
        this.authenticationTypes = authenticationTypes;
    }

    public long getAuthenticationTypes() {
        return authenticationTypes;
    }

    public void setMutual(boolean mutual) {
        this.mutual = mutual;
    }

    public boolean isMutual() {
        return mutual;
    }

//    public void setAvatarImgIdStr(String avatarImgIdStr) {
//        this.avatarImgIdStr = avatarImgIdStr;
//    }
//
//    public String getAvatarImgIdStr() {
//        return avatarImgIdStr;
//    }

    public void setAuthority(long authority) {
        this.authority = authority;
    }

    public long getAuthority() {
        return authority;
    }

    public void setAnchor(boolean anchor) {
        this.anchor = anchor;
    }

    public boolean isAnchor() {
        return anchor;
    }

    public void setUserType(long userType) {
        this.userType = userType;
    }

    public long getUserType() {
        return userType;
    }

    public void setBackgroundImgId(long backgroundImgId) {
        this.backgroundImgId = backgroundImgId;
    }

    public long getBackgroundImgId() {
        return backgroundImgId;
    }

    public void setExperts(Object experts) {
        this.experts = experts;
    }

    public Object getExperts() {
        return experts;
    }

    public void setAvatarDetail(Object avatarDetail) {
        this.avatarDetail = avatarDetail;
    }

    public Object getAvatarDetail() {
        return avatarDetail;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "birthday=" + birthday +
                ", detailDescription='" + detailDescription + '\'' +
                ", backgroundUrl='" + backgroundUrl + '\'' +
                ", gender=" + gender +
                ", city=" + city +
                ", signature='" + signature + '\'' +
                ", description='" + description + '\'' +
                ", remarkName=" + remarkName +
                ", accountStatus=" + accountStatus +
                ", avatarImgId=" + avatarImgId +
                ", defaultAvatar=" + defaultAvatar +
                ", backgroundImgIdStr='" + backgroundImgIdStr + '\'' +
                ", province=" + province +
                ", nickname='" + nickname + '\'' +
                ", expertTags=" + expertTags +
                ", djStatus=" + djStatus +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", authStatus=" + authStatus +
                ", vipType=" + vipType +
                ", followed=" + followed +
                ", userId=" + userId +
                ", authenticationTypes=" + authenticationTypes +
                ", mutual=" + mutual +
                ", authority=" + authority +
                ", anchor=" + anchor +
                ", userType=" + userType +
                ", backgroundImgId=" + backgroundImgId +
                ", experts=" + experts +
                ", avatarDetail=" + avatarDetail +
                '}';
    }
}