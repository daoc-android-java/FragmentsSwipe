package com.example.testswipe;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * El fragmento representa cada página, con todo su contenido
 */
public class Pagina extends Fragment {
	int posicion;
	
	public Pagina(int i) {
		posicion = i;
	}

	@Override
	//Crea el contenido del fragmento (equivale a onCreate() en la actividad)
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		//Crea un contenedor dentro del cual incluye un TewxtView y un Button
		LinearLayout root = new LinearLayout(getActivity());
		root.setOrientation(LinearLayout.VERTICAL);
		
		TextView tv = new TextView(getActivity());
		tv.setText("Posicion: " + posicion);
		root.addView(tv);
		
		Button b = new Button(getActivity());
		b.setText("Botón " + tv.getText());
		//Permite al botón reaccionar al click
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				new AlertDialog.Builder(getActivity()).setMessage("Botón de la pagina " + posicion).show();
			}
			
		});
		root.addView(b);
		
		return root;
	}
}