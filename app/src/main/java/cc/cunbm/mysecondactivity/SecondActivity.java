package cc.cunbm.mysecondactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_msg = (TextView)findViewById(R.id.received_value_id);

        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same whch is send by first activity
        String str = intent.getStringExtra("message_key");

        // display the string into textView
        receiver_msg.setText(str);
    }
}

