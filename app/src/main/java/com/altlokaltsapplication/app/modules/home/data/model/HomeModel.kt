package com.altlokaltsapplication.app.modules.home.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloShooPhar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_shoo_phar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatdoyouwan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_do_you_wan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsian: String? = MyApp.getInstance().resources.getString(R.string.lbl_asian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmerican: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItalia: String? = MyApp.getInstance().resources.getString(R.string.lbl_italia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_japan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)

)
