package com.example.luisa.pruebaarquitectura;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginET, passET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginET= findViewById(R.id.login);
        passET= findViewById(R.id.pass);
        Log.wtf("MainOnCreate","On Create");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("MainOnResumen","On resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("MainOnStart","On start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("MainOnDestroy","On destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf("MainOnRestart","On restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("MainOnStop","On Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("MainOnPause","On Pause");
    }

    public void olvide(View view){
            Snackbar snackbar= Snackbar.make(view, R.string.sncakbar_notification,Snackbar.LENGTH_LONG)
                    .setAction(R.string.snackbar_action, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, R.string.toast_text,Toast.LENGTH_LONG).show();
                        }
                    });

            snackbar.setActionTextColor(getResources().getColor(R.color.colorAccent));
            View snackBarView= snackbar.getView();
            snackBarView.setBackgroundColor(getColor(R.color.colorPrimary));
            snackbar.show();
        }

    public void irGaleria(View view){

        if(passET.getText().toString().equals("") || loginET.getText().toString().equals("")){
            Toast toast= Toast.makeText(MainActivity.this, R.string.login_toast,Toast.LENGTH_LONG);
            toast.show();
        }else {
            Intent intent = new Intent(this, Galeria.class);
            startActivity(intent);
        }

    }
}
