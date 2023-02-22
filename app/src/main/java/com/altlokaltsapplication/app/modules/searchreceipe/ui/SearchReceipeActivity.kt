package com.altlokaltsapplication.app.modules.searchreceipe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivitySearchReceipeBinding
import com.altlokaltsapplication.app.modules.searchreceipe.`data`.viewmodel.SearchReceipeVM
import kotlin.String
import kotlin.Unit

class SearchReceipeActivity :
    BaseActivity<ActivitySearchReceipeBinding>(R.layout.activity_search_receipe) {
  private val viewModel: SearchReceipeVM by viewModels<SearchReceipeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchReceipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_RECEIPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchReceipeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
