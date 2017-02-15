package com.example.boss.boat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText message_text;
    public final static String MESSAGE_KEY="com.example.boss.boat.message_key";

   // public final static Extra_Message =""
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void sendMessage(View views){

        message_text =(EditText)findViewById(R.id.message_text);
        String message= message_text.getText().toString();
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        intent.putExtra(MESSAGE_KEY,message);
        startActivity(intent);

    }
}
