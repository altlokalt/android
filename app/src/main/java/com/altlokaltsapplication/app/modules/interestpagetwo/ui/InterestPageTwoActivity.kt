package com.altlokaltsapplication.app.modules.interestpagetwo.ui

import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityInterestPageTwoBinding
import com.altlokaltsapplication.app.modules.interestpagetwo.`data`.viewmodel.InterestPageTwoVM
import kotlin.String
import kotlin.Unit

class InterestPageTwoActivity :
    BaseActivity<ActivityInterestPageTwoBinding>(R.layout.activity_interest_page_two) {
  private val viewModel: InterestPageTwoVM by viewModels<InterestPageTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestPageTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INTEREST_PAGE_TWO_ACTIVITY"

  }
}
