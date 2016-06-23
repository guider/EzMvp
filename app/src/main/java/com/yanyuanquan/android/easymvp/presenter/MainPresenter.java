package com.yanyuanquan.android.easymvp.presenter;

import android.support.annotation.NonNull;
import android.util.Log;

import com.yanyuanquan.android.automvp.annotation.Model;
import com.yanyuanquan.android.automvp.presenter.BasePresenter;
import com.yanyuanquan.android.easymvp.MainActivity;
import com.yanyuanquan.android.easymvp.model.MainModel;

/**
 *
 * 
 */

@Model(MainModel.class)
public class MainPresenter extends BasePresenter<MainActivity, MainModel> {

    public long getTime() {
        return System.currentTimeMillis();
    }


    @Override
    public void onPostCreate(@NonNull MainActivity view) {
        super.onPostCreate(view);
        String name = (String) model.getName();
        view.setName(name);
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
