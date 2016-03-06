package pe.sistemassac.juegoabc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void onClick_IrNiveles (View view) {
        Intent intent = new Intent(getApplicationContext(),seleccion_niveles.class);
        startActivity(intent);
        finish();
    }
}
