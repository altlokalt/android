package com.altlokaltsapplication.app.modules.setting.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivitySettingBinding
import com.altlokaltsapplication.app.modules.setting.`data`.viewmodel.SettingVM
import kotlin.String
import kotlin.Unit

class SettingActivity : BaseActivity<ActivitySettingBinding>(R.layout.activity_setting) {
  private val viewModel: SettingVM by viewModels<SettingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SETTING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
