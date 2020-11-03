package org.techtown.my_canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //그림을 그리는 메서드
        //View를 상속받는 클래스는 onDraw()메서드를 통해 화면에 그림을 그린다.

        //그림을 그리기 위해서 필요한 붓과 같은 객체
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        //캔버스에 사각형을 그린다.
        canvas.drawRect(100, 200, 300, 400, paint);

        //테두리만 있는 도형을 그리기 위한 준비
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10); //테두리의 두께

        //캔버스에 원을 그린다.
        canvas.drawCircle(200, 600, 100, paint);
    }
}
