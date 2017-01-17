package com.example.testswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 *El adaptador crea y devuelve cada pagina (fragmento)
 */
public class Adaptador extends FragmentPagerAdapter {

	public Adaptador(FragmentManager fm) {
		super(fm);
	}

	@Override
	//Inicializa el fragmento correspondiente a cada una de las paginas,
	//dependiendo de su posicion
	public Fragment getItem(int position) {
		Fragment fragment = new Pagina(position);
		return fragment;
	}

	@Override
	//Indica el numero total de paginas existentes
	public int getCount() {
		return 3;
	}

}