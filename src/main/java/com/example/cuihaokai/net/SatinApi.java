package com.example.cuihaokai.net;

import com.example.cuihaokai.bean.SainVideoBean;
import com.example.cuihaokai.bean.SatinBean;

import io.reactivex.Observable;

public class SatinApi {

    private SatinApiService satinApiService;
    private static SatinApi satinApi;

    private SatinApi(SatinApiService satinApiService) {
        this.satinApiService = satinApiService;
    }

    public static SatinApi getSatinApi(SatinApiService satinApiService){
        if (satinApi==null){
            satinApi=new SatinApi(satinApiService);
        }
        return satinApi;
    }

    public Observable<SatinBean> getSatinimg(){
        return satinApiService.getSatinimg();
    }

    public Observable<SainVideoBean> getSatinVideo(){
        return satinApiService.getSatinVideo();
    }
}
