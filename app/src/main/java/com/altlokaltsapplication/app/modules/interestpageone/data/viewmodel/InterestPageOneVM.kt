package com.altlokaltsapplication.app.modules.interestpageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.interestpageone.`data`.model.InterestPageOneModel
import org.koin.core.KoinComponent

class InterestPageOneVM : ViewModel(), KoinComponent {
  val interestPageOneModel: MutableLiveData<InterestPageOneModel> =
      MutableLiveData(InterestPageOneModel())

  var navArguments: Bundle? = null
}
