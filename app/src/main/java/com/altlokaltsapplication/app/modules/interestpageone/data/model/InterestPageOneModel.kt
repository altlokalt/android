package com.altlokaltsapplication.app.modules.interestpageone.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestPageOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyouaveget: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_a_veget)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesHidealla: String? = MyApp.getInstance().resources.getString(R.string.msg_yes_hide_all_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoShowallre: String? = MyApp.getInstance().resources.getString(R.string.msg_no_show_all_re)

)
