package br.com.etecia.appsvegans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import br.com.etecia.appsvegans.MenuActivity;
import br.com.etecia.appsvegans.R;
import br.com.etecia.appsvegans.MenuActivity;

public class LoginActivity extends AppCompatActivity {
    Button btnEntrar, btnSair;
    TextInputEditText txtUsuario, txtSenha;
    TextView lblCadastraUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtSenha = findViewById(R.id.txtSenha);
        lblCadastraUsuario = findViewById(R.id.lblCadastrarUsuario);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;

                usuario = txtUsuario.getText().toString();
                senha = txtSenha.getText().toString();

                if (usuario.equals("Guilherme Silva") && senha.equals("Recicle")) {
                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}