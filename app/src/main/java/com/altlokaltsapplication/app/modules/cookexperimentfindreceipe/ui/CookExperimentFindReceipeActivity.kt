package com.altlokaltsapplication.app.modules.cookexperimentfindreceipe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityCookExperimentFindReceipeBinding
import com.altlokaltsapplication.app.modules.cookexperimentfindreceipe.`data`.viewmodel.CookExperimentFindReceipeVM
import com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.ui.CookExperimentFitsReceipeActivity
import com.altlokaltsapplication.app.modules.searchreceipe.ui.SearchReceipeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CookExperimentFindReceipeActivity :
    BaseActivity<ActivityCookExperimentFindReceipeBinding>(R.layout.activity_cook_experiment_find_receipe)
    {
  private val viewModel: CookExperimentFindReceipeVM by viewModels<CookExperimentFindReceipeVM>()

  private val REQUEST_CODE_SEARCH_RECEIPE_ACTIVITY: Int = 487

  private val REQUEST_CODE_COOK_EXPERIMENT_FITS_RECEIPE_ACTIVITY: Int = 526

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cookExperimentFindReceipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearForm.setOnClickListener {
      val destIntent = SearchReceipeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SEARCH_RECEIPE_ACTIVITY)
      this.overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
    }
    binding.btnFindRecipe.setOnClickListener {
      val destIntent = CookExperimentFitsReceipeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_COOK_EXPERIMENT_FITS_RECEIPE_ACTIVITY)
      this.overridePendingTransition(R.anim.blink ,R.anim.bounce )
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COOK_EXPERIMENT_FIND_RECEIPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CookExperimentFindReceipeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
