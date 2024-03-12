package com.example.heroes

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    val name: String,
    val description: String,
    val ranking: Int,
    val superpower: String,
//    val image: String
//    val abilities: List<Ability>
) : Parcelable //{
//    data class Ability(
//        val name: String,
//        val power: Int)
//}
