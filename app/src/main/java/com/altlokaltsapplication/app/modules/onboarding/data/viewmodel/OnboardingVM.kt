package com.altlokaltsapplication.app.modules.onboarding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altlokaltsapplication.app.appcomponents.utility.PreferenceHelper
import com.altlokaltsapplication.app.modules.onboarding.`data`.model.OnboardingModel
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginRequest
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginResponse
import com.altlokaltsapplication.app.network.repository.NetworkRepository
import com.altlokaltsapplication.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class OnboardingVM : ViewModel(), KoinComponent {
  val onboardingModel: MutableLiveData<OnboardingModel> = MutableLiveData(OnboardingModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateLoginApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      contentType = """application/json""",
          createLoginRequest = CreateLoginRequest()
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse) {
    val onboardingModelValue = onboardingModel.value ?:OnboardingModel()
    prefs.setTest(response.data)
    onboardingModel.value = onboardingModelValue
  }
}
