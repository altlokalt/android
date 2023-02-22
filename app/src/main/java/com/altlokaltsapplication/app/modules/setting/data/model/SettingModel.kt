package com.altlokaltsapplication.app.modules.setting.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManageyourAcc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manage_your_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAutoplayVideos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_autoplay_videos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrefferedStore: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_preffered_store)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSirishortcuts: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_siri_shortcuts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpCenter: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_center)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyandPol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_privacy_and_pol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete_user)

)
