package goal.pay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Object> {

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



    public void InsereEmail(View view) {

        String queryString = edtEmail.getText().toString();

        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputManager != null) {
            inputManager.hideSoftInputFromWindow(view.getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = null;
        if (connMgr != null) {
            networkInfo = connMgr.getActiveNetworkInfo();
        }

        if (networkInfo != null && networkInfo.isConnected()
                && queryString.length() != 0) {
            Bundle queryBundle = new Bundle();
            queryBundle.putString("queryString", queryString);
            getSupportLoaderManager().restartLoader(0, queryBundle, this);
            edtEmail.setText("");
            txtConexao.setText("");
        }

        else {
            if (queryString.length() == 0) {
                edtEmail.setText("");
                txtConexao.setText("Insira um email");
            } else {
                edtEmail.setText(" ");
                txtConexao.setText("Verifique sua conexão");
            }
        }
    }

    public void InsereSenha(View view) {

        String queryString = edtSenha.getText().toString();

        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputManager != null) {
            inputManager.hideSoftInputFromWindow(view.getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = null;
        if (connMgr != null) {
            networkInfo = connMgr.getActiveNetworkInfo();
        }

        if (networkInfo != null && networkInfo.isConnected()
                && queryString.length() != 0) {
            Bundle queryBundle = new Bundle();
            queryBundle.putString("queryString", queryString);
            getSupportLoaderManager().restartLoader(0, queryBundle, this);
            edtSenha.setText("");
            txtConexao.setText("");
        }

        else {
            if (queryString.length() == 0) {
                edtSenha.setText("");
                txtConexao.setText("Insira um email");
            } else {
                edtSenha.setText(" ");
                txtConexao.setText("Verifique sua conexão");
            }
        }
    }


    @NonNull
    @Override
    public Loader<Object> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Object> loader, Object data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<Object> loader) {

    }
}



















