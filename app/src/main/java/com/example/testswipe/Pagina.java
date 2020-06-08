package com.example.testswipe;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * El fragmento representa cada página, con todo su contenido
 */
public class Pagina extends Fragment {
	int posicion;
	Drawable imagen;
	
	public Pagina(int posicion, Drawable imagen) {
		this.posicion = posicion;
		this.imagen = imagen;
	}

	@Override
	//Crea el contenido del fragmento (equivale a onCreate() en la actividad)
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		//Crea un contenedor dentro del cual incluye un TextView y un ImageView
		LinearLayout root = new LinearLayout(getActivity());
		root.setOrientation(LinearLayout.VERTICAL);
		
		TextView tv = new TextView(getActivity());
		tv.setText("Posición: " + posicion);
		root.addView(tv);
		
		ImageView iv = new ImageView(getActivity());
		iv.setImageDrawable(imagen);
		root.addView(iv);
		
		return root;
	}
}