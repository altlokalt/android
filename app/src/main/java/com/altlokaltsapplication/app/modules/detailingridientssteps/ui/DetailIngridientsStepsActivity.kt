package com.altlokaltsapplication.app.modules.detailingridientssteps.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityDetailIngridientsStepsBinding
import com.altlokaltsapplication.app.modules.detailingridientsreviews.ui.DetailIngridientsReviewsActivity
import com.altlokaltsapplication.app.modules.detailingridientssteps.`data`.viewmodel.DetailIngridientsStepsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DetailIngridientsStepsActivity :
    BaseActivity<ActivityDetailIngridientsStepsBinding>(R.layout.activity_detail_ingridients_steps)
    {
  private val viewModel: DetailIngridientsStepsVM by viewModels<DetailIngridientsStepsVM>()

  private val REQUEST_CODE_DETAIL_INGRIDIENTS_REVIEWS_ACTIVITY: Int = 733


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailIngridientsStepsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePlus.setOnClickListener {
      val destIntent = DetailIngridientsReviewsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DETAIL_INGRIDIENTS_REVIEWS_ACTIVITY)
      this.overridePendingTransition(R.anim.blink ,R.anim.blink )
    }
    binding.imageUpload.setOnClickListener {
      val destIntent = DetailIngridientsReviewsActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      startActivityForResult(destIntent, REQUEST_CODE_DETAIL_INGRIDIENTS_REVIEWS_ACTIVITY)
      this.overridePendingTransition(R.anim.fade_out ,R.anim.slide_up )
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAIL_INGRIDIENTS_STEPS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailIngridientsStepsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
