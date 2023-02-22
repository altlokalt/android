package com.altlokaltsapplication.app.modules.cookexperimentfindreceipe.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CookExperimentFindReceipeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatingredient: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_ingredient)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngridientsfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ingridients_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdd: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilkCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChickenCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_chicken)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPotatoCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_potato)

)
