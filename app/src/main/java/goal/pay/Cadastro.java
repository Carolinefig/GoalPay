package goal.pay;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {

    ImageButton Voltar;
    EditText edtNome;
    EditText edtEmail2;
    EditText edtCpf;
    EditText edtSenha2;
    EditText edtConf;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);

        Voltar = (ImageButton) findViewById(R.id.Voltar);
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtEmail2 = (EditText) findViewById(R.id.edtEmail2);
        edtCpf = (EditText) findViewById(R.id.edtCpf);
        edtSenha2 = (EditText) findViewById(R.id.edtSenha2);
        edtConf = (EditText) findViewById(R.id.edtConf);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
    }
}
