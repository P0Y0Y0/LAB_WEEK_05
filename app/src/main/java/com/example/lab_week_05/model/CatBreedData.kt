package com.example.lab_week_05.model

import android.health.connect.datatypes.units.Temperature
import com.squareup.moshi.Json

data class CatBreedData (
    @field:Json(name = "name") val name: String?,
    @field:Json(name = "temperature") val temperature: String?
)