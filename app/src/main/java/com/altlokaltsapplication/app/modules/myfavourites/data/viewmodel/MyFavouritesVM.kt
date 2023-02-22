package com.altlokaltsapplication.app.modules.myfavourites.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.myfavourites.`data`.model.MyFavouritesModel
import com.altlokaltsapplication.app.modules.myfavourites.`data`.model.MyFavouritesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyFavouritesVM : ViewModel(), KoinComponent {
  val myFavouritesModel: MutableLiveData<MyFavouritesModel> = MutableLiveData(MyFavouritesModel())

  var navArguments: Bundle? = null

  val myFavouritesList: MutableLiveData<MutableList<MyFavouritesRowModel>> =
      MutableLiveData(mutableListOf())
}
