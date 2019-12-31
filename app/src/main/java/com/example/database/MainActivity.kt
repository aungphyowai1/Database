package com.example.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.room.Room
import com.example.database.Entity.BookEntity
import com.example.database.database1.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "BookDB").build()
        Thread {
            var bookEntity = BookEntity()
//            var book1:EditText= findViewById(R.id.et1).toString().toInt()
//            var book2:EditText=findViewById(R.id.et2)

            bookEntity.bookId=1
            bookEntity.bookName = "Developer"
            db.bookDao().saveBooks(bookEntity)
            db.bookDao().getAllBooks().forEach() {
                Log.i("Fetch Records", "Id::${it.bookId}")
                Log.i("Fetch Records", "Name::${it.bookName}")
            }
        }.start()
    }
}
