package com.lucassimoesmartins.deliciousrecipes.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Result(
    @PrimaryKey
    val id: Int,
    val aggregateLikes: Int,
    val analyzedInstructions: List<AnalyzedInstruction>,
    val cheap: Boolean,
    val cookingMinutes: Int,
    val creditsText: String,
    val cuisines: List<String>,
    val dairyFree: Boolean,
    val diets: List<String>,
    val dishTypes: List<String>,
    val gaps: String,
    val glutenFree: Boolean,
    val healthScore: Int,
    val image: String,
    val imageType: String,
    val likes: Int,
    val lowFodmap: Boolean,
    val missedIngredientCount: Int,
    val missedIngredients: List<MissedIngredient>,
    val occasions: List<String>,
    val preparationMinutes: Int,
    val pricePerServing: Double,
    val readyInMinutes: Int,
    val servings: Int,
    val sourceName: String,
    val sourceUrl: String,
    val spoonacularScore: Int,
    val spoonacularSourceUrl: String,
    val sustainable: Boolean,
    val title: String,
    val unusedIngredients: List<Any>,
    val usedIngredientCount: Int,
    val usedIngredients: List<Any>,
    val vegan: Boolean,
    val vegetarian: Boolean,
    val veryHealthy: Boolean,
    val veryPopular: Boolean,
    val weightWatcherSmartPoints: Int,
    val winePairing: WinePairing
)