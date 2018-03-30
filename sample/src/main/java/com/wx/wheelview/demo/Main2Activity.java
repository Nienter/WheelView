package com.wx.wheelview.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.wx.wheelview.widget.WheelView;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Main2Activity extends AppCompatActivity {
    private WheelView test;
    private com.contrarywind.view.WheelView  wv;
    private List<Bean> beans = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initData();
        init();
        init2();
    }

    private void init2() {
        wv = (com.contrarywind.view.WheelView) findViewById(R.id.test2);
//        wv.setAdapter();
    }

    private void initData() {
        beans.add(new Bean("1", "2", "3"));
        beans.add(new Bean("2", "2", "3"));
        beans.add(new Bean("3", "2", "3"));
        beans.add(new Bean("4", "2", "3"));
        beans.add(new Bean("5", "2", "3"));
        beans.add(new Bean("6", "2", "3"));
        beans.add(new Bean("7", "2", "3"));
    }

    private void init() {
        test = (WheelView) findViewById(R.id.test);
        test.setWheelAdapter(new MyAdapter(this));
        test.setSkin(WheelView.Skin.Holo);
        test.setLoop(false);
        test.setWheelData(beans);
        WheelView.WheelViewStyle style = new WheelView.WheelViewStyle();
        style.selectedTextSize = 20;
        style.textSize = 16;
        test.setWheelSize(5);
        test.setWheelClickable(true);
        test.setSelection(2);
        test.setOnWheelItemClickListener(new WheelView.OnWheelItemClickListener() {
            @Override
            public void onItemClick(int position, Object o) {
                Bean bean = (Bean) o;
                Toast.makeText(Main2Activity.this, "" + bean.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        test.setOnWheelItemSelectedListener(new WheelView.OnWheelItemSelectedListener() {
            @Override
            public void onItemSelected(int position, Object o) {
                Bean bean = (Bean) o;
                Toast.makeText(Main2Activity.this, "" + bean.getId(), Toast.LENGTH_SHORT).show();
            }
        });
        test.setStyle(style);
    }
}
