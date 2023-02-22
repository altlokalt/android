package com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityCookExperimentFitsReceipeBinding
import com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.model.AutoCompTxtRecipeyModel
import com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.viewmodel.CookExperimentFitsReceipeVM
import com.altlokaltsapplication.app.modules.searchingridients.ui.SearchIngridientsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CookExperimentFitsReceipeActivity :
    BaseActivity<ActivityCookExperimentFitsReceipeBinding>(R.layout.activity_cook_experiment_fits_receipe)
    {
  private val viewModel: CookExperimentFitsReceipeVM by viewModels<CookExperimentFitsReceipeVM>()

  private val REQUEST_CODE_SEARCH_INGRIDIENTS_ACTIVITY: Int = 448

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.autoCompTxtRecipeyList.value = mutableListOf(
    AutoCompTxtRecipeyModel("Item1"),
    AutoCompTxtRecipeyModel("Item2"),
    AutoCompTxtRecipeyModel("Item3"),
    AutoCompTxtRecipeyModel("Item4"),
    AutoCompTxtRecipeyModel("Item5")
    )
    val autoCompTxtRecipeyAdapter =
    AutoCompTxtRecipeyAdapter(this,R.layout.auto_text_item,viewModel.autoCompTxtRecipeyList.value?:
    mutableListOf())
    binding.autoCompTxtRecipey.setAdapter(autoCompTxtRecipeyAdapter)
    binding.autoCompTxtRecipey.threshold = 1
    binding.cookExperimentFitsReceipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameForm.setOnClickListener {
      val destIntent = SearchIngridientsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_SEARCH_INGRIDIENTS_ACTIVITY)
      this.overridePendingTransition(R.anim.slide_up ,R.anim.slide_down )
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COOK_EXPERIMENT_FITS_RECEIPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CookExperimentFitsReceipeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
