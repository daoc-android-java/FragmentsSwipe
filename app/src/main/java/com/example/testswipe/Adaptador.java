package com.example.testswipe;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 *El adaptador crea y devuelve cada página (fragmento)
 */
public class Adaptador extends FragmentPagerAdapter {
	private final Drawable[] elementos;

	public Adaptador(FragmentManager fm, Drawable[] elementos) {
		super(fm);
		this.elementos = elementos;
	}

	@Override
	//Inicializa el fragmento correspondiente a cada una de las páginas,
	//dependiendo de su posicion
	public Fragment getItem(int position) {
		Fragment fragment = new Pagina(position, elementos[position]);
		return fragment;
	}

	@Override
	//Indica el numero total de paginas existentes
	public int getCount() {
		return elementos.length;
	}

}