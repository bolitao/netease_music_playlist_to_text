package netease_api_parse.pojo.songdetail;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FreeTrialPrivilege{

	@JsonProperty("userConsumable")
	private boolean userConsumable;

	@JsonProperty("resConsumable")
	private boolean resConsumable;

	public void setUserConsumable(boolean userConsumable){
		this.userConsumable = userConsumable;
	}

	public boolean isUserConsumable(){
		return userConsumable;
	}

	public void setResConsumable(boolean resConsumable){
		this.resConsumable = resConsumable;
	}

	public boolean isResConsumable(){
		return resConsumable;
	}

	@Override
 	public String toString(){
		return 
			"FreeTrialPrivilege{" + 
			"userConsumable = '" + userConsumable + '\'' + 
			",resConsumable = '" + resConsumable + '\'' + 
			"}";
		}
}