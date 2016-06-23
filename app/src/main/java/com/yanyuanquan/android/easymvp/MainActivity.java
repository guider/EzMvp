package com.yanyuanquan.android.easymvp;

import android.os.Bundle;
import android.widget.TextView;

import com.yanyuanquan.android.automvp.BaseActivity;
import com.yanyuanquan.android.automvp.annotation.Presenter;
import com.yanyuanquan.android.easymvp.presenter.MainPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;

@Presenter(MainPresenter.class)
public class MainActivity extends BaseActivity<MainPresenter> {

    @Bind(R.id.name)
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }


    public void setName(String strName) {
        name.setText(strName +  " ");

    }
}
