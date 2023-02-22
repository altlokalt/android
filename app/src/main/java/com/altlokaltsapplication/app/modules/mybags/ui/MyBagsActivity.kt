package com.altlokaltsapplication.app.modules.mybags.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityMyBagsBinding
import com.altlokaltsapplication.app.modules.mybags.`data`.model.MyBagsRowModel
import com.altlokaltsapplication.app.modules.mybags.`data`.viewmodel.MyBagsVM
import com.altlokaltsapplication.app.modules.videos.ui.VideosActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyBagsActivity : BaseActivity<ActivityMyBagsBinding>(R.layout.activity_my_bags) {
  private val viewModel: MyBagsVM by viewModels<MyBagsVM>()

  private val REQUEST_CODE_VIDEOS_ACTIVITY: Int = 615


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val myBagsAdapter = MyBagsAdapter(viewModel.myBagsList.value?:mutableListOf())
    binding.recyclerMyBags.adapter = myBagsAdapter
    myBagsAdapter.setOnItemClickListener(
    object : MyBagsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyBagsRowModel) {
        onClickRecyclerMyBags(view, position, item)
      }
    }
    )
    viewModel.myBagsList.observe(this) {
      myBagsAdapter.updateData(it)
    }
    binding.myBagsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnComputerOne.setOnClickListener {
      val destIntent = VideosActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_VIDEOS_ACTIVITY)
      this.overridePendingTransition(R.anim.fade_out ,R.anim.fade_in )
    }
    binding.imageUpload.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMyBags(
    view: View,
    position: Int,
    item: MyBagsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_BAGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyBagsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
