package com.altlokaltsapplication.app.modules.filterpreference.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListtabRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTab: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lunch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_dinner)

)
