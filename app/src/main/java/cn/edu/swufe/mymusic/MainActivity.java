package cn.edu.swufe.mymusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.edu.swufe.mymusic.activities.BaseAcitivity;

public class MainActivity extends BaseAcitivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }



    private void initView () {
        initNavBar(false, "my music", true);


    }



}
