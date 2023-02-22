package com.altlokaltsapplication.app.modules.guidestwo.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GuidesTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShoppingList: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopping_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServings: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_servings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_prep_20_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_cook_1_hour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtList: String? = MyApp.getInstance().resources.getString(R.string.lbl_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_pound_italian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOuncec: String? = MyApp.getInstance().resources.getString(R.string.msg_4_6_5_ounce_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_bay_leaves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_ital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.msg_teaspoon_garl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_drie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_drie2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_8_ounce_pac)

)
