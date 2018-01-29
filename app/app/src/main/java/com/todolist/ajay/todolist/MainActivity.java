 package com.todolist.ajay.todolist;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {

     private ListView listView;
     private ArrayList<String > notes;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         listView = (ListView) findViewById(R.id.mylist);

         notes=new ArrayList<String>();

         notes.add("i love java");

         ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,notes);

         listView.setAdapter(arrayAdapter);


     }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         return super.onCreateOptionsMenu(menu);
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         return super.onOptionsItemSelected(item);
     }


 }
