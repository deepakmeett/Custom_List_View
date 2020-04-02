package com.example.list_data_test;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
public class List_Adapter extends ArrayAdapter<String> {

    Activity context;
    String[] proText;
    Integer[] proImages;

    public List_Adapter(@NonNull Activity context, String[] proText, Integer[] proImages) {
        super( context, R.layout.activity_main, proText );
        this.context = context;
        this.proImages = proImages;
        this.proText = proText;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate( R.layout.list_item, null, true );
        TextView textView = view.findViewById( R.id.listText );
        ImageView imageView = view.findViewById( R.id.listImage );
        textView.setText( proText[position] );
        imageView.setImageResource( proImages[position] );
        
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( context, proText[position]+ " Image clicked", Toast.LENGTH_SHORT ).show();
            }
        } );

        textView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( context, proText[position]+ " Text clicked", Toast.LENGTH_SHORT ).show();
            }
        } );
        
        return view;
    }
}