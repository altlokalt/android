package com.altlokaltsapplication.app.modules.guidesone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityGuidesOneBinding
import com.altlokaltsapplication.app.modules.guidesone.`data`.model.SpinnerNavbarModel
import com.altlokaltsapplication.app.modules.guidesone.`data`.viewmodel.GuidesOneVM
import com.altlokaltsapplication.app.modules.guidestwo.ui.GuidesTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GuidesOneActivity : BaseActivity<ActivityGuidesOneBinding>(R.layout.activity_guides_one) {
  private val viewModel: GuidesOneVM by viewModels<GuidesOneVM>()

  private val REQUEST_CODE_GUIDES_TWO_ACTIVITY: Int = 422


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerNavbarList.value = mutableListOf(
    SpinnerNavbarModel("Item1"),
    SpinnerNavbarModel("Item2"),
    SpinnerNavbarModel("Item3"),
    SpinnerNavbarModel("Item4"),
    SpinnerNavbarModel("Item5")
    )
    val spinnerNavbarAdapter =
    SpinnerNavbarAdapter(this,R.layout.spinner_item,viewModel.spinnerNavbarList.value?:
    mutableListOf())
    binding.spinnerNavbar.adapter = spinnerNavbarAdapter
    binding.guidesOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnComputer.setOnClickListener {
      val destIntent = GuidesTwoActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      startActivityForResult(destIntent, REQUEST_CODE_GUIDES_TWO_ACTIVITY)
      this.overridePendingTransition(R.anim.slide_up ,R.anim.slide_up )
    }
  }

  companion object {
    const val TAG: String = "GUIDES_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GuidesOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
