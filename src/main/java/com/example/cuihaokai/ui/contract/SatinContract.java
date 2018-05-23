package com.example.cuihaokai.ui.contract;

import com.example.cuihaokai.bean.SatinBean;
import com.example.cuihaokai.ui.base.BaseContract;

public interface SatinContract {

    interface View extends BaseContract.BaseView{
        void showSatinimg(SatinBean satinBean);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void getSatinimg();
    }

}
