package com.altlokaltsapplication.app.modules.onboarding.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityOnboardingBinding
import com.altlokaltsapplication.app.extensions.NoInternetConnection
import com.altlokaltsapplication.app.extensions.hideKeyboard
import com.altlokaltsapplication.app.extensions.showProgressDialog
import com.altlokaltsapplication.app.modules.home.ui.HomeActivity
import com.altlokaltsapplication.app.modules.interestpageone.ui.InterestPageOneActivity
import com.altlokaltsapplication.app.modules.onboarding.`data`.viewmodel.OnboardingVM
import com.altlokaltsapplication.app.modules.onboardingone.ui.OnboardingOneBottomsheet
import com.altlokaltsapplication.app.network.models.createlogin.CreateLoginResponse
import com.altlokaltsapplication.app.network.resources.ErrorResponse
import com.altlokaltsapplication.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnboardingActivity : BaseActivity<ActivityOnboardingBinding>(R.layout.activity_onboarding) {
  private val viewModel: OnboardingVM by viewModels<OnboardingVM>()

  private val REQUEST_CODE_INTEREST_PAGE_ONE_ACTIVITY: Int = 772

  private val REQUEST_CODE_HOME_ACTIVITY: Int = 143

  private val REQUEST_CODE_ONBOARDING_ONE_BOTTOMSHEET: Int = 240

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = InterestPageOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_INTEREST_PAGE_ONE_ACTIVITY)
      this.overridePendingTransition(R.anim.left_to_right ,R.anim.fade_out )
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnGetStarted.setOnClickListener {
      }
      binding.txtRecipeBook.setOnClickListener {
        this@OnboardingActivity.hideKeyboard()
        viewModel.callCreateLoginApi()
      }
      binding.imageImagePlacehold.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
        this.overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
      }
      binding.txtConfirmation.setOnClickListener {
        val destFragment = OnboardingOneBottomsheet.getInstance(null)
        destFragment.show(this.supportFragmentManager, OnboardingOneBottomsheet.TAG)
      }
    }

    override fun addObservers() {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@OnboardingActivity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@OnboardingActivity.showProgressDialog()
        } else  {
          progressDialog?.dismiss()
        }
      }
      viewModel.createLoginLiveData.observe(this@OnboardingActivity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateLogin(it)
        } else if(it is ErrorResponse)  {
          onErrorCreateLogin(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>) {
      viewModel.bindCreateLoginResponse(response.data)
    }

    private fun onErrorCreateLogin(exception: Exception) {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
      }
    }

    companion object {
      const val TAG: String = "ONBOARDING_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, OnboardingActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
