package com.example.aj.fragcolor;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.Fragmentone;
import layout.Fragmenttwo;

public class MainActivity extends AppCompatActivity implements Fragmentone.OnFragmentInteractionListener,Fragmenttwo.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Fragmentone obj = new Fragmentone();
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.activity_main,obj);
//        ft.commit();

    }

    @Override

    public void onFragmentInteraction(Uri uri) {

    }

    public void frag(View view)
    {
        if(view == findViewById(R.id.one))
        {
            Fragmentone obj = new Fragmentone();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.activity_main,obj);
            ft.commit();
        }
        else
        {
            Fragmenttwo obj = new Fragmenttwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.activity_main,obj);
            ft.commit();
        }
    }
}
