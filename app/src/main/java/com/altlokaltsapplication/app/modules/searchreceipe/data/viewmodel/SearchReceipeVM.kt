package com.altlokaltsapplication.app.modules.searchreceipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.searchreceipe.`data`.model.SearchReceipeModel
import org.koin.core.KoinComponent

class SearchReceipeVM : ViewModel(), KoinComponent {
  val searchReceipeModel: MutableLiveData<SearchReceipeModel> =
      MutableLiveData(SearchReceipeModel())

  var navArguments: Bundle? = null
}
