package com.example.luisa.pruebaarquitectura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("GaleriaOnResume","On resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("GaleriaOnStart","On start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("GaleriaOnDestroy","On destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf("GaleriaOnRestart","On restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("GaleriaOnStop","On Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("GaleriaOnPause","On Pause");
    }
}
