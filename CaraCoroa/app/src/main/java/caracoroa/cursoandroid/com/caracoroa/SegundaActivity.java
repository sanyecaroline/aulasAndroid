package caracoroa.cursoandroid.com.caracoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class SegundaActivity extends Activity {

    private ImageView botaoVoltar;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);
        imagem = (ImageView) findViewById(R.id.imageResultadoId);

        Bundle extra = getIntent().getExtras();
        if (extra != null)
        {
            String opcaoEscolhida = extra.getString("opcao");

            if (opcaoEscolhida.equals("cara")){
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }
            else
            {
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(SegundaActivity.this, MainActivity.class));
            }
        });
    }
}
