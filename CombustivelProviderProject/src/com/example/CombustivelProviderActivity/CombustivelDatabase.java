package com.example.CombustivelProviderActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CombustivelDatabase extends SQLiteOpenHelper {
  
  static final String dbName = "combustivelDB";
  static final String combustivelTable = "combustivel";
  static final String colID = "_id";
  static final String colData = "data";
  static final String colOdometro = "odometro";
  static final String colLitros = "litros";
  static final String colCombustivel = "combustivel";
  static final int DATABASE_VERSION = 1;
  
  public CombustivelDatabase (Context context){
    super(context, dbName, null, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE " + combustivelDB + " ("
        colID + "INTEGER PRIMARY KEY , " + 
        colData + " DATE, " + 
        colOdometro + "  "
        )
  }


}

