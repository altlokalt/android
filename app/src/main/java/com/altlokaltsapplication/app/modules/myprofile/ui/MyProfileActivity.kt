package com.altlokaltsapplication.app.modules.myprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityMyProfileBinding
import com.altlokaltsapplication.app.modules.myprofile.`data`.viewmodel.MyProfileVM
import com.altlokaltsapplication.app.modules.setting.ui.SettingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(R.layout.activity_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  private val REQUEST_CODE_SETTING_ACTIVITY: Int = 769

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageSettings.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SETTING_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
