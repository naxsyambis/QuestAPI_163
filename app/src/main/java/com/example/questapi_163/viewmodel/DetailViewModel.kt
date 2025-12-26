package com.example.questapi_163.viewmodel

import com.example.questapi_163.modeldata.DataSiswa


sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}