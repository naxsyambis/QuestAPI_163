package com.example.questapi_163.viewmodel

import com.example.questapi_163.modeldata.DataSiswa


sealed interface StatusUiSiswa {
    data class Success(val listSiswa: List<DataSiswa>) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}
