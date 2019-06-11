package cn.edu.swufe.mymusic.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import cn.edu.swufe.mymusic.MainActivity;
import cn.edu.swufe.mymusic.R;

public class WelcomeActivity extends BaseAcitivity {

    //延迟3秒跳转界面
// Timer:提供计时器的工具类

    private Timer mTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }
    private void init(){
        mTimer= new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                //toMain();
               toLogin();
            }
        },3*1000);
    }
    //跳转到MainActivity
    private void toMain(){
        Intent intent =new Intent(this,MainActivity.class);//通过intent跳转到mainActivity
        startActivity(intent);
        finish();
    }
    //跳转到loginActivity界面
    private void toLogin(){
        Intent intent =new Intent(this,LoginActivity.class);//通过intent跳转到LoginActivity
        startActivity(intent);
        finish();
    }
}
