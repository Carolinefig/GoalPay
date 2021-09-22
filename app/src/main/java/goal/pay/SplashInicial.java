package goal.pay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_inicial);
        mostrarLogin();
    }

    private void mostrarLogin() {
        Intent intent = new Intent(SplashInicial.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public class SplashScreenActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash_inicial);
            Handler handle = new Handler();
            mostrarLogin();

            handle = new Handler();
            handle.postDelayed(new Runnable() {
                @Override public void run() {
                    mostrarLogin();
                }
            }, 2000);
        }
    }
}
