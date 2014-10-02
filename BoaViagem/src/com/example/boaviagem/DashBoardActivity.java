package com.example.boaviagem;


import com.example.boaviagem.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashBoardActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	}

	public void selececionarOpcao(View view) {
		/*
		 * com base na view que foi clicada iremos tomar a ação correta
		 */

		TextView textView = ( TextView ) view ;
		String opcao = "Opção: " + textView . getText (). toString (); 
		Toast.makeText( this ,opcao, Toast.LENGTH_LONG ). show (); 
	}
}
