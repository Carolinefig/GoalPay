package goal.pay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;

public class Inicio extends AppCompatActivity {

    ImageButton Sair;
    TextView txtOla;
    TextView txtMeuSaldo;
    Button btnLocalizar;
    TextView txtValorTotal;
    ImageButton OpenEye;
    TextView txtSolicite;
    TextView txtObtenha;
    Button btnSolicitar;
    ImageView Cards;
    TextView txtHist;
    TextView txtData;
    ImageButton Add;
    ImageView Perfil;
    TextView txtAcao;
    TextView txtDetalhes;
    ImageView Perfil2;
    TextView txtAcao2;
    TextView txtDetalhes2;
    ImageView Perfil3;
    TextView txtAcao3;
    TextView txtDetalhes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_layout);


        Sair = (ImageButton) findViewById(R.id.Sair);
        txtOla = (TextView) findViewById(R.id.txtOla);
        txtMeuSaldo = (TextView) findViewById(R.id.txtMeuSaldo);
        btnLocalizar = (Button) findViewById(R.id.btnLocalizar);
        txtValorTotal = (TextView) findViewById(R.id.txtValorTotal);
        OpenEye = (ImageButton) findViewById(R.id.OpenEye);
        txtSolicite = (TextView) findViewById(R.id.txtSolicite);
        txtObtenha = (TextView) findViewById(R.id.txtObtenha);
        btnSolicitar = (Button) findViewById(R.id.btnSolicitar);
        Cards = (ImageView) findViewById(R.id.Cards);
        txtHist = (TextView) findViewById(R.id.txtHist);
        txtData = (TextView) findViewById(R.id.txtData);
        Add = (ImageButton) findViewById(R.id.Add);
        Perfil = (ImageView) findViewById(R.id.Perfil);
        txtAcao = (TextView) findViewById(R.id.txtAcao);
        txtDetalhes = (TextView) findViewById(R.id.txtDetalhes);
        Perfil2 = (ImageView) findViewById(R.id.Perfil2);
        txtAcao2 = (TextView) findViewById(R.id.txtAcao2);
        txtDetalhes2 = (TextView) findViewById(R.id.txtDetalhes2);
        Perfil3 = (ImageView) findViewById(R.id.Perfil3);
        txtAcao3 = (TextView) findViewById(R.id.txtAcao3);
        txtDetalhes3 = (TextView) findViewById(R.id.txtDetalhes3);

    }


    public void GeoGo(View v){

        Toast.makeText(Inicio.this, "Geo", Toast.LENGTH_LONG).show();
        Intent Go = new Intent(Inicio.this, Geolocalizacao.class);
        startActivity(Go);
    }
}








