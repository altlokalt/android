package com.altlokaltsapplication.app.modules.mybags.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShoppingList: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopping_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServings: String? = MyApp.getInstance().resources.getString(R.string.lbl_servings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListIngridient: String? =
      MyApp.getInstance().resources.getString(R.string.msg_list_ingridient)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBayleaves: String? = MyApp.getInstance().resources.getString(R.string.lbl_bay_leaves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_26_29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTomatoSauce: String? = MyApp.getInstance().resources.getString(R.string.lbl_tomato_sauce)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)

)
