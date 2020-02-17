package com.lucassimoesmartins.deliciousrecipes.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.lucassimoesmartins.deliciousrecipes.model.Preference

@Dao
interface RecipeDAO {

    @Query("SELECT * FROM Preference ORDER BY id DESC")
    fun getPreferences() : LiveData<List<Preference>>

}