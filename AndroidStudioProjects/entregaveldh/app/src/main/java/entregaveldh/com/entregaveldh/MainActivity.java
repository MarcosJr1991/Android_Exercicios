package entregaveldh.com.entregaveldh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Receita> lstreceita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstreceita = new ArrayList<>();
        lstreceita.add(new Receita("Bolo Simples", "2 xícaras (chá) de açúcar, 3 xícaras (chá) de farinha de trigo," +
                " 4 colheres (sopa) de margarina,3 ovos ,1 e 1/2 xícara (chá) de leite,1 colher (sopa) bem cheia de fermento em pó",
                "Bata as claras em neve e reserve, Misture as gemas, a margarina e o açúcar até obter uma massa homogênea," +
                        "Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater,Por último, adicione as claras em neve e o fermento," +
                        "Despeje a massa em uma forma grande de furo central untada e enfarinhada,Asse em forno médio 180 °C, preaquecido," +
                        " por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo", R.drawable.bolosimples));

        lstreceita.add(new Receita("Pudim", "1 lata de leite condensado,1 lata de leite (medida da lata de leite condensado)" +
                "3 ovos inteiros", "Primeiro, bata bem os ovos no liquidificador,Acrescente o leite condensado e o leite, e bata novamente",
                R.drawable.pudim));


        lstreceita.add(new Receita("Pao", "1 kg de farinha de trigo sem fermento (reserve uma xícara de chá (120 gramas) e só use-a se for necessário),\n" +
                "                400 ml de leite morno,\n" +
                "                2 ovos (remova a película ou pele da gema,\n" +
                "                45 g de fermento biológico fresco ou 3 tabletes de 15 g cada (em temperatura ambiente),\n" +
                "                você pode substituir o fermento biológico fresco por 15 gramas de fermento seco para pães - não use fermento para bolos!\n" +
                "                100 ml de óleo\n" +
                "                1 xícara (chá) de açúcar (200 gramas)\n" +
                "                1/2 colher (sopa) de sal", "Em um liquidificador, coloque todos os ingredientes, menos o sal e a farinha (pois o sal mata o fermento)\n" +
                "                \"Bata até obter uma consistência líquida, cremosa e espumosa (cuidado com a temperatura do leite, pois ele deve estar morno e não quente; se estiver quente, ele matará o seu fermento)\n" +
                "                \"Despeje esse líquido numa bacia e adicione metade da farinha e misture com uma colher de pau\n" +
                "                \"A massa ficará mole e grudenta\\n\" +\n" +
                "                \"Reserve uma xícara de farinha e adicione o resto dela à massa junto com o sal\n" +
                "                \"A massa ficará macia e um pouco pegajosa\n" +
                "                \"Nesse momento, ligue seu forno em fogo baixo por 5 minutos e desligue-o\n" +
                "                \"Os pães serão colocados nele para que o calor os faça crescer, enquanto descansam\n" +
                "                \"Enfarinhe uma superfície e sove a massa com carinho até que ela desgrude das mãos\n" +
                "                \"Só em último caso, adicione o restante da farinha: isso deixará o pão mais leve e fofo\n" +
                "                \"Experimente e corrija o sabor da massa conforme seu paladar\n" +
                "                \"Divida a massa em duas partes iguais e abra cada uma com um rolo, enfarinhando a superfície novamente: neste momento a massa ficará macia e lisa\n" +
                "                \"Unte com um pouquinho de óleo ou margarina a uma forma de bolo média (30 x 24) ou duas formas próprias para pão de 27 x 11 (prefiro forma para pães, pois o pão cresce bonito e para para cima\n" +
                "                \"Em forma de bolo, o pão cresce para os lados)\n" +
                "                \"Enrole os pães no tamanho da forma escolhida e faça pequenos cortes em “X” em cima da massa para decorar)\n" +
                "                \"Leve os pães ao forno que você pré aqueceu por 5 minutos e desligou\n" +
                "                \"Deixe-os descansar, para que cresçam, estimulados pelo calor morno\n" +
                "                \"Cuidado: se o forno estiver muito quente, seus pães vão assar antes de crescer e a massa ficará embatumada\n" +
                "                \"Aguarde uns 20, 30 minutos e, se tudo correr bem, ela crescerá lisa e arredondada, podendo até ultrapassar as bordas da forma\n" +
                "                \"Se ela não crescer, não se preocupe\n" +
                "                \"Mesmo que a massa não tenha crescido após esse tempo, ligue o forno em temperatura média (180º C) e deixe ela assar por uns 30, 40, 45 minutos (depende do seu forno)\n" +
                "                \"O fermento \\\"preguiçoso\\\" poderá \\\"despertar\\\" à força nesse momento\\n\" +\n" +
                "                \"Quando sentir o cheirinho de pão assado, aumente um pouco chama do fogo para que a casca escureça\n" +
                "                \"Se deixar por muito tempo, ela ficará amarga\n" +
                "                \"Deixe esfriar dentro ou fora do forno\n" +
                "                \"O pão deverá estar leve, fofo, cheio de furinhos (aerado), delicado, cheiroso e quase desmanchando quando cortado", R.drawable.pao));

        RecyclerView myrv = (RecyclerView)findViewById(R.id.recyclerview_id);//id do xml activity
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstreceita);

        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
