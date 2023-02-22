package com.altlokaltsapplication.app.modules.detailingridientsreviews.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityDetailIngridientsReviewsBinding
import com.altlokaltsapplication.app.modules.createrecipe.ui.CreateRecipeActivity
import com.altlokaltsapplication.app.modules.detailingridientsreviews.`data`.viewmodel.DetailIngridientsReviewsVM
import com.altlokaltsapplication.app.modules.onboarding.ui.OnboardingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DetailIngridientsReviewsActivity :
    BaseActivity<ActivityDetailIngridientsReviewsBinding>(R.layout.activity_detail_ingridients_reviews)
    {
  private val viewModel: DetailIngridientsReviewsVM by viewModels<DetailIngridientsReviewsVM>()

  private val REQUEST_CODE_ONBOARDING_ACTIVITY: Int = 774

  private val REQUEST_CODE_CREATE_RECIPE_ACTIVITY: Int = 892

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailIngridientsReviewsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFavorite.setOnClickListener {
      val destIntent = OnboardingActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      startActivityForResult(destIntent, REQUEST_CODE_ONBOARDING_ACTIVITY)
      this.overridePendingTransition(R.anim.bounce ,R.anim.bounce )
    }
    binding.imageUpload.setOnClickListener {
      val destIntent = CreateRecipeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CREATE_RECIPE_ACTIVITY)
      this.overridePendingTransition(R.anim.right_to_left ,R.anim.fade_out )
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAIL_INGRIDIENTS_REVIEWS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailIngridientsReviewsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
