package com.shaunhossain.retrofitkotlinbasic

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApi {
    @GET("/comments")
   suspend fun getComments() : Response<List<CommentItem>>
}