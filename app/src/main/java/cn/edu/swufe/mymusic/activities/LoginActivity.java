package cn.edu.swufe.mymusic.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.edu.swufe.mymusic.R;

public class LoginActivity extends BaseAcitivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }
    //初始化View
    private void initView(){
        initNavBar(false,"登录",false);//表示后退按钮不显示，title显示登录，“我”不显示
    }
//注册点击事件，跳转注册页面
public void onRegisterClick(View v){

}

}
