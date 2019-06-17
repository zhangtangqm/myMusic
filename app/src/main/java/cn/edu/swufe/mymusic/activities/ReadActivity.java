package cn.edu.swufe.mymusic.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cn.edu.swufe.mymusic.R;
import cn.edu.swufe.mymusic.adapters.ReadAdapter;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        ReadAdapter pageAdapter=new ReadAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);

       TabLayout tabLayout= (TabLayout) findViewById(R.id.sliding_tabs);

        tabLayout.setupWithViewPager(viewPager);//绑定viewPage和tableLayout，使其一起联动
    }
    }

