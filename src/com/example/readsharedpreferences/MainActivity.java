package com.example.readsharedpreferences;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
 public void onCreate(Bundle savedInstanceState){
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 SharePreferences accessPreferences,loginPreference;
	 Context appContext=null;
	 try{
		 appContext=createPackageContext("com.exanple.readshared",
				 Context.CONTEXT_IGNORE_SECURITY);
		 
	 }catch(Exception e){
		 e.printStackTrace();
		 
	 }
	 accessPreferences=appContext.getSharedPreferences("access", Context.MODE_WORLD_READABLE);
	 String name=loginPreferences.getString("name",null);
	 Toast.makeText(this, "你好," +name+",SavedLoginInfo应用程序已经被" +
	 		"使用了"+count+"次！",Toast.LENGTH_LONG).show();
	}

}
