package pe.sistemassac.juegoabc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class nivel1 extends Activity {

    public TextView tvLetra1;
    public TextView tvLetra2;
    public TextView tvLetra3;
    public TextView tvLetra4;
    public TextView tvLetra5;
    public TextView tvLetra6;
    public TextView tvLetra7;
    public TextView tvLetra8;
    public TextView tvLetra9;

    public Button btnLetraA;
    public Button btnLetraB;
    public Button btnLetraC;
    public Button btnLetraD;
    public Button btnLetraE;
    public Button btnLetraF;
    public Button btnLetraG;
    public Button btnLetraH;
    public Button btnLetraI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        setContentView(R.layout.activity_nivel1);

        tvLetra1 = (TextView) findViewById(R.id.tvLetra1);
        tvLetra2 = (TextView) findViewById(R.id.tvLetra2);
        tvLetra3 = (TextView) findViewById(R.id.tvLetra3);
        tvLetra4 = (TextView) findViewById(R.id.tvLetra4);
        tvLetra5 = (TextView) findViewById(R.id.tvLetra5);
        tvLetra6 = (TextView) findViewById(R.id.tvLetra6);
        tvLetra7 = (TextView) findViewById(R.id.tvLetra7);
        tvLetra8 = (TextView) findViewById(R.id.tvLetra8);
        tvLetra9 = (TextView) findViewById(R.id.tvLetra9);

        btnLetraA = (Button) findViewById(R.id.btnLetraA);
        btnLetraB = (Button) findViewById(R.id.btnLetraB);
        btnLetraC = (Button) findViewById(R.id.btnLetraC);
        btnLetraD = (Button) findViewById(R.id.btnLetraD);
        btnLetraE = (Button) findViewById(R.id.btnLetraE);
        btnLetraF = (Button) findViewById(R.id.btnLetraF);
        btnLetraG = (Button) findViewById(R.id.btnLetraG);
        btnLetraH = (Button) findViewById(R.id.btnLetraH);
        btnLetraI = (Button) findViewById(R.id.btnLetraI);
    }

    public void onClick_Regresar(View view) {
        finish();
    }

    public void onClickLetras(View view) {
        if (view.getId() == R.id.btnLetraA) {
            encuentraVacio("A");
            validaOrden();
            btnLetraA.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraB) {
            encuentraVacio("B");
            validaOrden();
            btnLetraB.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraC) {
            encuentraVacio("C");
            validaOrden();
            btnLetraC.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraD) {
            encuentraVacio("D");
            validaOrden();
            btnLetraD.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraE) {
            encuentraVacio("E");
            validaOrden();
            btnLetraE.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraF) {
            encuentraVacio("F");
            validaOrden();
            btnLetraF.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraG) {
            encuentraVacio("G");
            validaOrden();
            btnLetraG.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraH) {
            encuentraVacio("H");
            validaOrden();
            btnLetraH.setEnabled(false);
        } else if (view.getId() == R.id.btnLetraI) {
            encuentraVacio("I");
            validaOrden();
            btnLetraI.setEnabled(false);
        }
    }

    private void validaOrden() {
        if (!tvLetra1.getText().toString().equalsIgnoreCase("")
                && !tvLetra2.getText().toString().equalsIgnoreCase("")
                && !tvLetra3.getText().toString().equalsIgnoreCase("")
                && !tvLetra4.getText().toString().equalsIgnoreCase("")
                && !tvLetra5.getText().toString().equalsIgnoreCase("")
                && !tvLetra6.getText().toString().equalsIgnoreCase("")
                && !tvLetra7.getText().toString().equalsIgnoreCase("")
                && !tvLetra8.getText().toString().equalsIgnoreCase("")
                && !tvLetra9.getText().toString().equalsIgnoreCase("")) {
            if (tvLetra1.getText().toString().equalsIgnoreCase("A")
                    && tvLetra2.getText().toString().equalsIgnoreCase("B")
                    && tvLetra3.getText().toString().equalsIgnoreCase("C")
                    && tvLetra4.getText().toString().equalsIgnoreCase("D")
                    && tvLetra5.getText().toString().equalsIgnoreCase("E")
                    && tvLetra6.getText().toString().equalsIgnoreCase("F")
                    && tvLetra7.getText().toString().equalsIgnoreCase("G")
                    && tvLetra8.getText().toString().equalsIgnoreCase("H")
                    && tvLetra9.getText().toString().equalsIgnoreCase("I")) {
                Toast.makeText(nivel1.this, "Siiiii!!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(nivel1.this, "Nooooo!!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void encuentraVacio(String i) {
        if (tvLetra1.getText().toString().equals("")) {
            this.tvLetra1.setText(i);
            return;
        }
        if (tvLetra2.getText().toString().equals("")) {
            tvLetra2.setText(i);
            return;
        }
        if (tvLetra3.getText().toString().equals("")) {
            tvLetra3.setText(i);
            return;
        }
        if (tvLetra4.getText().toString().equals("")) {
            tvLetra4.setText(i);
            return;
        }
        if (tvLetra5.getText().toString().equals("")) {
            tvLetra5.setText(i);
            return;
        }
        if (tvLetra6.getText().toString().equals("")) {
            tvLetra6.setText(i);
            return;
        }
        if (tvLetra7.getText().toString().equals("")) {
            tvLetra7.setText(i);
            return;
        }
        if (tvLetra8.getText().toString().equals("")) {
            tvLetra8.setText(i);
            return;
        }
        if (tvLetra9.getText().toString().equals("")) {
            tvLetra9.setText(i);
            return;
        }
    }
}
