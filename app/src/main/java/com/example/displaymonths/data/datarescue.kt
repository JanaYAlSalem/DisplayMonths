package com.example.displaymonths.data
import com.example.displaymonths.R
import com.example.displaymonths.model.Months

class datarescue {
    fun loadAffirmations(): List<Months> {
        return listOf<Months>(
            Months(R.string.jan),
            Months(R.string.feb),
            Months(R.string.mar),
            Months(R.string.apr),
            Months(R.string.may),
            Months(R.string.jun),
            Months(R.string.july),
            Months(R.string.aug),
            Months(R.string.sep),
            Months(R.string.oct),
            Months(R.string.nov),
            Months(R.string.des)
            )
    } // end fun
}