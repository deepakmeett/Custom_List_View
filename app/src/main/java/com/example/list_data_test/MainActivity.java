package com.example.list_data_test;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] proText  = {"Android", "Menu", "Contact"};
    Integer[] proImages = {R.drawable.ic_android_black_24dp, R.drawable.ic_apps_black_24dp, R.drawable.ic_assignment_ind_black_24dp};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        listView = findViewById( R.id.listitem );

        List_Adapter listAdapter = new List_Adapter( this, proText, proImages );
        listView.setAdapter( listAdapter );
        
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( MainActivity.this, proText[i]+ " List_Item clicked", Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    
}