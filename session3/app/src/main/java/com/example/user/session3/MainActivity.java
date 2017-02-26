package com.example.user.session3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(getBaseContext(),"Heloo button",Toast.LENGTH_LONG).show();

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Object of TextView where we change/set our text
                TextView setTextObject = (TextView) findViewById(R.id.mytext);

                //Object of EditText from where we get Text
                EditText edit = (EditText) findViewById(R.id.input);
                String mytext = edit.getText().toString();

                //set text
                setTextObject.setText(mytext);
            }
        });
    }
}
