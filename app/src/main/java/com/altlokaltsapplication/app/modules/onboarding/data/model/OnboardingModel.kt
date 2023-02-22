package com.altlokaltsapplication.app.modules.onboarding.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecipeBook: String? = MyApp.getInstance().resources.getString(R.string.lbl_recipebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
