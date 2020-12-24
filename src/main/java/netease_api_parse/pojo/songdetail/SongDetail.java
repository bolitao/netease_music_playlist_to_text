package netease_api_parse.pojo.songdetail;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SongDetail{

	@JsonProperty("privileges")
	private List<PrivilegesItem> privileges;

	@JsonProperty("code")
	private long code;

	@JsonProperty("songs")
	private List<SongsItem> songs;

	public void setPrivileges(List<PrivilegesItem> privileges){
		this.privileges = privileges;
	}

	public List<PrivilegesItem> getPrivileges(){
		return privileges;
	}

	public void setCode(long code){
		this.code = code;
	}

	public long getCode(){
		return code;
	}

	public void setSongs(List<SongsItem> songs){
		this.songs = songs;
	}

	public List<SongsItem> getSongs(){
		return songs;
	}

	@Override
 	public String toString(){
		return 
			"SongDetail{" + 
			"privileges = '" + privileges + '\'' + 
			",code = '" + code + '\'' + 
			",songs = '" + songs + '\'' + 
			"}";
		}
}