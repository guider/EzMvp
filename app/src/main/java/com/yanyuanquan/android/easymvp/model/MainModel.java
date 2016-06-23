package com.yanyuanquan.android.easymvp.model;

import com.yanyuanquan.android.automvp.model.BaseModel;

/**
 */

public class MainModel extends BaseModel {


    public Object getName() {
        return " 当前时间  ---->>> "+ System.currentTimeMillis();
    }
}
