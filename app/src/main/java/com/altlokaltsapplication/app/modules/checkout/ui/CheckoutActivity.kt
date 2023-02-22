package com.altlokaltsapplication.app.modules.checkout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityCheckoutBinding
import com.altlokaltsapplication.app.modules.checkout.`data`.model.CheckoutRowModel
import com.altlokaltsapplication.app.modules.checkout.`data`.model.SpinnerArrowrightModel
import com.altlokaltsapplication.app.modules.checkout.`data`.viewmodel.CheckoutVM
import com.altlokaltsapplication.app.modules.home.ui.HomeActivity
import com.altlokaltsapplication.app.modules.ordersucces.ui.OrderSuccesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CheckoutActivity : BaseActivity<ActivityCheckoutBinding>(R.layout.activity_checkout) {
  private val viewModel: CheckoutVM by viewModels<CheckoutVM>()

  private val REQUEST_CODE_HOME_ACTIVITY: Int = 260

  private val REQUEST_CODE_ORDER_SUCCES_ACTIVITY: Int = 171

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerArrowrightList.value = mutableListOf(
    SpinnerArrowrightModel("Item1"),
    SpinnerArrowrightModel("Item2"),
    SpinnerArrowrightModel("Item3"),
    SpinnerArrowrightModel("Item4"),
    SpinnerArrowrightModel("Item5")
    )
    val spinnerArrowrightAdapter =
    SpinnerArrowrightAdapter(this,R.layout.spinner_item,viewModel.spinnerArrowrightList.value?:
    mutableListOf())
    binding.spinnerArrowright.adapter = spinnerArrowrightAdapter
    val checkoutAdapter = CheckoutAdapter(viewModel.checkoutList.value?:mutableListOf())
    binding.recyclerCheckout.adapter = checkoutAdapter
    checkoutAdapter.setOnItemClickListener(
    object : CheckoutAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CheckoutRowModel) {
        onClickRecyclerCheckout(view, position, item)
      }
    }
    )
    viewModel.checkoutList.observe(this) {
      checkoutAdapter.updateData(it)
    }
    binding.checkoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
      this.overridePendingTransition(R.anim.right_to_left ,R.anim.fade_in )
    }
    binding.btnCheckout.setOnClickListener {
      val destIntent = OrderSuccesActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
      startActivityForResult(destIntent, REQUEST_CODE_ORDER_SUCCES_ACTIVITY)
      this.overridePendingTransition(R.anim.bounce ,R.anim.bounce )
    }
  }

  fun onClickRecyclerCheckout(
    view: View,
    position: Int,
    item: CheckoutRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHECKOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
