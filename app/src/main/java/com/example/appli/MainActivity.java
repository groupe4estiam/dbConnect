package com.example.appli;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.appli.helper.RetrofitService;
import com.example.appli.helper.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllDechets();
    }

    private void getAllDechets(){
        //Initialize an instance of the interface
        RetrofitService service;
        //Retrofit service client
        service = RetrofitClient.getClient();
        //Get all the dechets
        Call<List<Donnees>> call = service.getAllDechets();
        //asynchronously retrieve the data
        call.enqueue(new Callback<List<Donnees>>(){
            @Override
            public void onResponse(Call<List<Donnees>> call, Response<List<Donnees>> response){
                // assign the response(list) to a variable list and displaying it
                List<Donnees> list = response.body();
                Log.i(TAG, list.toString());
            }

            @Override
            public void onFailure(Call<List<Donnees>> call, Throwable t) {
                //displaying the error
                Log.i(TAG, t.toString());
            }
        });
    }
}