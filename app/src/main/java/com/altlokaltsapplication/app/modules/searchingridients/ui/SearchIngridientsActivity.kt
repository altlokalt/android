package com.altlokaltsapplication.app.modules.searchingridients.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivitySearchIngridientsBinding
import com.altlokaltsapplication.app.modules.searchingridients.`data`.viewmodel.SearchIngridientsVM
import kotlin.String
import kotlin.Unit

class SearchIngridientsActivity :
    BaseActivity<ActivitySearchIngridientsBinding>(R.layout.activity_search_ingridients) {
  private val viewModel: SearchIngridientsVM by viewModels<SearchIngridientsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchIngridientsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_INGRIDIENTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchIngridientsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
