package com.altlokaltsapplication.app.modules.interestpagetwo.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestPageTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsGetStarte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lets_get_starte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEasyCooking: String? = MyApp.getInstance().resources.getString(R.string.lbl_easy_cooking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNosalt: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_salt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDairyFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_dairy_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHighProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_high_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOilFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_oil_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOilFreeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_oil_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealtyFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_healty_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLowCalories: String? = MyApp.getInstance().resources.getString(R.string.lbl_low_calories)

)
