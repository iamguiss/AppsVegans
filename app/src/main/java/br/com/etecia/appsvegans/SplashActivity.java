package br.com.etecia.appsvegans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.etecia.appsvegans.LoginActivity;
import br.com.etecia.appsvegans.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash__layout);

        //criando o carregamento da janela de login
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //abrindo a janela de login
                startActivity(new Intent(getApplicationContext(),
                        LoginActivity.class));
                finish();//fechando a janela atual
            }
        }, 3000);


    }
}