package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundaActivity extends Activity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = (TextView) findViewById(R.id.textoId);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            texto.setText(extra.getString("nome"));
        }
    }
}
