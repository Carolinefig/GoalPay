package goal.pay;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReceberPagamento extends AppCompatActivity {

    BottomNavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receberpag_layout);
        menu = findViewById(R.id.menuB);
        MenuConfig.Change(ReceberPagamento.this, menu);
    }
}
