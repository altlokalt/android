package com.altlokaltsapplication.app.modules.cookexperimentfindreceipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.cookexperimentfindreceipe.`data`.model.CookExperimentFindReceipeModel
import org.koin.core.KoinComponent

class CookExperimentFindReceipeVM : ViewModel(), KoinComponent {
  val cookExperimentFindReceipeModel: MutableLiveData<CookExperimentFindReceipeModel> =
      MutableLiveData(CookExperimentFindReceipeModel())

  var navArguments: Bundle? = null
}
