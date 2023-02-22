package com.altlokaltsapplication.app.modules.interestpagethree.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestPageThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatkindoffo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_kind_of_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsian: String? = MyApp.getInstance().resources.getString(R.string.lbl_asian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_italian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMexican: String? = MyApp.getInstance().resources.getString(R.string.lbl_mexican)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_thai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_malay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealtyFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_healty_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_japan)

)
