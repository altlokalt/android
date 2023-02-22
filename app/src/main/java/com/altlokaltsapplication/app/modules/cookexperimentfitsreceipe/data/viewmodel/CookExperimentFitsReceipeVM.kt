package com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.model.AutoCompTxtRecipeyModel
import com.altlokaltsapplication.app.modules.cookexperimentfitsreceipe.`data`.model.CookExperimentFitsReceipeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CookExperimentFitsReceipeVM : ViewModel(), KoinComponent {
  val cookExperimentFitsReceipeModel: MutableLiveData<CookExperimentFitsReceipeModel> =
      MutableLiveData(CookExperimentFitsReceipeModel())

  var navArguments: Bundle? = null

  val autoCompTxtRecipeyList: MutableLiveData<MutableList<AutoCompTxtRecipeyModel>> =
      MutableLiveData()
}
