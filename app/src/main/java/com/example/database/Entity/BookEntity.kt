package com.example.database.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class BookEntity {
    @PrimaryKey
    @ColumnInfo(name = "BookId")
    var bookId: Int = 0
    @ColumnInfo(name = "BookName")
    var bookName: String = ""
}