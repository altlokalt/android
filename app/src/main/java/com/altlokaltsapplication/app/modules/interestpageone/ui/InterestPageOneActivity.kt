package com.altlokaltsapplication.app.modules.interestpageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityInterestPageOneBinding
import com.altlokaltsapplication.app.modules.editavatar.ui.EditAvatarActivity
import com.altlokaltsapplication.app.modules.filterpreference.ui.FilterPreferenceBottomsheet
import com.altlokaltsapplication.app.modules.home.ui.HomeActivity
import com.altlokaltsapplication.app.modules.interestpageone.`data`.viewmodel.InterestPageOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestPageOneActivity :
    BaseActivity<ActivityInterestPageOneBinding>(R.layout.activity_interest_page_one) {
  private val viewModel: InterestPageOneVM by viewModels<InterestPageOneVM>()

  private val REQUEST_CODE_EDIT_AVATAR_ACTIVITY: Int = 248


  private val REQUEST_CODE_FILTER_PREFERENCE_BOTTOMSHEET: Int = 995


  private val REQUEST_CODE_HOME_ACTIVITY: Int = 252


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestPageOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSkip.setOnClickListener {
      val destIntent = EditAvatarActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_EDIT_AVATAR_ACTIVITY)
      this.overridePendingTransition(R.anim.left_to_right ,R.anim.left_to_right )
    }
    binding.progressBarProgress.setOnClickListener {
      finish()
    }
    binding.txtYesHidealla.setOnClickListener {
      val destFragment = FilterPreferenceBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, FilterPreferenceBottomsheet.TAG)
    }
    binding.txtNoShowallre.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
      this.overridePendingTransition(R.anim.right_to_left ,R.anim.right_to_left )
    }
  }

  companion object {
    const val TAG: String = "INTEREST_PAGE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InterestPageOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
