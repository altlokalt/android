package com.altlokaltsapplication.app.network

import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginRequest
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitServices {
  @POST("/device/auth/login")
  suspend fun createLogin(@Header("Content-Type") contentType: String?, @Body
      createLoginRequest: CreateLoginRequest?): CreateLoginResponse
}

const val BASE_URL: String = "https://nodedemo.dhiwise.co"
