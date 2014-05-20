package com.example.adivinhador.app;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class SecondaryActivity2 extends ActionBarActivity {
    TextView text;
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.secondary_activity2);

        //

        Intent i = getIntent();

        int numero = i.getIntExtra("numero",0);
        int num = i.getIntExtra("numer", 0);

        //

        text = (TextView) findViewById(R.id.textView2);

        text.setText(String.valueOf(numero));
        text.setText(String.valueOf(num));

        double res =(numero + num);

        //double res =(numero + 40);

        final double resf = ( ( res - 20 ) - 10 );

        text.setText(String.valueOf("O Resultado é " + resf ));

        //

        botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity3, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}