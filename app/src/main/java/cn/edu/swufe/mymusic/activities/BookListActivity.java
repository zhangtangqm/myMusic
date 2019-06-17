package cn.edu.swufe.mymusic.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import cn.edu.swufe.mymusic.R;

public class BookListActivity extends BaseAcitivity {

    private ImageView mImageView1,mImageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        mImageView1=findViewById(R.id.bookList_a);
        mImageView2=findViewById(R.id.bookList_b);



    }



   public void onBookAClick(View v){

        Uri uri1 = Uri.parse("http://www.bookschina.com/");
        Intent intent1;
        intent1 = new Intent(Intent.ACTION_VIEW,uri1);
        startActivity(intent1);
    }
    public void onBookBClick(View v){

        Uri uri = Uri.parse(" http://e.dangdang.com/");
        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
