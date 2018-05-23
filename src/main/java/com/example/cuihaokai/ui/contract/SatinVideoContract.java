package com.example.cuihaokai.ui.contract;

import com.example.cuihaokai.bean.SainVideoBean;
import com.example.cuihaokai.bean.SatinBean;
import com.example.cuihaokai.ui.base.BaseContract;

public interface SatinVideoContract {

    interface View extends BaseContract.BaseView{
        void showSatinVideo(SainVideoBean sainVideoBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void getSatinVideo();
    }

}
