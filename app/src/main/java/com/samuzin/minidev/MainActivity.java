package com.samuzin.minidev;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mostrarMenu();
    }

    void mostrarMenu() {
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(20, 20, 30));

        TextView titulo = new TextView(this);
        titulo.setText("MiniDev");
        titulo.setTextSize(32);
        titulo.setTextColor(Color.WHITE);
        titulo.setGravity(Gravity.CENTER);
        layout.addView(titulo);

        adicionarBotao("Criar arquivo", "Em breve: criação de arquivos!");
        adicionarBotao("Informações", "MiniDev funcionando!");
        adicionarBotao("Sobre", "Seu primeiro aplicativo Android.");

        setContentView(layout);
    }

    void adicionarBotao(String nome, String mensagem) {
        Button botao = new Button(this);
        botao.setText(nome);
        botao.setOnClickListener(v ->
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
        );

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            );
        params.setMargins(0, 12, 0, 12);
        layout.addView(botao, params);
    }
          }
