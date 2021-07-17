package com.udaychugh.wallpaperapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static Retrofit retrofit = null;
    public static final String API = "563492ad6f91700001000001a4f98df3ca374c20bd48e8729c94cb9f";

    public static ApiInterface getApiInterface()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit.create(ApiInterface.class);
    }

}
