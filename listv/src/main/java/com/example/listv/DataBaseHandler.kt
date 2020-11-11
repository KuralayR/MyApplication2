package com.example.listv

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.ArrayMap
import android.widget.Toast

val DATABASE_NAME = "MyDB"
val TABLE_NAME = "Example"
val COL_NAME = "name"
val COL_ID = "id"

class DataBaseHandler(var context: Context):SQLiteOpenHelper(context, DATABASE_NAME, null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("CREATE TABLE $TABLE_NAME ($COL_ID  INTEGER PRIMARY KEY, $COL_NAME TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("drop table if exists $TABLE_NAME");
        onCreate(db)
    }

    fun insertData(example: Example){
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_ID, example.id)
        cv.put(COL_NAME, example.name)
        var result = db.insert(TABLE_NAME, null, cv)
        if (result == (-1).toLong()){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
        db.close()
    }

    fun getData():MutableList<Example>{
        var list: MutableList<Example> = ArrayList()
        val db = this.readableDatabase
        val query = "SELECT * FROM $TABLE_NAME"
        val result = db.rawQuery(query, null)
        if (result.moveToFirst()){
            do{
                var user = Example()
                user.id = result.getString(result.getColumnIndex(COL_ID)).toInt()
                user.name = result.getString(result.getColumnIndex(COL_NAME))
                list.add(user)
            } while (result.moveToFirst())

            }
        result.close()
        db.close()
        return list
    }



}