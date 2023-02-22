package com.altlokaltsapplication.app.modules.searchingridients.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchIngridientsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChicken: String? = MyApp.getInstance().resources.getString(R.string.lbl_chicken)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etItemValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etItemOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etItemTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etItemThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etItemFourValue: String? = null
)
