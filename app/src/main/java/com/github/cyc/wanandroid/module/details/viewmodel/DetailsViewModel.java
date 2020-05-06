package com.github.cyc.wanandroid.module.details.viewmodel;

import androidx.annotation.NonNull;

import com.github.cyc.wanandroid.base.viewmodel.BaseViewModel;
import com.github.cyc.wanandroid.data.DataManager;

/**
 * 详情页的ViewModel
 */
public class DetailsViewModel extends BaseViewModel {

    private DataManager mDataManager;

    public DetailsViewModel(@NonNull DataManager dataManager) {
        mDataManager = dataManager;
    }
}
