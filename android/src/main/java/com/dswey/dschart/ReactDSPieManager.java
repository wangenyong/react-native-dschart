package com.dswey.dschart;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by wangenyong on 16/9/19.
 */
public class ReactDSPieManager extends SimpleViewManager<DSPie> {
    public static final String REACT_CLASS = "DSPieView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public DSPie createViewInstance(ThemedReactContext context) {
        return new DSPie(context);
    }
}
