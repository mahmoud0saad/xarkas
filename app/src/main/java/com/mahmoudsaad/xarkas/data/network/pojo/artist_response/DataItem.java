package com.mahmoudsaad.xarkas.data.network.pojo.artist_response;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("likes_count")
	private int likesCount;

	@SerializedName("thumbnail")
	private String thumbnail;

	@SerializedName("price")
	private int price;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("is_featured")
	private int isFeatured;

	public void setLikesCount(int likesCount){
		this.likesCount = likesCount;
	}

	public int getLikesCount(){
		return likesCount;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setIsFeatured(int isFeatured){
		this.isFeatured = isFeatured;
	}

	public int getIsFeatured(){
		return isFeatured;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"likes_count = '" + likesCount + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",price = '" + price + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",is_featured = '" + isFeatured + '\'' + 
			"}";
		}
}