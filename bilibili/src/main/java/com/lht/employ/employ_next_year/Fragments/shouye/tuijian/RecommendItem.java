package com.lht.employ.employ_next_year.Fragments.shouye.tuijian;

/**
 * 推荐页面Item
 * Created by LHT on 2017/12/6.
 */

public class RecommendItem {

    public static int NO_RECOMMEND=0;
    public static int USER_RECOMMEND=1;
    public static int EDITOR_RECOMMEND=2;
    public static int ACTIVITY=3;
    public static int AD=4;

    /**
     * item标题
     */
    private String itemTittle;
    /**
     * item标签
     */
    private String itemTag;
    /**
     * 推荐ID，默认为0，没有特别推荐
     */
    private int recommend_ID;
    /**
     * 播放次数
     */
    private long timeOfPlay;
    /**
     * 评论数
     */
    private long comments;
    /**
     * 视频时长
     */
    private String duration;

    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getItemTittle() {
        return itemTittle;
    }

    public void setItemTittle(String itemTittle) {
        this.itemTittle = itemTittle;
    }

    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
    }

    public int getRecommend_ID() {
        return recommend_ID;
    }

    public void setRecommend_ID(int recommend_ID) {
        this.recommend_ID = recommend_ID;
    }

    public long getTimeOfPlay() {
        return timeOfPlay;
    }

    public void setTimeOfPlay(long timeOfPlay) {
        this.timeOfPlay = timeOfPlay;
    }

    public long getComments() {
        return comments;
    }

    public void setComments(long comments) {
        this.comments = comments;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
