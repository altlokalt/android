package com.altlokaltsapplication.app.modules.filterpreference.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListtabOneTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTabTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_african)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOneTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabTwoTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_british)

)
