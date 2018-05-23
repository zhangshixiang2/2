package com.example.cuihaokai.comonent;

import com.example.cuihaokai.module.HttpModule;
import com.example.cuihaokai.ui.SatinImgFragment;
import com.example.cuihaokai.ui.SatinVideoFragment;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComonent {
    void inject(SatinImgFragment satinImgFragment);

    void inject(SatinVideoFragment satinVideoFragment);
}
