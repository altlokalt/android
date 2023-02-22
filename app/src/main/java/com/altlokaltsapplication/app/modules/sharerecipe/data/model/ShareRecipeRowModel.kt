package com.altlokaltsapplication.app.modules.sharerecipe.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ShareRecipeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJesslynNarry: String? = MyApp.getInstance().resources.getString(R.string.lbl_jesslyn_narry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_jesslynarry_gma)

)
