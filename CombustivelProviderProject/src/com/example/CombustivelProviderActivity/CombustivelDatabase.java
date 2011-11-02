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
    	db.execSQL("CREATE TABLE " + combustivelTable + " ("
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

  	void adicionaCombustivel(CombustivelProviderActivity combustivel){
	   	SQLiteDatabase db = this.getWritableDatabase();
    	ContentValues cv = new ContentValues();
    	cv.put(colData, combustivel.getData());
    	cv.put(colOdometro, combustivel.getOdometro());
    	cv.put(colLitros, combustivel.getLitros());
		cv.put(colCombustivel, combustivel.getCombustivel());
    	db.insert(combustivelTable, colData, cv);
    	db.close();
  	}

  	Cursor getAllCombustivel(){
    	SQLiteDatabase db=this.getWritableDatabaseetWritableDatabase();
    	Cursor cur= db.rawQuery("SELECT * FROM "+ combustivelTable,null);
	    return cur;
  	}

	public int atualizaCombustivel(CombustivelProviderActivity combustivel){
		SQLiteDatabase db=this.getWritableDatabase();
		ContentValues cv = new ContentValues();
    	cv.put(colData, combustivel.getData());
    	cv.put(colOdometro, combustivel.getOdometro());
    	cv.put(colLitros, combustivel.getLitros());
		cv.put(colCombustivel, combustivel.getCombustivel());		
		return db.update(combustivelTable, cv, colID+"=?", new String []{String.valueOf(combustivel.get_id())}); 
	}
	 
	public void removeCombustivel(CombustivelProviderActivity combustivel){
		SQLiteDatabase db=this.getWritableDatabase();
		db.delete(combustivelTable,colID+"=?", new String [] {String.valueOf(combustivel.get_id())});
		db.close();
	}


}

