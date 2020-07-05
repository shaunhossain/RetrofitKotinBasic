package com.shaunhossain.retrofitkotlinbasic.repos

import com.shaunhossain.retrofitkotlinbasic.network.RetrofitInstrance

class Repository {
    companion object{
        suspend fun getAllComments() = RetrofitInstrance.api.getComments()
    }
}