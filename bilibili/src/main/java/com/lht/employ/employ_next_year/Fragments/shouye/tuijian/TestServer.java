package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

import com.google.gson.Gson;
import com.lht.employ.employ_next_year.beans.ObjectBean.ModuleDataResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LHT on 2017/12/6.
 */

public class TestServer {

    public static String response(){

        List<RecommendModule> list=new ArrayList<>();
        //第一个ViewPager
        RecommendModule module=new RecommendModule();
        module.setModuleType(ModuleDataResponse.SHOUYE_TUIJIAN_VIEWPAGE);
        List<String> imgsPath=new ArrayList<>();
        imgsPath.add("http://img5.imgtn.bdimg.com/it/u=1902392148,944724335&fm=27&gp=0.jpg");
        imgsPath.add("http://img3.duitang.com/uploads/item/201507/20/20150720222558_ct2hZ.thumb.224_0.png");
        imgsPath.add("http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1411/17/c0/41006804_1416212830026_800x600.jpg");
        imgsPath.add("http://img5.duitang.com/uploads/item/201412/09/20141209222801_vtM4V.jpeg");
        imgsPath.add("http://img3.imgtn.bdimg.com/it/u=1635092573,270363501&fm=214&gp=0.jpg");
        module.setViewPageImgPath(imgsPath);
        list.add(module);
        //添加若干个方块条目
        for (int i=0;i<14;i++){
            RecommendItem item=new RecommendItem();
            item.setDuration("20:"+i);
            item.setTimeOfPlay(100+i);
            item.setComments(400+i);
            item.setItemTag("TEST"+i);
            if (i%6==0){//编辑推荐
                item.setRecommend_ID(RecommendItem.EDITOR_RECOMMEND);
            }else if (i%9==0){//很多人推荐
                item.setRecommend_ID(RecommendItem.USER_RECOMMEND);
            }else {//没有推荐
                item.setRecommend_ID(RecommendItem.NO_RECOMMEND);
            }

        }
        //加载一个大模块
        RecommendModule bigModule=new RecommendModule();
        bigModule.setModuleType(RecommendModule.SHOUYE_TUIJIAN_BIG_NORMAL);
        RecommendItem bigItem=new RecommendItem();
        bigItem.setRecommend_ID(RecommendItem.ACTIVITY);
        bigItem.setItemTittle("一球成名");
        bigItem.setItemTag("[进行中]2017.12.01-2018.01.05");
        bigItem.setImagePath("http://img3.imgtn.bdimg.com/it/u=2523170748,1133792055&fm=27&gp=0.jpg");
        bigModule.setBigItem(bigItem);
        //添加若干个方块条目
        for (int i=0;i<14;i++){
            RecommendItem item=new RecommendItem();
            item.setDuration("30:"+i);
            item.setTimeOfPlay(100+i);
            item.setComments(400+i);
            item.setItemTag("S-TEST"+i);
            if (i%6==0){//编辑推荐
                item.setRecommend_ID(RecommendItem.EDITOR_RECOMMEND);
            }else if (i%9==0){//很多人推荐
                item.setRecommend_ID(RecommendItem.USER_RECOMMEND);
            }else {//没有推荐
                item.setRecommend_ID(RecommendItem.NO_RECOMMEND);
            }

        }
        Gson gson=new Gson();
        String jsonStr=gson.toJson(list);
        return jsonStr;
    }
}
