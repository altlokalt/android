package com.altlokaltsapplication.app.modules.detailingridientscalories.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailIngridientsCaloriesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_italian_spaghet2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIngridients: String? = MyApp.getInstance().resources.getString(R.string.lbl_ingridients)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDirections: String? = MyApp.getInstance().resources.getString(R.string.lbl_directions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
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
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_pound_italian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOunces: String? = MyApp.getInstance().resources.getString(R.string.msg_4_6_5_ounce_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_bay_leaves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_ital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.msg_teaspoon_garl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_drie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_teaspoon_drie2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_8_ounce_pac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNutritionInfo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nutrition_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourHundredTwentySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_427)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalories: String? = MyApp.getInstance().resources.getString(R.string.lbl_calories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_12g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeightOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_23g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSugar: String? = MyApp.getInstance().resources.getString(R.string.lbl_sugar)

)
