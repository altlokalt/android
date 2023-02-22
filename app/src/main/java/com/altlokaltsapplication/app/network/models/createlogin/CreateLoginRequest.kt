package com.altlokaltsapplication.app.network.models.createlogin

import com.google.gson.annotations.SerializedName

data class CreateLoginRequest(

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("username")
	val username: String? = null
)
