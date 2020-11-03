package org.techtown.my_shooting;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

public class Gauge {

    //에너지가 모두 소진 되었는지를 알려주는 변수
    boolean isTimeout;

    //게이지 이미지
    Bitmap imgGauge;

    //그림을 그릴 캔버스
    Canvas myCanvas;
    Paint gPaint, bPaint;

    //게이지의 배경이 그려질 곳
    int x, y;

    int step = 1; //에너지 소비량

    //게이지의 너비와 높이
    int width, height;

    private int startX;

    public Gauge(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        gPaint = new Paint();
        bPaint = new Paint();

        myCanvas = new Canvas();

        //게이지 이미지를 생성
        imgGauge = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        myCanvas.setBitmap(imgGauge); //생성한 비트맵을 캔버스에 추가

        //게이지에 그라데이션 효과
        gPaint.setShader(new LinearGradient(0, 0, 0, height, Color.BLUE, Color.RED, Shader.TileMode.CLAMP));
        /* 그라데이션 효과
            - new LinearGradient( 1, 2, 3, 4, 5, 6, 7);
            1. 그라데이션 시작점 x
            2. 그라데이션 시작점 y
            3. 그라데이션 끝 점 x
            4. 그라데이션 끝 점 y
            5. 그라데이션 시작 색
            6. 그라데이션 끝 색
            7. CLAMP : 무늬의 끝 부분을 계속 반복한다.
            7. MIRROR : 무늬를 반사시켜 계속 반복한다.
            7. REPEAT : 똑같은 무늬를 계속 반복한다.
         */

        //배경색을 그리기위해 bPaint
        bPaint.setColor(Color.WHITE);

    }//생성자

    //step값 설정
    public void setStep(int n) {
        step = n;
    }

    //에너지 소진여부를 반환하는 메서드
    public boolean isTimeout() {

        return isTimeout;
    }

    //게이지의 초기화
    public void initGauge() {
        startX = 0;
        isTimeout = false;
        //게이지 그리기
        paintGauge();
    }

    //에너지 연산
    public void progress() {
        if(startX >= width ) {
            //에너지가 모두 소진!!
            isTimeout = true;
        }

        if(!isTimeout) {
            //에너지가 모두 소진되지 않았다면...
            //startX값을 변경
            startX += step;
            paintGauge();
        }
    }

    private void paintGauge() {
        myCanvas.drawRect(new Rect(0, 0, width, height), bPaint);
        myCanvas.drawRect(new Rect(startX, 0, width, height), gPaint);
    }





}
