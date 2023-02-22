package com.altlokaltsapplication.app.modules.detailingridientscalories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.detailingridientscalories.`data`.model.DetailIngridientsCaloriesModel
import org.koin.core.KoinComponent

class DetailIngridientsCaloriesVM : ViewModel(), KoinComponent {
  val detailIngridientsCaloriesModel: MutableLiveData<DetailIngridientsCaloriesModel> =
      MutableLiveData(DetailIngridientsCaloriesModel())

  var navArguments: Bundle? = null
}
