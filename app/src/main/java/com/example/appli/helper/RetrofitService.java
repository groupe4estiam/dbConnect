package com.example.appli.helper;


import com.example.appli.Donnees;

import retrofit2.http.Body;
import retrofit2.http.POST;

import retrofit2.http.GET;
import  java.util.List;
import retrofit2.Call;


public interface RetrofitService {

    @GET("dechets")
    Call<List<Donnees>> getAllDechets();

    //@POST(dechets)
    //Call<Donnnees> createDechet(@Body Donnees nouveauDechet);
}
