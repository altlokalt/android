package com.altlokaltsapplication.app.modules.interestpagethree.ui

import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityInterestPageThreeBinding
import com.altlokaltsapplication.app.modules.interestpagethree.`data`.viewmodel.InterestPageThreeVM
import kotlin.String
import kotlin.Unit

class InterestPageThreeActivity :
    BaseActivity<ActivityInterestPageThreeBinding>(R.layout.activity_interest_page_three) {
  private val viewModel: InterestPageThreeVM by viewModels<InterestPageThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestPageThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INTEREST_PAGE_THREE_ACTIVITY"

  }
}
