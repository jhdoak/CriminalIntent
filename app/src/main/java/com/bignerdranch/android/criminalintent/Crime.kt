package com.bignerdranch.android.criminalintent

import java.util.*

class Crime {
    var mId: UUID = UUID.randomUUID()
        private set
    var mDate: Date = Date()
    var mSolved: Boolean = false
    lateinit var mTitle: String
}