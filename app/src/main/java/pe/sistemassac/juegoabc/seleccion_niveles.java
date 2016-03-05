package pe.sistemassac.juegoabc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class seleccion_niveles extends AppCompatActivity {

    private final Handler mHideHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_seleccion_niveles);
    }

    public void onClick_AbrirNivel(View view) {
        if (view.getId() == R.id.btnNivel1) {
            Intent intent1 = new Intent(this, nivel1.class);
            startActivity(intent1);
        } else if (view.getId() == R.id.btnNivel2) {
            Intent intent2 = new Intent(this, nivel2.class);
            startActivity(intent2);
        } else if (view.getId() == R.id.btnNivel3) {
            Intent intent3 = new Intent(this, nivel3.class);
            startActivity(intent3);
        }
    }
}