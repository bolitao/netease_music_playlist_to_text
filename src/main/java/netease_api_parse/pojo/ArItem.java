package netease_api_parse.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("tns")
	private List<Object> tns;

	@JsonProperty("alias")
	private List<Object> alias;

	@JsonProperty("id")
	private long id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTns(List<Object> tns){
		this.tns = tns;
	}

	public List<Object> getTns(){
		return tns;
	}

	public void setAlias(List<Object> alias){
		this.alias = alias;
	}

	public List<Object> getAlias(){
		return alias;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ArItem{" + 
			"name = '" + name + '\'' + 
			",tns = '" + tns + '\'' + 
			",alias = '" + alias + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}