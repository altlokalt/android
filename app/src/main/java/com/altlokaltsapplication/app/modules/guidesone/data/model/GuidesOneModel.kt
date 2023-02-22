package com.altlokaltsapplication.app.modules.guidesone.`data`.model

import com.altlokaltsapplication.app.R
import com.altlokaltsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GuidesOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShooPharDhie: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shoo_phar_dhie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.msg_top_10_foods_mu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShooPharDhieOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shoo_phar_dhie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZoneOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_10_foods_mu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
