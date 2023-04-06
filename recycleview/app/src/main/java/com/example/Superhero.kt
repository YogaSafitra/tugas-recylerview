package com.example

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: int,
    val nameSuperhero: string,
    val descSuperhero: string

) : Parcelable
