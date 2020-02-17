package com.lucassimoesmartins.deliciousrecipes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lucassimoesmartins.deliciousrecipes.constants.Constants
import com.lucassimoesmartins.deliciousrecipes.database.dao.RecipeDAO
import com.lucassimoesmartins.deliciousrecipes.model.Preference
import com.lucassimoesmartins.deliciousrecipes.model.Result

@Database(
    entities = [Result::class, Preference::class],
    version = Constants.DATABASE_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract val dao: RecipeDAO

    companion object {
        private lateinit var db: AppDatabase

        fun getInstance(context: Context): AppDatabase {

            if (::db.isInitialized) return db

            db = Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                Constants.DATABASE_NAME
            ).build()

            return db
        }
    }

}