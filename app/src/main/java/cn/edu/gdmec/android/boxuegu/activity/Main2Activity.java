package cn.edu.gdmec.android.boxuegu.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.edu.gdmec.android.boxuegu.R;

public class Main2Activity extends AppCompatActivity {
private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2 = (TextView)findViewById(R.id.tv2);
        Intent intent = getIntent();
        String s = intent.getStringExtra("userName");
        tv2.setText("hello     用户:b"+s);
    }
}
