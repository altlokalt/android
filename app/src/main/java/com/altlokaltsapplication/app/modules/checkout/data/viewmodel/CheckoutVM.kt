package com.altlokaltsapplication.app.modules.checkout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.checkout.`data`.model.CheckoutModel
import com.altlokaltsapplication.app.modules.checkout.`data`.model.CheckoutRowModel
import com.altlokaltsapplication.app.modules.checkout.`data`.model.SpinnerArrowrightModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CheckoutVM : ViewModel(), KoinComponent {
  val checkoutModel: MutableLiveData<CheckoutModel> = MutableLiveData(CheckoutModel())

  var navArguments: Bundle? = null

  val spinnerArrowrightList: MutableLiveData<MutableList<SpinnerArrowrightModel>> =
      MutableLiveData()

  val checkoutList: MutableLiveData<MutableList<CheckoutRowModel>> =
      MutableLiveData(mutableListOf())
}
