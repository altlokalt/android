package com.altlokaltsapplication.app.modules.onboardingone.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeback: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignintofind: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_to_find)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBysigningup: String? = MyApp.getInstance().resources.getString(R.string.msg_by_signing_up)

)
