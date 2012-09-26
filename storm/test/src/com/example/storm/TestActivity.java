package com.example.storm;

import com.example.storm.Database;

import android.app.Activity;

/**
 * Merely a holder for the Database annotation.
 * 
 * @author drfibonacci
 */
@Database(name = TestActivity.DB_NAME, version = TestActivity.DB_VERSION)
public class TestActivity extends Activity {

	public static final String DB_NAME = "testDb";
	public static final int DB_VERSION = 1;

}
