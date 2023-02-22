package com.altlokaltsapplication.app.modules.detailingridientsreviews.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailIngridientsReviewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet2)
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
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
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
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_hours_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_212)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTheRecipesogValue: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_recipe_so_g)

)
