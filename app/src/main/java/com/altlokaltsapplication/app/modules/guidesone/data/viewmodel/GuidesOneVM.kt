package com.altlokaltsapplication.app.modules.guidesone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.guidesone.`data`.model.GuidesOneModel
import com.altlokaltsapplication.app.modules.guidesone.`data`.model.SpinnerNavbarModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GuidesOneVM : ViewModel(), KoinComponent {
  val guidesOneModel: MutableLiveData<GuidesOneModel> = MutableLiveData(GuidesOneModel())

  var navArguments: Bundle? = null

  val spinnerNavbarList: MutableLiveData<MutableList<SpinnerNavbarModel>> = MutableLiveData()
}
