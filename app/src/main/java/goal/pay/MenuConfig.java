package goal.pay;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuConfig {


    public static void Change(final Context context, BottomNavigationView menu){
        menu.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.txtDash :
                        Intent Inicio = new Intent(context, Inicio.class);
                        context.startActivity(Inicio);
                        return;

                    case R.id.txtPagar :
                        Intent RealizarPagamento = new Intent(context, RealizarPagamento.class);
                        context.startActivity(RealizarPagamento);
                        return;

                    case R.id.txtResgatar :
                        Intent ResgatarPrincipal = new Intent(context, ResgatarPrincipal.class);
                        context.startActivity(ResgatarPrincipal);
                        return;

                    case R.id.txtMais :
                        Intent AddFundos = new Intent(context, AddFundos.class);
                        context.startActivity(AddFundos);
                        return;

                    case R.id.txtReceber :
                        Intent ReceberPagamento = new Intent(context, ReceberPagamento.class);
                        context.startActivity(ReceberPagamento);
                        return;
                }
                return;
            }
        });
    }
}
