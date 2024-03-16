package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.CatPhoto
import retrofit2.http.GET

interface CatApiService{
    @GET("V1/IMAGES/SEARCH?LIMIT=10")
    suspend fun getPhotos():List<CatPhoto>
}