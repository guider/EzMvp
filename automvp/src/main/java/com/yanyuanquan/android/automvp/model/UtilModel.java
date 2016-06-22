package com.yanyuanquan.android.automvp.model;

import android.util.Log;
import android.util.LruCache;

import com.yanyuanquan.android.automvp.annotation.Model;

import java.util.HashMap;

/**
 */
public class UtilModel {

    protected static HashMap<Class<?>, BaseModel> modelSet = new HashMap<>();

    protected static <T extends BaseModel> T getModel(Class<?> clz) {
        T model = (T) modelSet.get(clz);
        if (model == null) {
            model = createModel(clz);
        }
        return model;
    }

    private static <T extends BaseModel> T createModel(Class<?> clz) {
        if (clz == null || !BaseModel.class.isAssignableFrom(clz)) {
            throw new IllegalArgumentException("  model mast exten baseModel ");
        }
        try {
            T model = (T) clz.newInstance();
            modelSet.put(clz, model);
            return model;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("  model mast exten baseModel ");
    }

    public  static  <E extends BaseModel> E getModelInstance(Class<?> clz) {
        Model model = clz.getAnnotation(Model.class);
        if (model != null) {
            try {
                Class<E> aClass = (Class<E>) model.value();
                return (E) aClass.newInstance();
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        throw new IllegalArgumentException(" Presenter 没有Model 注解");
    }

}
