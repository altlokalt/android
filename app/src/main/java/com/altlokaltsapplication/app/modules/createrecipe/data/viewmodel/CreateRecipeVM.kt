package com.altlokaltsapplication.app.modules.createrecipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.createrecipe.`data`.model.CreateRecipeModel
import org.koin.core.KoinComponent

class CreateRecipeVM : ViewModel(), KoinComponent {
  val createRecipeModel: MutableLiveData<CreateRecipeModel> = MutableLiveData(CreateRecipeModel())

  var navArguments: Bundle? = null
}
