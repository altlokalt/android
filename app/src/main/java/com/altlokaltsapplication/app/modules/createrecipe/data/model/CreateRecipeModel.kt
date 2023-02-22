package com.altlokaltsapplication.app.modules.createrecipe.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreateRecipeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaphotoof: String? = MyApp.getInstance().resources.getString(R.string.msg_add_a_photo_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecipetitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_recipe_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTellaboutthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_about_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServings: String? = MyApp.getInstance().resources.getString(R.string.lbl_servings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServingsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_servings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCookingTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_cooking_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hr_30_min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_ingridients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngridients: String? = MyApp.getInstance().resources.getString(R.string.lbl_ingridients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFormValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFormOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etWeightValue: String? = null
)
