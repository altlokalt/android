package com.altlokaltsapplication.app.modules.filterpreference.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterPreferenceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeal: String? = MyApp.getInstance().resources.getString(R.string.lbl_meal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCuisine: String? = MyApp.getInstance().resources.getString(R.string.lbl_cuisine)

)
