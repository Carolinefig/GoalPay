package goal.pay;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import goal.pay.Config.RetrofitConfig;
import goal.pay.Models.Requests.Login;
import goal.pay.Models.Responses.UserSession;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;
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
    ImageView fingerprint;

    @RequiresApi(api = Build.VERSION_CODES.Q)
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
        fingerprint = (ImageView) findViewById(R.id.fingerprint);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {

                Intent Entrar = new Intent(MainActivity.this, Inicio.class);
                startActivity(Entrar);

                /*

                Login model = new Login();
                model.setEmail(edtEmail.getText().toString());
                model.setSenha(edtSenha.getText().toString());


                Call<UserSession> call = new RetrofitConfig().useApiGoalPay().Autenticar(model);


                call.enqueue(new Callback<UserSession>() {
                    @Override
                    public void onResponse(Call<UserSession> call, Response<UserSession> response) {
                        UserSession user = response.body();
                        if(user.getId() != null){
                            SharedPreferences.Editor edt = pref.edit();
                            edt.putString("id", user.getId());
                            edt.commit();
                            Intent Entrar = new Intent(MainActivity.this, Inicio.class);
                            startActivity(Entrar);
                        }
                        Toast.makeText(MainActivity.this, "Email ou senha invalidos", Toast.LENGTH_LONG).show();
                    }
                    @Override
                    public void onFailure(Call<UserSession> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Erro", Toast.LENGTH_LONG).show();
                    }
                });*/
            }
        });

        cbxConectado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxConectado.isChecked() == true);
                {

                }
            }
        });

        SpannableString ss = new SpannableString("Cadastre-se");

        ss.setSpan(new CustomClickableSpan(), 0, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtCadastrar.setText(ss);
        txtCadastrar.setMovementMethod(LinkMovementMethod.getInstance());
    }

    class CustomClickableSpan extends ClickableSpan {
        @Override
        public void onClick(View kk) {
            Log.d("Teste", "Here");
            Intent cadastrar = new Intent(MainActivity.this, Cadastro.class);
            startActivity(cadastrar);
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setColor(Color.rgb(94,67,195));
            ds.setUnderlineText(false);
        }
    }
}





















