package com.altlokaltsapplication.app.modules.ordersucces.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrderSuccesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderSuccessfu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_successfu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_o)

)
