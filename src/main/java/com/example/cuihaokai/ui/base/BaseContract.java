package com.example.cuihaokai.ui.base;

public interface BaseContract {

    interface BaseView{
        void showLoading();
        void dismissLoading();
    }

    //抽取所有Presenter共性，比如绑定，解绑
    interface BasePresenter<T extends BaseView> {
        void attchView(T view);

        void detachView();
    }

}
