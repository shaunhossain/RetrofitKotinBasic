package com.shaunhossain.retrofitkotlinbasic.network

import com.shaunhossain.retrofitkotlinbasic.model.Comment
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApi {
    @GET("/comments")
   suspend fun getComments() : Response<Comment>
}