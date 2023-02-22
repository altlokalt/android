package com.altlokaltsapplication.app.modules.myfavourites.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.base.BaseActivity
import com.altlokaltsapplication.app.databinding.ActivityMyFavouritesBinding
import com.altlokaltsapplication.app.modules.detailingridientscalories.ui.DetailIngridientsCaloriesActivity
import com.altlokaltsapplication.app.modules.mybags.ui.MyBagsActivity
import com.altlokaltsapplication.app.modules.myfavourites.`data`.model.MyFavouritesRowModel
import com.altlokaltsapplication.app.modules.myfavourites.`data`.viewmodel.MyFavouritesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyFavouritesActivity :
    BaseActivity<ActivityMyFavouritesBinding>(R.layout.activity_my_favourites) {
  private val viewModel: MyFavouritesVM by viewModels<MyFavouritesVM>()

  private val REQUEST_CODE_DETAIL_INGRIDIENTS_CALORIES_ACTIVITY: Int = 753

  private val REQUEST_CODE_MY_BAGS_ACTIVITY: Int = 384

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val myFavouritesAdapter =
    MyFavouritesAdapter(viewModel.myFavouritesList.value?:mutableListOf())
    binding.recyclerMyFavourites.adapter = myFavouritesAdapter
    myFavouritesAdapter.setOnItemClickListener(
    object : MyFavouritesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyFavouritesRowModel) {
        onClickRecyclerMyFavourites(view, position, item)
      }
    }
    )
    viewModel.myFavouritesList.observe(this) {
      myFavouritesAdapter.updateData(it)
    }
    binding.myFavouritesVM = viewModel
    setUpSearchViewFormListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnGrid.setOnClickListener {
      val destIntent = DetailIngridientsCaloriesActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
      startActivityForResult(destIntent, REQUEST_CODE_DETAIL_INGRIDIENTS_CALORIES_ACTIVITY)
      this.overridePendingTransition(R.anim.bounce ,R.anim.bounce )
    }
    binding.btnFavorite.setOnClickListener {
      val destIntent = MyBagsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_BAGS_ACTIVITY)
      this.overridePendingTransition(R.anim.left_to_right ,R.anim.left_to_right )
    }
  }

  fun onClickRecyclerMyFavourites(
    view: View,
    position: Int,
    item: MyFavouritesRowModel
  ): Unit {
    when(view.id) {
      R.id.btnSeeAll ->  {
        finish()
      }
    }
  }

  private fun setUpSearchViewFormListener(): Unit {
    binding.searchViewForm.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MY_FAVOURITES_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, MyFavouritesActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
