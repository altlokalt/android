package com.altlokaltsapplication.app.modules.guidestwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.guidestwo.`data`.model.GuidesTwoModel
import org.koin.core.KoinComponent

class GuidesTwoVM : ViewModel(), KoinComponent {
  val guidesTwoModel: MutableLiveData<GuidesTwoModel> = MutableLiveData(GuidesTwoModel())

  var navArguments: Bundle? = null
}
