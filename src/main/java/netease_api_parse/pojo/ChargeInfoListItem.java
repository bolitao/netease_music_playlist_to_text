package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargeInfoListItem{

	@JsonProperty("rate")
	private long rate;

	@JsonProperty("chargeMessage")
	private Object chargeMessage;

	@JsonProperty("chargeType")
	private long chargeType;

	@JsonProperty("chargeUrl")
	private Object chargeUrl;

	public void setRate(long rate){
		this.rate = rate;
	}

	public long getRate(){
		return rate;
	}

	public void setChargeMessage(Object chargeMessage){
		this.chargeMessage = chargeMessage;
	}

	public Object getChargeMessage(){
		return chargeMessage;
	}

	public void setChargeType(long chargeType){
		this.chargeType = chargeType;
	}

	public long getChargeType(){
		return chargeType;
	}

	public void setChargeUrl(Object chargeUrl){
		this.chargeUrl = chargeUrl;
	}

	public Object getChargeUrl(){
		return chargeUrl;
	}

	@Override
 	public String toString(){
		return 
			"ChargeInfoListItem{" + 
			"rate = '" + rate + '\'' + 
			",chargeMessage = '" + chargeMessage + '\'' + 
			",chargeType = '" + chargeType + '\'' + 
			",chargeUrl = '" + chargeUrl + '\'' + 
			"}";
		}
}