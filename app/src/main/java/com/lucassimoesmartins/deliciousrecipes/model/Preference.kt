package com.lucassimoesmartins.deliciousrecipes.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Preference(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val diet: String = "",
    val intolerances: String = "",
    val excludeIngredients: String = ""
)