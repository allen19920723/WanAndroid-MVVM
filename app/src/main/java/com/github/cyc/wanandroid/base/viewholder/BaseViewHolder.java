package com.github.cyc.wanandroid.base.viewholder;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.github.cyc.wanandroid.base.viewmodel.BaseItemViewModel;

/**
 * ViewHolder的基类
 * @param <DB> data binding
 * @param <VM> view model
 */
public abstract class BaseViewHolder<DB extends ViewDataBinding, VM extends BaseItemViewModel>
    extends RecyclerView.ViewHolder {

    protected DB mDataBinding;

    protected VM mViewModel;

    public BaseViewHolder(@NonNull ViewGroup parent, @LayoutRes int layoutResId) {
        super(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutResId,
            parent, false).getRoot());
        mDataBinding = DataBindingUtil.getBinding(itemView);

        initViewModel();
        bindViewModel();

        init();
    }

    public VM getViewModel() {
        return mViewModel;
    }

    /**
     * 初始化ViewModel
     */
    protected abstract void initViewModel();

    /**
     * 绑定ViewModel
     */
    protected abstract void bindViewModel();

    /**
     * 初始化
     */
    protected abstract void init();
}
