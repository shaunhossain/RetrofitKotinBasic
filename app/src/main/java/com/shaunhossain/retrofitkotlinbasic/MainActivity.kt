package com.shaunhossain.retrofitkotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shaunhossain.retrofitkotlinbasic.Constant.Companion.BASE_URL
import com.shaunhossain.retrofitkotlinbasic.network.NetworkApi
import com.shaunhossain.retrofitkotlinbasic.repos.Repository.Companion.getAllComments
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.IO){

            val comments = getAllComments()
            for (comment in comments.body()!!){
                Log.d(TAG, comment.toString())
            }
        }
    }
}