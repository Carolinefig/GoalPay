package goal.pay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ResgatarPrincipal extends AppCompatActivity {

    ImageButton Sair;
    BottomNavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resgatar_layout);

        Sair = (ImageButton) findViewById(R.id.Sair);
        menu = findViewById(R.id.menuB);
        MenuConfig.Change(ResgatarPrincipal.this, menu);
    }

    public void Sair(View a){
        Intent out = new Intent(ResgatarPrincipal.this, MainActivity.class);
        startActivity(out);
    }
}
