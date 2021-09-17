package com.muramsyah.gits.tugas12.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class University(
    var name: String? = "",
    var address: String? = "",
    var summary: String? = "",
    var web: String? = "",
    var telphone: String? = "",
    var photo: Int? = 0
) : Parcelable
