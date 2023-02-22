package com.altlokaltsapplication.app.modules.videos.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VideosModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_to_make_ita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShooPharDhie: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shoo_phar_dhie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_venice_italy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngridients: String? = MyApp.getInstance().resources.getString(R.string.lbl_ingridients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDirections: String? = MyApp.getInstance().resources.getString(R.string.lbl_directions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngridientsfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ingridients_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_pound_italian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemslist: String? = MyApp.getInstance().resources.getString(R.string.msg_4_6_5_ounce_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_bay_leaves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_ital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.msg_teaspoon_garl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_drie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_drie2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_8_ounce_pac)

)
