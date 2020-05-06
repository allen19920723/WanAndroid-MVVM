package com.github.cyc.wanandroid.module.main.viewmodel.item;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;
import androidx.annotation.NonNull;

import com.github.cyc.wanandroid.base.viewmodel.BaseItemViewModel;
import com.github.cyc.wanandroid.http.model.Article;
import com.github.cyc.wanandroid.http.model.Navigation;
import com.github.cyc.wanandroid.navigator.DetailsNavigator;

/**
 * 导航的ViewModel
 */
public class NavigationViewModel extends BaseItemViewModel<Navigation> {

    public final ObservableField<String> name = new ObservableField<>();

    public final ObservableList<Article> dataList = new ObservableArrayList<>();

    private DetailsNavigator mDetailsNavigator;

    public NavigationViewModel(@NonNull DetailsNavigator detailsNavigator) {
        mDetailsNavigator = detailsNavigator;
    }

    @Override
    protected void setAllModel(@NonNull Navigation navigation) {
        name.set(navigation.getName());
        dataList.addAll(navigation.getArticles());
    }

    public void onClickTag(int position) {
        if (dataList.size() > position) {
            Article article = dataList.get(position);
            mDetailsNavigator.startDetailsActivity(article.getLink());
        }
    }
}
