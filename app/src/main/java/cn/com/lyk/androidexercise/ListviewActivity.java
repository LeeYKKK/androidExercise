package cn.com.lyk.androidexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.com.lyk.been.CostBeen;

public class ListviewActivity extends AppCompatActivity {
    private ListView listView;
    private List<CostBeen> costBeenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView= (ListView) findViewById(R.id.lvMain);
        costBeenList=new ArrayList<>();
        initCostData();
        listView.setAdapter(new CostListAdapter(this,costBeenList));

    }

    private void initCostData() {
        for(int i=0; i<20; i++){
            CostBeen costBeen=new CostBeen();
            costBeen.setCostTite("今天花钱买了一条狗很开心");
            costBeen.setCostDate("2017-10-17");
            costBeen.setCostMoney("50万");
            costBeenList.add(costBeen);
        }
    }
}
