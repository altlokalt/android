package com.altlokaltsapplication.app.modules.ordersucces.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.ordersucces.`data`.model.OrderSuccesModel
import org.koin.core.KoinComponent

class OrderSuccesVM : ViewModel(), KoinComponent {
  val orderSuccesModel: MutableLiveData<OrderSuccesModel> = MutableLiveData(OrderSuccesModel())

  var navArguments: Bundle? = null
}
