package com.example.myapplication;



import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private ActionBar toolbar

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        listView = (ListView) findViewById(R.id.listview);
//
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        arrayList.add("android");
//        arrayList.add("B");
//        arrayList.add("C");
//        arrayList.add("D");
//        arrayList.add("E");
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
//
//
//        listView.setAdapter(arrayAdapter);

//        toolbar = getSupportActionBar();

        BottomNavigationView navigation = findViewById(R.id.navigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.transparent));

//        toolbar.setTitle("Uno");
//        loadFragment(new UnoFragment());

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                switch (item.getItemId()) {
                    case R.id.uno:
    //                    toolbar.setTitle("Uno");
                        loadFragment(new UnoFragment());
                        return true;
                    case R.id.dos:
    //                    toolbar.setTitle("Dos");
                        loadFragment(new DosFragment());
                        return true;
                    case R.id.tres:
    //                    toolbar.setTitle("Tres");
                        loadFragment(new TresFragment());
                        return true;
                    case R.id.cautro:
    //                    toolbar.setTitle("Cautro");
                        loadFragment(new CautroFragment());
                        return true;
                }
                return false;
            };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

}