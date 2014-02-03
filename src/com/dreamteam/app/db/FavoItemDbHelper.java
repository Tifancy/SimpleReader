package com.dreamteam.app.db;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;


public class FavoItemDbHelper
{
	public static void insert(SQLiteDatabase db, String title, 
			String pubdate, String itemDetail, String link)
	{
		ContentValues values = new ContentValues();
		values.put("title", title);
		values.put("pubdate", pubdate);
		values.put("item_detail", itemDetail);
		values.put("link", link);
		db.insert("favorite_item", null, values);
		db.close();
	}
}