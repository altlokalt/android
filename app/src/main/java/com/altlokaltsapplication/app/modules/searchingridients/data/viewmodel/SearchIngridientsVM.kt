package com.altlokaltsapplication.app.modules.searchingridients.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.searchingridients.`data`.model.SearchIngridientsModel
import org.koin.core.KoinComponent

class SearchIngridientsVM : ViewModel(), KoinComponent {
  val searchIngridientsModel: MutableLiveData<SearchIngridientsModel> =
      MutableLiveData(SearchIngridientsModel())

  var navArguments: Bundle? = null
}
