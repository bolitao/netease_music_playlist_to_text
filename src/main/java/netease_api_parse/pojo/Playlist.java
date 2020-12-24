package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Playlist{

	@JsonProperty("privacy")
	private long privacy;

	@JsonProperty("description")
	private String description;

	@JsonProperty("videos")
	private Object videos;

	@JsonProperty("trackNumberUpdateTime")
	private long trackNumberUpdateTime;

	@JsonProperty("subscribed")
	private boolean subscribed;

	@JsonProperty("shareCount")
	private long shareCount;

	@JsonProperty("adType")
	private long adType;

	@JsonProperty("trackCount")
	private long trackCount;

	@JsonProperty("coverImgId_str")
	private String coverImgIdStr;

	@JsonProperty("specialType")
	private long specialType;

	@JsonProperty("trackIds")
	private List<TrackIdsItem> trackIds;

	@JsonProperty("id")
	private long id;

	@JsonProperty("videoIds")
	private Object videoIds;

	@JsonProperty("englishTitle")
	private Object englishTitle;

	@JsonProperty("ordered")
	private boolean ordered;

	@JsonProperty("creator")
	private Creator creator;

	@JsonProperty("subscribers")
	private List<Object> subscribers;

	@JsonProperty("backgroundCoverUrl")
	private Object backgroundCoverUrl;

	@JsonProperty("opRecommend")
	private boolean opRecommend;

	@JsonProperty("highQuality")
	private boolean highQuality;

	@JsonProperty("commentThreadId")
	private String commentThreadId;

	@JsonProperty("updateTime")
	private long updateTime;

	@JsonProperty("trackUpdateTime")
	private long trackUpdateTime;

	@JsonProperty("userId")
	private long userId;

	@JsonProperty("tracks")
	private List<TracksItem> tracks;

	@JsonProperty("tags")
	private List<Object> tags;

	@JsonProperty("commentCount")
	private long commentCount;

	@JsonProperty("titleImage")
	private long titleImage;

	@JsonProperty("cloudTrackCount")
	private long cloudTrackCount;

	@JsonProperty("coverImgUrl")
	private String coverImgUrl;

	@JsonProperty("playCount")
	private long playCount;

	@JsonProperty("coverImgId")
	private long coverImgId;

	@JsonProperty("createTime")
	private long createTime;

	@JsonProperty("name")
	private String name;

	@JsonProperty("backgroundCoverId")
	private long backgroundCoverId;

	@JsonProperty("subscribedCount")
	private long subscribedCount;

	@JsonProperty("titleImageUrl")
	private Object titleImageUrl;

	@JsonProperty("updateFrequency")
	private Object updateFrequency;

	@JsonProperty("newImported")
	private boolean newImported;

	@JsonProperty("status")
	private long status;

	public void setPrivacy(long privacy){
		this.privacy = privacy;
	}

	public long getPrivacy(){
		return privacy;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setVideos(Object videos){
		this.videos = videos;
	}

	public Object getVideos(){
		return videos;
	}

	public void setTrackNumberUpdateTime(long trackNumberUpdateTime){
		this.trackNumberUpdateTime = trackNumberUpdateTime;
	}

	public long getTrackNumberUpdateTime(){
		return trackNumberUpdateTime;
	}

	public void setSubscribed(boolean subscribed){
		this.subscribed = subscribed;
	}

	public boolean isSubscribed(){
		return subscribed;
	}

	public void setShareCount(long shareCount){
		this.shareCount = shareCount;
	}

	public long getShareCount(){
		return shareCount;
	}

	public void setAdType(long adType){
		this.adType = adType;
	}

	public long getAdType(){
		return adType;
	}

	public void setTrackCount(long trackCount){
		this.trackCount = trackCount;
	}

	public long getTrackCount(){
		return trackCount;
	}

	public void setCoverImgIdStr(String coverImgIdStr){
		this.coverImgIdStr = coverImgIdStr;
	}

	public String getCoverImgIdStr(){
		return coverImgIdStr;
	}

	public void setSpecialType(long specialType){
		this.specialType = specialType;
	}

	public long getSpecialType(){
		return specialType;
	}

	public void setTrackIds(List<TrackIdsItem> trackIds){
		this.trackIds = trackIds;
	}

	public List<TrackIdsItem> getTrackIds(){
		return trackIds;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setVideoIds(Object videoIds){
		this.videoIds = videoIds;
	}

	public Object getVideoIds(){
		return videoIds;
	}

	public void setEnglishTitle(Object englishTitle){
		this.englishTitle = englishTitle;
	}

	public Object getEnglishTitle(){
		return englishTitle;
	}

	public void setOrdered(boolean ordered){
		this.ordered = ordered;
	}

	public boolean isOrdered(){
		return ordered;
	}

	public void setCreator(Creator creator){
		this.creator = creator;
	}

	public Creator getCreator(){
		return creator;
	}

	public void setSubscribers(List<Object> subscribers){
		this.subscribers = subscribers;
	}

	public List<Object> getSubscribers(){
		return subscribers;
	}

	public void setBackgroundCoverUrl(Object backgroundCoverUrl){
		this.backgroundCoverUrl = backgroundCoverUrl;
	}

	public Object getBackgroundCoverUrl(){
		return backgroundCoverUrl;
	}

	public void setOpRecommend(boolean opRecommend){
		this.opRecommend = opRecommend;
	}

	public boolean isOpRecommend(){
		return opRecommend;
	}

	public void setHighQuality(boolean highQuality){
		this.highQuality = highQuality;
	}

	public boolean isHighQuality(){
		return highQuality;
	}

	public void setCommentThreadId(String commentThreadId){
		this.commentThreadId = commentThreadId;
	}

	public String getCommentThreadId(){
		return commentThreadId;
	}

	public void setUpdateTime(long updateTime){
		this.updateTime = updateTime;
	}

	public long getUpdateTime(){
		return updateTime;
	}

	public void setTrackUpdateTime(long trackUpdateTime){
		this.trackUpdateTime = trackUpdateTime;
	}

	public long getTrackUpdateTime(){
		return trackUpdateTime;
	}

	public void setUserId(long userId){
		this.userId = userId;
	}

	public long getUserId(){
		return userId;
	}

	public void setTracks(List<TracksItem> tracks){
		this.tracks = tracks;
	}

	public List<TracksItem> getTracks(){
		return tracks;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setCommentCount(long commentCount){
		this.commentCount = commentCount;
	}

	public long getCommentCount(){
		return commentCount;
	}

	public void setTitleImage(long titleImage){
		this.titleImage = titleImage;
	}

	public long getTitleImage(){
		return titleImage;
	}

	public void setCloudTrackCount(long cloudTrackCount){
		this.cloudTrackCount = cloudTrackCount;
	}

	public long getCloudTrackCount(){
		return cloudTrackCount;
	}

	public void setCoverImgUrl(String coverImgUrl){
		this.coverImgUrl = coverImgUrl;
	}

	public String getCoverImgUrl(){
		return coverImgUrl;
	}

	public void setPlayCount(long playCount){
		this.playCount = playCount;
	}

	public long getPlayCount(){
		return playCount;
	}

	public void setCoverImgId(long coverImgId){
		this.coverImgId = coverImgId;
	}

	public long getCoverImgId(){
		return coverImgId;
	}

	public void setCreateTime(long createTime){
		this.createTime = createTime;
	}

	public long getCreateTime(){
		return createTime;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setBackgroundCoverId(long backgroundCoverId){
		this.backgroundCoverId = backgroundCoverId;
	}

	public long getBackgroundCoverId(){
		return backgroundCoverId;
	}

	public void setSubscribedCount(long subscribedCount){
		this.subscribedCount = subscribedCount;
	}

	public long getSubscribedCount(){
		return subscribedCount;
	}

	public void setTitleImageUrl(Object titleImageUrl){
		this.titleImageUrl = titleImageUrl;
	}

	public Object getTitleImageUrl(){
		return titleImageUrl;
	}

	public void setUpdateFrequency(Object updateFrequency){
		this.updateFrequency = updateFrequency;
	}

	public Object getUpdateFrequency(){
		return updateFrequency;
	}

	public void setNewImported(boolean newImported){
		this.newImported = newImported;
	}

	public boolean isNewImported(){
		return newImported;
	}

	public void setStatus(long status){
		this.status = status;
	}

	public long getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Playlist{" + 
			"privacy = '" + privacy + '\'' + 
			",description = '" + description + '\'' + 
			",videos = '" + videos + '\'' + 
			",trackNumberUpdateTime = '" + trackNumberUpdateTime + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",shareCount = '" + shareCount + '\'' + 
			",adType = '" + adType + '\'' + 
			",trackCount = '" + trackCount + '\'' + 
			",coverImgId_str = '" + coverImgIdStr + '\'' + 
			",specialType = '" + specialType + '\'' + 
			",trackIds = '" + trackIds + '\'' + 
			",id = '" + id + '\'' + 
			",videoIds = '" + videoIds + '\'' + 
			",englishTitle = '" + englishTitle + '\'' + 
			",ordered = '" + ordered + '\'' + 
			",creator = '" + creator + '\'' + 
			",subscribers = '" + subscribers + '\'' + 
			",backgroundCoverUrl = '" + backgroundCoverUrl + '\'' + 
			",opRecommend = '" + opRecommend + '\'' + 
			",highQuality = '" + highQuality + '\'' + 
			",commentThreadId = '" + commentThreadId + '\'' + 
			",updateTime = '" + updateTime + '\'' + 
			",trackUpdateTime = '" + trackUpdateTime + '\'' + 
			",userId = '" + userId + '\'' + 
			",tracks = '" + tracks + '\'' + 
			",tags = '" + tags + '\'' + 
			",commentCount = '" + commentCount + '\'' + 
			",titleImage = '" + titleImage + '\'' + 
			",cloudTrackCount = '" + cloudTrackCount + '\'' + 
			",coverImgUrl = '" + coverImgUrl + '\'' + 
			",playCount = '" + playCount + '\'' + 
			",coverImgId = '" + coverImgId + '\'' + 
			",createTime = '" + createTime + '\'' + 
			",name = '" + name + '\'' + 
			",backgroundCoverId = '" + backgroundCoverId + '\'' + 
			",subscribedCount = '" + subscribedCount + '\'' + 
			",titleImageUrl = '" + titleImageUrl + '\'' + 
			",updateFrequency = '" + updateFrequency + '\'' + 
			",newImported = '" + newImported + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}