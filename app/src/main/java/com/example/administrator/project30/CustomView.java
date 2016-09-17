package com.example.administrator.project30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by Administrator on 2016/9/17.
 */
public class CustomView extends View{
    public CustomView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //画笔
        Paint paint=new Paint();
        //画笔属性
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        //画笔宽度
        paint.setStrokeWidth(2);
        //绘制普通矩形,左右边距画布左，上下边距画布上
        canvas.drawRect(20,20,150,150,paint);
        //绘制三角形，内部填充

        //绘制文本
        paint.setTextSize(50);
        paint.setColor(Color.BLUE);
        paint.setStrikeThruText(true);
        canvas.drawText("世界你好！中国你好！", 10, 300, paint);
        Path pathText=new Path();
        pathText.addCircle(400,600,250, Path.Direction.CCW);
        canvas.drawTextOnPath("==============================================================================",
                pathText,0,10,paint);
    }
}