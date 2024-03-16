package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.CatPhoto
import com.mexiti.catphotoapp.network.CatApi
import com.mexiti.catphotoapp.network.CatApiService

interface CatPhotoRepository{
    suspend fun getCatPhoto():List<CatPhoto>
}

class NetworkCatPhotoRepository(retrofitService: CatApiService) : CatPhotoRepository{
    override suspend fun getCatPhoto(): List<CatPhoto> {
        return CatApi.retrofitService.getPhotos();
    }
}