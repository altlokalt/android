package com.altlokaltsapplication.app.modules.interestpagethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.interestpagethree.`data`.model.InterestPageThreeModel
import org.koin.core.KoinComponent

class InterestPageThreeVM : ViewModel(), KoinComponent {
  val interestPageThreeModel: MutableLiveData<InterestPageThreeModel> =
      MutableLiveData(InterestPageThreeModel())

  var navArguments: Bundle? = null
}
