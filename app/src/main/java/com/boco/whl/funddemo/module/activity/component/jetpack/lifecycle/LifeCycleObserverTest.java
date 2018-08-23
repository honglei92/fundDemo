package com.boco.whl.funddemo.module.activity.component.jetpack.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.boco.whl.funddemo.config.Constant;


/**
 * @author:honglei92
 * @time:2018/8/22
 */
public class LifeCycleObserverTest implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onAny(LifecycleOwner owner, Lifecycle.Event event) {
        Log.e(Constant.TAG, "event: " + event.name());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        Log.e(Constant.TAG, "event: onCreate done");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        Log.e(Constant.TAG, "event: onDestroy done");

    }
}
