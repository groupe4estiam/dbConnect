package com.example.appli;
//
//data {"adresse":"Mon adresse","poids":69,"locationLatitude":46.32616809935827,"locationLongitude":0.35444419831037516}
import com.google.gson.annotations.SerializedName;

public class Donnees{

	@SerializedName("adresse")
	private String adresse;

	@SerializedName("poids")
	private int poids;

	@SerializedName("locationLatitude")
	private Object locationLatitude;

	@SerializedName("locationLongitude")
	private Object locationLongitude;

	public String getAdresse(){
		return adresse;
	}

	public int getPoids(){
		return poids;
	}

	public Object getLocationLatitude(){
		return locationLatitude;
	}

	public Object getLocationLongitude(){
		return locationLongitude;
	}

}