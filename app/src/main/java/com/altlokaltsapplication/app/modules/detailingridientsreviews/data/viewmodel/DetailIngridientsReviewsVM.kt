package com.altlokaltsapplication.app.modules.detailingridientsreviews.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.altlokaltsapplication.app.modules.detailingridientsreviews.`data`.model.DetailIngridientsReviewsModel
import org.koin.core.KoinComponent

class DetailIngridientsReviewsVM : ViewModel(), KoinComponent {
  val detailIngridientsReviewsModel: MutableLiveData<DetailIngridientsReviewsModel> =
      MutableLiveData(DetailIngridientsReviewsModel())

  var navArguments: Bundle? = null
}
