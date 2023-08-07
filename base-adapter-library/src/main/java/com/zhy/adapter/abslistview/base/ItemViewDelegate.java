package com.zhy.adapter.abslistview.base;


import android.view.View;

import com.zhy.adapter.abslistview.ViewHolder;

/**
 * Created by zhy on 16/6/22.
 */
public interface ItemViewDelegate<T>
{

    public abstract int getItemViewLayoutId();

    /**
     * 大前提: 所有ViewType的数据都放在datas里,所以需要一种手段来对数据集进行分组(分类)
     * 为ViewType分类,根据返回true刷选datas(eg item.isComMsg)
     * @return 过滤结果为true的,filter(datas){ item-> item.isComMsg }
     */
    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);



}
