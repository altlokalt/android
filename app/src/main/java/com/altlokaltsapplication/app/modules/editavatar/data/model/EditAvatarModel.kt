package com.altlokaltsapplication.app.modules.editavatar.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditAvatarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvatarProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_avatar_profile)

)
