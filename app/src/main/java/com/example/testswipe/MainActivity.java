package com.example.testswipe;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//La actividad debe utilizar como contenedor un ViewPager
		setContentView(R.layout.activity_main);

		//El ViewPager presentará las páginas (fragmentos) en la pantalla
		ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		
		//Crea un adaptador que devuelva cada una de las secciones (fragmentos)
		//y lo asigna al viewPager.
		//El Adaptador(FragmentPagerAdapter) proporciona los fragmentos para 
		//cada página.
		viewPager.setAdapter(new Adaptador(getSupportFragmentManager()));
		
	}

}
