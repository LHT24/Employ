package com.lht.employ.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.constraint.solver.widgets.Rectangle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.List;

/**
 *zidingyi
 * Created by LHT on 2017/12/5.
 */

public class CustomView extends View {

    List<PercentData> dataList;
    int sunAngle;
    int sumSize;

    public CustomView(Context context) {
        super(context);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private Paint mPaint = new Paint();

    private void initPaint(){

        mPaint.setColor(Color.MAGENTA);     //设置画笔颜色
        mPaint.setStyle(Paint.Style.FILL);  //设置画笔模式为填充
        mPaint.setStrokeWidth(10f);         //设置画笔宽度为10px
        mPaint.setAntiAlias(true);//防锯齿
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }

    public void setData(List<PercentData> data){

        this.dataList=data;
        for (int i=0;i<dataList.size();i++){

            sumSize+=dataList.get(i).getSize();
        }
        invalidate();
    }
}
