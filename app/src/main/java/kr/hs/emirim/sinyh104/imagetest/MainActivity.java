package kr.hs.emirim.sinyh104.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyImage(getApplicationContext()));
    }
    class MyImage extends View {
        MyImage(Context context){
            super(context);

        }
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);

            Bitmap picture= BitmapFactory.decodeResource(getResources(),R.drawable.flowers);
            float cx=getWidth()/2.0f;
            float cy=getHeight()/2.0f;
            float x=(getWidth()-picture.getWidth())/2.0f;
            float y=(getHeight()-picture.getHeight())/2.0f;
            //canvas.rotate(180,cx,cy);//회전
            //canvas.translate(-150,200);//이동
            //canvas.scale(2,2,cx,cy);//크기변경//2배로
            canvas.skew(0.4f,0.4f);//비틀기(중심축??)
            canvas.drawBitmap(picture,x,y,null);
        }
    }
}
