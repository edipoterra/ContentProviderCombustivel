package com.example.CombustivelProviderActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class CombustivelProviderActivity extends Activity {
	protected EditText txtData;
	protected EditText txtOdometro;
	protected EditText txtLitros;
	//protected Spinner  comboCombustiveis;
	protected CombustivelDatabase dbCombustivel;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		
    }
}
