package com.altlokaltsapplication.app.modules.mybags.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.mybags.`data`.model.MyBagsModel
import com.altlokaltsapplication.app.modules.mybags.`data`.model.MyBagsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyBagsVM : ViewModel(), KoinComponent {
  val myBagsModel: MutableLiveData<MyBagsModel> = MutableLiveData(MyBagsModel())

  var navArguments: Bundle? = null

  val myBagsList: MutableLiveData<MutableList<MyBagsRowModel>> = MutableLiveData(mutableListOf())
}
