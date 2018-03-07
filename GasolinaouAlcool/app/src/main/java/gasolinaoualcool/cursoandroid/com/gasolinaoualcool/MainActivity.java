package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Localizar os componentes da tela
        precoAlcool = (EditText) findViewById(R.id.caixaAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.caixaGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        resultado = (TextView) findViewById(R.id.resultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar os valores digitados

                Double valorAlcool = Double.parseDouble(precoAlcool.getText().toString());
                Double valorGasolina = Double.parseDouble(precoGasolina.getText().toString());

                //alcool / gasolina

                Double razao = (valorAlcool/valorGasolina);

                if (razao >= 0.7)
                {//Gasolina
                    resultado.setText("É melhor utilizar a gasolina!");
                }
                else
                {//Álcool
                    resultado.setText("É melhor utilizar o álcool!");
                }
            }
        });
    }
}
