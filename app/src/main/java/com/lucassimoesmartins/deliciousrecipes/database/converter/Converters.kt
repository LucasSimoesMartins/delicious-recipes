package com.lucassimoesmartins.deliciousrecipes.database.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.lucassimoesmartins.deliciousrecipes.model.AnalyzedInstruction
import com.lucassimoesmartins.deliciousrecipes.model.MissedIngredient
import com.lucassimoesmartins.deliciousrecipes.model.WinePairing

class Converters {

    //AnalyzedInstructionList

    @TypeConverter
    fun jsonToAnalyzedInstructionList(json: String): List<AnalyzedInstruction> {
        return Gson().fromJson<List<AnalyzedInstruction>>(json, AnalyzedInstruction::class.java)
    }

    @TypeConverter
    fun analyzedInstructionListTojson(analyzedInstructionList: List<AnalyzedInstruction>): String {
        return Gson().toJson(analyzedInstructionList)
    }

    //StringList

    @TypeConverter
    fun jsonToStringList(json: String): List<String> {
        return Gson().fromJson<List<String>>(json, String::class.java)
    }

    @TypeConverter
    fun stringListToJson(stringList: List<String>): String {
        return Gson().toJson(stringList)
    }

    //MissedIngredientList

    @TypeConverter
    fun jsonToMissedIngredientList(json: String): List<MissedIngredient> {
        return Gson().fromJson<List<MissedIngredient>>(json, MissedIngredient::class.java)
    }

    @TypeConverter
    fun missedIngredientListTojson(missedIngredientList: List<MissedIngredient>): String {
        return Gson().toJson(missedIngredientList)
    }

    //AnyList

    @TypeConverter
    fun jsonToAnyList(json: String): List<Any> {
        return Gson().fromJson<List<Any>>(json, Any::class.java)
    }

    @TypeConverter
    fun anyListToJson(anyList: List<Any>) : String {
        return Gson().toJson(anyList)
    }

    //WinePairing

    @TypeConverter
    fun jsonToWinePairing(json: String): WinePairing {
        return Gson().fromJson(json, WinePairing::class.java)
    }

    @TypeConverter
    fun winePairingTojson(winePairing: WinePairing): String {
        return Gson().toJson(winePairing)
    }

}
