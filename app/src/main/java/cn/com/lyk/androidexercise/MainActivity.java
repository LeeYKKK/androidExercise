package cn.com.lyk.androidexercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.xutils.view.annotation.Event;
import org.xutils.x;

public class MainActivity extends AppCompatActivity{
    private Button btLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        x.view().inject(this);
    }


    @Event(type = View.OnClickListener.class, value = {R.id.btLv})
    private void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLv:
                Toast.makeText(this, "ListView", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,ListviewActivity.class);
                startActivity(intent);
                break;
        }

    }

    private void initView() {
        btLv = (Button) findViewById(R.id.btLv);

    }
}
