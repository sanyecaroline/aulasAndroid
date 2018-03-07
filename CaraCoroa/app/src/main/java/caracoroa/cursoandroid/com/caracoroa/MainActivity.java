package caracoroa.cursoandroid.com.caracoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.botaoJogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gerar número aleatório
                Random randomico = new Random();

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("opcao", opcao[randomico.nextInt(2)]);

                startActivity(intent);
            }
        });
    }
}
