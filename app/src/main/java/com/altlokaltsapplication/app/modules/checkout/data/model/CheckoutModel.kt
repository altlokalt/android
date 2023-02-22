package com.altlokaltsapplication.app.modules.checkout.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CheckoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderSummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPickUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_pick_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromoCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_promo_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_visa_xxxx_xxx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtotalPrice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sub_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_26_29_8_none)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEnterPromoCodValue: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_promo_cod)

)
