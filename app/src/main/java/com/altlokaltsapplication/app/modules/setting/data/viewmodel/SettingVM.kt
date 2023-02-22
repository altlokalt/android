package com.altlokaltsapplication.app.modules.setting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.setting.`data`.model.SettingModel
import org.koin.core.KoinComponent

class SettingVM : ViewModel(), KoinComponent {
  val settingModel: MutableLiveData<SettingModel> = MutableLiveData(SettingModel())

  var navArguments: Bundle? = null
}
