package com.buddysearch.presentation.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.buddysearch.presentation.presenter.BasePresenter;
import com.buddysearch.presentation.view.BaseView;

public abstract class BaseActivity<VIEW extends BaseView, PRESENTER extends BasePresenter> extends AppCompatActivity{

    protected VIEW view;

    protected PRESENTER presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

    protected abstract VIEW initView();
}
