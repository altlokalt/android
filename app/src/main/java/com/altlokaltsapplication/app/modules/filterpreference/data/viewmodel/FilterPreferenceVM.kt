package com.altlokaltsapplication.app.modules.filterpreference.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.FilterPreferenceModel
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.ListtabOneTwoRowModel
import com.altlokaltsapplication.app.modules.filterpreference.`data`.model.ListtabRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FilterPreferenceVM : ViewModel(), KoinComponent {
  val filterPreferenceModel: MutableLiveData<FilterPreferenceModel> =
      MutableLiveData(FilterPreferenceModel())

  var navArguments: Bundle? = null

  val listtabList: MutableLiveData<MutableList<ListtabRowModel>> = MutableLiveData(mutableListOf())

  val listtabOneTwoList: MutableLiveData<MutableList<ListtabOneTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
