package com.yanyuanquan.android.easymvp.presenter;

import android.util.Log;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.automvp.presenter.BasePresenter;
import com.yanyuanquan.android.easymvp.MainActivity;
import com.yanyuanquan.android.easymvp.model.MainModel;

/**
 */

@Model(MainModel.class)
public class MainPresenter extends BasePresenter<MainActivity, MainModel> {

    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("zjw",model.getName());
    }
}
