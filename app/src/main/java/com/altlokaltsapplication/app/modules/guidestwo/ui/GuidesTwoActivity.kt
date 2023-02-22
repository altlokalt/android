package com.altlokaltsapplication.app.modules.guidestwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityGuidesTwoBinding
import com.altlokaltsapplication.app.modules.guidestwo.`data`.viewmodel.GuidesTwoVM
import com.altlokaltsapplication.app.modules.myfavourites.ui.MyFavouritesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GuidesTwoActivity : BaseActivity<ActivityGuidesTwoBinding>(R.layout.activity_guides_two) {
  private val viewModel: GuidesTwoVM by viewModels<GuidesTwoVM>()

  private val REQUEST_CODE_MY_FAVOURITES_ACTIVITY: Int = 728


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.guidesTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCalendar.setOnClickListener {
      val destIntent = MyFavouritesActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_FAVOURITES_ACTIVITY)
      this.overridePendingTransition(R.anim.zoom_in ,R.anim.zoom_in )
    }
    binding.imageUpload.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "GUIDES_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GuidesTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
