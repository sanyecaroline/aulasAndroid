package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "\"Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos\" – James Cameron, cineasta",
            "\"O sucesso normalmente vem para quem está ocupado demais para procurar por ele\" – Henry David Thoreau, filósofo",
            "\"A vida é melhor para aqueles que fazem o possível para ter o melhor – John Wooden, jogador e treinador de basquete",
            "\"Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência\" – Lisa M. Amos, executiva",
            "\"Se você não está disposto a arriscar, esteja disposto a uma vida comum\" – Jim Rohn, empreendedor",
            "\"Escolha uma ideia. Faça dessa ideia a sua vida. Pense nela, sonhe com ela, viva pensando nela. Deixe cérebro, músculos, nervos, todas as partes do seu corpo serem preenchidas com essa ideia. Esse é o caminho para o sucesso\" – Swami Vivekananda, pensador hindu",
            "\"Para de perseguir o dinheiro e comece a perseguir o sucesso\" – Tony Hsieh, empreendedor",
            "\"Todos os seus sonhos podem se tornar realidade se você tem coragem para persegui-los\" – Walt Disney, desenhista e empreendedor",
            "\"Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo\" – Winston Churchill, político",
            "\"Sempre que você vir uma pessoa de sucesso, você sempre verá as glórias, nunca os sacrifícios que os levaram até ali\" – Vaibhav Shah, pensador",
            "\"Sucesso? Eu não sei o que isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa Para mim, sucesso é paz anterior\" – Denzel Washington, ator",
            "\"Oportunidades não surgem. É você que as cria\" – Chris Grosser, fotógrafo",
            "\"Não tente ser uma pessoa de sucesso. Em vez disso, seja uma pessoa de valor\" – Albert Einstein, físico",
            "\"Não é o mais forte que sobrevive, nem o mais inteligente. Quem sobrevive é o mais disposto à mudança\" – Charles Darwin, biólogo",
            "\"A melhor vingança é um sucesso estrondoso\" – Frank Sinatra, cantor"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFaseId);

//        textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                textoNovaFrase.setText(frases[randomico.nextInt(frases.length)]);
            }
        });
    }
}
