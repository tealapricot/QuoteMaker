package com.example.quotemaker

import retrofit2.Call
import retrofit2.http.GET

interface QuoteApiService {
    @GET("quotes")
    fun getProducts(): Call<QuoteResponse>
}