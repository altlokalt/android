package com.altlokaltsapplication.app.modules.interestpagetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.interestpagetwo.`data`.model.InterestPageTwoModel
import org.koin.core.KoinComponent

class InterestPageTwoVM : ViewModel(), KoinComponent {
  val interestPageTwoModel: MutableLiveData<InterestPageTwoModel> =
      MutableLiveData(InterestPageTwoModel())

  var navArguments: Bundle? = null
}
