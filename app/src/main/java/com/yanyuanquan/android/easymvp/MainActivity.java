package com.yanyuanquan.android.easymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yanyuanquan.android.automvp.BaseActivity;
import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.easymvp.presenter.MainPresenter;

@Presenter(MainPresenter.class)
public class MainActivity extends BaseActivity<MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("zjw",presenter.getTime()+"");
    }

}
