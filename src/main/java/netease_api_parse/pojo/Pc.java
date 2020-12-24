package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pc{

	@JsonProperty("br")
	private long br;

	@JsonProperty("uid")
	private long uid;

	@JsonProperty("ar")
	private String ar;

	@JsonProperty("alb")
	private String alb;

	@JsonProperty("nickname")
	private String nickname;

	@JsonProperty("fn")
	private String fn;

	@JsonProperty("sn")
	private String sn;

	@JsonProperty("version")
	private long version;

	@JsonProperty("cid")
	private String cid;

	public void setBr(long br){
		this.br = br;
	}

	public long getBr(){
		return br;
	}

	public void setUid(long uid){
		this.uid = uid;
	}

	public long getUid(){
		return uid;
	}

	public void setAr(String ar){
		this.ar = ar;
	}

	public String getAr(){
		return ar;
	}

	public void setAlb(String alb){
		this.alb = alb;
	}

	public String getAlb(){
		return alb;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	public void setFn(String fn){
		this.fn = fn;
	}

	public String getFn(){
		return fn;
	}

	public void setSn(String sn){
		this.sn = sn;
	}

	public String getSn(){
		return sn;
	}

	public void setVersion(long version){
		this.version = version;
	}

	public long getVersion(){
		return version;
	}

	public void setCid(String cid){
		this.cid = cid;
	}

	public String getCid(){
		return cid;
	}

	@Override
 	public String toString(){
		return 
			"Pc{" + 
			"br = '" + br + '\'' + 
			",uid = '" + uid + '\'' + 
			",ar = '" + ar + '\'' + 
			",alb = '" + alb + '\'' + 
			",nickname = '" + nickname + '\'' + 
			",fn = '" + fn + '\'' + 
			",sn = '" + sn + '\'' + 
			",version = '" + version + '\'' + 
			",cid = '" + cid + '\'' + 
			"}";
		}
}