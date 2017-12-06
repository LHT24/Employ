package com.lht.employ.employ_next_year.beans.ObjectBean;

import java.util.List;

/**
 * Created by LHT on 2017/12/6.
 */

public class ModuleDataResponse {



    private int moduleType;

    /**
     * 首页-推荐-图片轮播
     */
    public static int SHOUYE_TUIJIAN_VIEWPAGE=121;
    /**
     * 首页-推荐-普通列表项
     */
    public static int SHOUYE_TUIJIAN_NORMAL=122;
    /**
     * 首页-推荐-普通列表项(提示登录)
     */
    public static int SHOUYE_TUIJIAN_NORMAL_UNLOGIN=123;
    /**
     * 首页-推荐-普通列表项(大)
     */
    public static int SHOUYE_TUIJIAN_BIG_NORMAL=124;


    public int getModuleType() {
        return moduleType;
    }

    public void setModuleType(int moduleType) {
        this.moduleType = moduleType;
    }
}
