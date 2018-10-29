package com.huan.wanandroid_huan.dagger.component;


import com.huan.wanandroid_huan.App;
import com.huan.wanandroid_huan.dagger.module.AllActivitysModule;
import com.huan.wanandroid_huan.dagger.module.AllFragmentsModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidInjectionModule.class, AndroidSupportInjectionModule.class,
        AllActivitysModule.class,
        AllFragmentsModule.class
})
public interface AppComponent {
    void inject(App app);
}
