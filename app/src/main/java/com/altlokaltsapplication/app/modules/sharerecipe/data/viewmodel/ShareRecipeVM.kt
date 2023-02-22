package com.altlokaltsapplication.app.modules.sharerecipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.sharerecipe.`data`.model.ShareRecipeModel
import com.altlokaltsapplication.app.modules.sharerecipe.`data`.model.ShareRecipeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShareRecipeVM : ViewModel(), KoinComponent {
  val shareRecipeModel: MutableLiveData<ShareRecipeModel> = MutableLiveData(ShareRecipeModel())

  var navArguments: Bundle? = null

  val shareRecipeList: MutableLiveData<MutableList<ShareRecipeRowModel>> =
      MutableLiveData(mutableListOf())
}
