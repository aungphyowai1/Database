package com.example.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.database.Entity.BookEntity
@Dao
interface BoolDAO {
    @Insert
    fun saveBooks(book: BookEntity)

    @Query("Select * from BookEntity")
    fun getAllBooks(): List<BookEntity>
}