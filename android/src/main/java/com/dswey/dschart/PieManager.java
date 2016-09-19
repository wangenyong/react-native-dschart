package com.dswey.dschart;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by wangenyong on 16/9/19.
 */
public class PieManager extends SimpleViewManager<Pie> {
    public static final String REACT_CLASS = "DSPie";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public Pie createViewInstance(ThemedReactContext context) {
        return new Pie(context);
    }
}
