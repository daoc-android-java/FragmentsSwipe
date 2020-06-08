package com.example.testswipe;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

//OJO: extends FragmentActivity
public class MainActivity extends FragmentActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//La actividad debe utilizar como contenedor un ViewPager
		setContentView(R.layout.activity_main);

		Drawable[] elementos = new Drawable[] {
				getResources().getDrawable(R.drawable.cebra, getTheme()),
				getResources().getDrawable(R.drawable.liebre, getTheme()),
				getResources().getDrawable(R.drawable.mapache, getTheme()),
				getResources().getDrawable(R.drawable.oso, getTheme()),
				getResources().getDrawable(R.drawable.rinoceronte, getTheme()),
				getResources().getDrawable(R.drawable.tigre, getTheme())};

		//El ViewPager presentará las páginas (fragmentos) en la pantalla
		ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		
		//Crea un adaptador que devuelva cada una de las secciones (fragmentos)
		//y lo asigna al viewPager.
		//El Adaptador(FragmentPagerAdapter) proporciona los fragmentos para 
		//cada página.
		viewPager.setAdapter(new Adaptador(getSupportFragmentManager(), elementos));
	}

}
