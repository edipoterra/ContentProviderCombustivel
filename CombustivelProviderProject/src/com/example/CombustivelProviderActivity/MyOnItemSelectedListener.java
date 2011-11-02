package com.example.CombustivelProviderActivity;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;
import android.view.View;

public class MyOnItemSelectedListener implements OnItemSelectedListener {
    public void onItemSelected(AdapterView<?> parent, 
        View view, int pos, long id){
        Toast.makeText(parent.getContext(), "Select" + ((Integer)pos).toString(),
            Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView parent){
        //Do nothing.
    }
}
