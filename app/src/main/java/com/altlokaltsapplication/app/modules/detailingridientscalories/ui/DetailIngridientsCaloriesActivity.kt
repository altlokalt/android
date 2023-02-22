package com.altlokaltsapplication.app.modules.detailingridientscalories.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityDetailIngridientsCaloriesBinding
import com.altlokaltsapplication.app.modules.detailingridientscalories.`data`.viewmodel.DetailIngridientsCaloriesVM
import com.altlokaltsapplication.app.modules.detailingridientssteps.ui.DetailIngridientsStepsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DetailIngridientsCaloriesActivity :
    BaseActivity<ActivityDetailIngridientsCaloriesBinding>(R.layout.activity_detail_ingridients_calories)
    {
  private val viewModel: DetailIngridientsCaloriesVM by viewModels<DetailIngridientsCaloriesVM>()

  private val REQUEST_CODE_DETAIL_INGRIDIENTS_STEPS_ACTIVITY: Int = 214


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailIngridientsCaloriesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePlus.setOnClickListener {
      val destIntent = DetailIngridientsStepsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DETAIL_INGRIDIENTS_STEPS_ACTIVITY)
      this.overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAIL_INGRIDIENTS_CALORIES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailIngridientsCaloriesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
