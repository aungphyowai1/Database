package com.example.database.database1

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.database.Entity.BookEntity
import com.example.database.dao.BoolDAO

@Database(entities = [(BookEntity::class)],version = 1)
abstract class AppDatabase :RoomDatabase(){
    abstract fun bookDao(): BoolDAO

}