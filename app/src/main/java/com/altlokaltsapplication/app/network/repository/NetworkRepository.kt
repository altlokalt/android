package com.altlokaltsapplication.app.network.repository

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import com.altlokaltsapplication.app.extensions.NoInternetConnection
import com.altlokaltsapplication.app.extensions.isOnline
import com.altlokaltsapplication.app.network.RetrofitServices
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginRequest
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginResponse
import com.altlokaltsapplication.app.network.resources.ErrorResponse
import com.altlokaltsapplication.app.network.resources.Response
import com.altlokaltsapplication.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  suspend fun createLogin(contentType: String?, createLoginRequest: CreateLoginRequest?):
      Response<CreateLoginResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createLogin(contentType, createLoginRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
