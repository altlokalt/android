package com.altlokaltsapplication.app.modules.ordersucces.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityOrderSuccesBinding
import com.altlokaltsapplication.app.extensions.loadFragment
import com.altlokaltsapplication.app.modules.ordersucces.`data`.viewmodel.OrderSuccesVM
import com.altlokaltsapplication.app.modules.videoframe.ui.VideoframeFragment
import kotlin.String
import kotlin.Unit

class OrderSuccesActivity : BaseActivity<ActivityOrderSuccesBinding>(R.layout.activity_order_succes)
    {
  private val viewModel: OrderSuccesVM by viewModels<OrderSuccesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.orderSuccesVM = viewModel
    val destFragment = VideoframeFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = VideoframeFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ORDER_SUCCES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderSuccesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
