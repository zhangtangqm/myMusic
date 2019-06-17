package cn.edu.swufe.mymusic.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.edu.swufe.mymusic.R;

public class PhotoListActivity extends BaseAcitivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_list);

    }
    public void onPhotoAClick(View v){
        Uri uri = Uri.parse("http://www.fengniao.com/");
        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public void onPhotoBClick(View v){
        Uri uri = Uri.parse(" http://photo.poco.cn/");
        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
