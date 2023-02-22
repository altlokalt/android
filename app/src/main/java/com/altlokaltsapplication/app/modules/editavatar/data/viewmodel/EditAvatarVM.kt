package com.altlokaltsapplication.app.modules.editavatar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.editavatar.`data`.model.EditAvatarModel
import com.altlokaltsapplication.app.modules.editavatar.`data`.model.EditAvatarRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditAvatarVM : ViewModel(), KoinComponent {
  val editAvatarModel: MutableLiveData<EditAvatarModel> = MutableLiveData(EditAvatarModel())

  var navArguments: Bundle? = null

  val editAvatarList: MutableLiveData<MutableList<EditAvatarRowModel>> =
      MutableLiveData(mutableListOf())
}
