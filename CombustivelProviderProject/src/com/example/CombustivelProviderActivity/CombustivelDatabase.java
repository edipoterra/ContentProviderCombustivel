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
        colOdometro + "FLOAT, " + 
        colLitros + " FLOAT, " + 
        colCombustivel + " INTEGER)");
  }

  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS " + combustivelTable);
    onCreate(db);
  }

  void adicionaCombustivel(){
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put();
    cv.put();
    cv.put();
    db.insert(combustivelTable, colNome, cv);
    db.close();
  }

  int getPessoasCount(){
   SQLiteDatabase db=this.getWritableDatabase();
   Cursorursor cur= db.rawQuery("Select * from "+agendaTable, null);
   int x= cur.getCount();
   cur.close();
   return x;
  }

  Cursor getAllPessoas(){
    SQLiteDatabase db=this.getWritableDatabaseetWritableDatabase();
    Cursor cur= db.rawQuery("SELECT * FROM "+agendaTable,null);
    return cur;
  }

  public Cursor getPessoaPorNome(String nome)
  {
    SQLiteDatabase db=this.getReadableDatabase();
    String [)}) colunas=new String[]{colID,colNome,colAniversario,colFone};
    Cursor c=db.query(agendaTable, colAniversariounas, colNome+"=?", new String[){nome}, null, null, null);
    return c; 
  }

}

