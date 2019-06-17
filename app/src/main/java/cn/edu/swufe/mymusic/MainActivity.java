package cn.edu.swufe.mymusic;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import cn.edu.swufe.mymusic.activities.BaseAcitivity;
import cn.edu.swufe.mymusic.adapters.MusicGridAdapter;
import cn.edu.swufe.mymusic.adapters.MusicGridAdapterSecond;
import cn.edu.swufe.mymusic.adapters.MusicGridAdapterThird;
import cn.edu.swufe.mymusic.adapters.MusicListAdapter;
import cn.edu.swufe.mymusic.views.GridSpaceItemDecoration;

public class MainActivity extends BaseAcitivity {
private RecyclerView mRvGrid,mRvList,mRvGrid2,mRvGrid3;
private MusicGridAdapter mGridAdapter;
    private MusicGridAdapterSecond mGridAdapterSecond;
    private MusicGridAdapterThird mGridAdapterThird;
private MusicListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }



    private void initView () {
        initNavBar(false, "my music", true);
        mRvGrid=findViewById(R.id.rv_grid);
        mRvGrid2=findViewById(R.id.rv_grid2);
        mRvGrid3=findViewById(R.id.rv_grid3);

        mRvGrid.setLayoutManager(new GridLayoutManager(this,1));//3表示同一行中展示的数量
     // mRvGrid.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize),mRvGrid));
       //取消单独部分的滑动
        mRvGrid.setNestedScrollingEnabled(false);
        mGridAdapter=new MusicGridAdapter(this);
        mRvGrid.setAdapter(mGridAdapter);

        mRvGrid2.setLayoutManager(new GridLayoutManager(this,1));//3表示同一行中展示的数量
        mRvGrid2.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize),mRvGrid2));
        //取消单独部分的滑动
        mRvGrid2.setNestedScrollingEnabled(false);
        mGridAdapterSecond=new MusicGridAdapterSecond(this);
        mRvGrid2.setAdapter(mGridAdapterSecond);

        mRvGrid3.setLayoutManager(new GridLayoutManager(this,1));//3表示同一行中展示的数量
        mRvGrid3.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize),mRvGrid3));
        //取消单独部分的滑动
        mRvGrid3.setNestedScrollingEnabled(false);
        mGridAdapterThird=new MusicGridAdapterThird(this);
        mRvGrid3.setAdapter(mGridAdapterThird);




        //在已知列表高度的情况下，可以直接在布局中定义RecyclerView的高度
        //在不知道列表高度情况下，需手动计算
        mRvList=findViewById(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));//垂直排列
        //取消单独部分的滑动
        mRvList.setNestedScrollingEnabled(false);
        mListAdapter=new MusicListAdapter(this,mRvList);
       mRvList.setAdapter(mListAdapter);
    }



}
