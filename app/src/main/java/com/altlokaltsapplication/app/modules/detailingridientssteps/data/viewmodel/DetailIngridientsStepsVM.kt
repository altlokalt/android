package com.altlokaltsapplication.app.modules.detailingridientssteps.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.detailingridientssteps.`data`.model.DetailIngridientsStepsModel
import org.koin.core.KoinComponent

class DetailIngridientsStepsVM : ViewModel(), KoinComponent {
  val detailIngridientsStepsModel: MutableLiveData<DetailIngridientsStepsModel> =
      MutableLiveData(DetailIngridientsStepsModel())

  var navArguments: Bundle? = null
}
