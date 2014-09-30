package com.bitsworking.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText mEditText;
    Button myFancyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   // hier wird die Oberfläche gesetzt

        mEditText = (EditText) findViewById(R.id.myFancyInput);  // findViewById - bekomme von der Oberfläche über die Id der Oberfläche, liefert eine Signatur zurück und der wird dann auf den datentyp EditBox umgewandelt = Casten
        myFancyButton = (Button) findViewById(R.id.myFancyButton);  // findViewById liefert eine View zurück und die muss ich dann auf das richtige Objetk casten mit ()
        myFancyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        /* Wenn man den Button lange drückt */
        myFancyButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Long Click", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        myFancyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = mEditText.getText().toString();
                Toast.makeText(getBaseContext(), "New Input: " + textInput, Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
