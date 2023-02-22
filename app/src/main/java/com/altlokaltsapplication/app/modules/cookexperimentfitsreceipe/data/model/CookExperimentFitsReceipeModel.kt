package com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CookExperimentFitsReceipeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookExperiment: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cook_experiment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilk: String? = MyApp.getInstance().resources.getString(R.string.lbl_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdd: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet)

)
