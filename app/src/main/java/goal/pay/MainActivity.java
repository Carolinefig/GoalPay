package goal.pay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView payment;
    TextView txtGoal;
    TextView txtLogin;
    TextView txtEntre;
    TextView txtEmail;
    EditText edtEmail;
    TextView txtSenha;
    EditText edtSenha;
    CheckBox cbxConectado;
    TextView txtConexao;
    Button btnEntrar;
    TextView txtConta;
    TextView txtCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        payment = (ImageView) findViewById(R.id.payment);
        txtGoal = (TextView) findViewById(R.id.txtGoal);
        txtLogin = (TextView) findViewById(R.id.txtLogin);
        txtEntre = (TextView) findViewById(R.id.txtEntre);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        txtSenha = (TextView) findViewById(R.id.txtSenha);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        cbxConectado = (CheckBox) findViewById(R.id.cbxConectado);
        txtConexao = (TextView) findViewById(R.id.txtConexao);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        txtConta = (TextView) findViewById(R.id.txtConta);
        txtCadastrar = (TextView) findViewById(R.id.txtCadastrar);


        cbxConectado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxConectado.isChecked() == true);
                {

                }
            }
        });

    }

    public void EntrarSubmit(View v){
        Intent Entrar = new Intent(MainActivity.this, Inicio.class);
        startActivity(Entrar);
    }

}





















