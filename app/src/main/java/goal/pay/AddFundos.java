package goal.pay;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddFundos extends AppCompatActivity {

    BottomNavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addfundos_layout);
        menu = findViewById(R.id.menuB);
        MenuConfig.Change(AddFundos.this, menu);
    }
}
