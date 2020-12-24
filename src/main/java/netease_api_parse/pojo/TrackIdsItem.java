package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackIdsItem{

	@JsonProperty("at")
	private long at;

	@JsonProperty("v")
	private long V;

	@JsonProperty("id")
	private long id;

	@JsonProperty("alg")
	private Object alg;

	public void setAt(long at){
		this.at = at;
	}

	public long getAt(){
		return at;
	}

	public void setV(long V){
		this.V = V;
	}

	public long getV(){
		return V;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setAlg(Object alg){
		this.alg = alg;
	}

	public Object getAlg(){
		return alg;
	}

	@Override
 	public String toString(){
		return 
			"TrackIdsItem{" + 
			"at = '" + at + '\'' + 
			",v = '" + V + '\'' + 
			",id = '" + id + '\'' + 
			",alg = '" + alg + '\'' + 
			"}";
		}
}