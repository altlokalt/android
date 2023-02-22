package com.altlokaltsapplication.app.modules.onboardingone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.onboardingone.`data`.model.OnboardingOneModel
import org.koin.core.KoinComponent

class OnboardingOneVM : ViewModel(), KoinComponent {
  val onboardingOneModel: MutableLiveData<OnboardingOneModel> =
      MutableLiveData(OnboardingOneModel())

  var navArguments: Bundle? = null
}
