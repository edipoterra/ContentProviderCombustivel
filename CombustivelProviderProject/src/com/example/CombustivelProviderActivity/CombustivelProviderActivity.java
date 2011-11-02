package com.example.CombustivelProviderActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import java.util.Date;
import android.database.Cursor;
import com.example.CombustivelProviderActivity.Combustivel;

public class CombustivelProviderActivity extends Activity{
	  protected EditText txtData;
	  protected EditText txtOdometro;
	  protected EditText txtLitros;
	  protected Spinner  comboCombustiveis;
    protected int indice;

	  protected CombustivelDatabase dbCombustivel;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        txtData = (EditText) findViewById(R.id.editData);
        txtOdometro = (EditText) findViewById(R.id.editOdometro);
        txtLitros = (EditText) findViewById(R.id.editLitros);

        comboCombustiveis = (Spinner) findViewById(R.id.comboCombus);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
            this, R.array.combus_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        comboCombustiveis.setAdapter(adapter);
        comboCombustiveis.setOnItemSelectedListener(new MyOnItemSelectedListener());
    }

    public void gravarCombustivel(View view){
        Combustivel combs = new Combustivel(
            txtData.getText().toString(), 
            Float.parseFloat(txtOdometro.getText().toString()), 
            Float.parseFloat(txtLitros.getText().toString()), 
            comboCombustiveis.getSelectedItemPosition());
        dbCombustivel.adicionaCombustivel(combs);

        txtData.setText("");
        txtOdometro.setText("");
        txtLitros.setText("");
        comboCombustiveis.setSelection(0);

        Toast.makeText(this,
            "Gravando registro " + ((Integer)comboCombustiveis.getSelectedItemPosition()).toString(),
            Toast.LENGTH_SHORT).show();
    }

    public void excluirCombustivel(View view){

        Toast.makeText(this,
            "Excluindo registro",
            Toast.LENGTH_SHORT).show();
    }
    

}
