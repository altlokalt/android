package com.altlokaltsapplication.app.modules.videos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityVideosBinding
import com.altlokaltsapplication.app.modules.detailingridientsreviews.ui.DetailIngridientsReviewsActivity
import com.altlokaltsapplication.app.modules.videos.`data`.viewmodel.VideosVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VideosActivity : BaseActivity<ActivityVideosBinding>(R.layout.activity_videos) {
  private val viewModel: VideosVM by viewModels<VideosVM>()

  private val REQUEST_CODE_DETAIL_INGRIDIENTS_REVIEWS_ACTIVITY: Int = 170


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.videosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageUpload.setOnClickListener {
      val destIntent = DetailIngridientsReviewsActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
      startActivityForResult(destIntent, REQUEST_CODE_DETAIL_INGRIDIENTS_REVIEWS_ACTIVITY)
      this.overridePendingTransition(R.anim.right_to_left ,R.anim.left_to_right )
    }
  }

  companion object {
    const val TAG: String = "VIDEOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VideosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
