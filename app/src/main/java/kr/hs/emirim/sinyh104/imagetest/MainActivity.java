package kr.hs.emirim.sinyh104.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MyImage mImg;
    static final int ORIGINAL=0;
    static final int ROTATE=1;
    static final int TRANSLATE=2;
    static final int SCAIL=3;
    static final int SKEW=4;
    int choose=ORIGINAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linear1=(LinearLayout)findViewById(R.id.linear1);
        mImg=new MyImage(getApplicationContext());
        linear1.addView(mImg);
        //linear1.addView(new MyImage(getApplicationContext()));
    }

    public void transformImage(View v){
        switch(v.getId()){
            case R.id.but_rotate:
                choose=ROTATE;
                break;

            case R.id.but_translate:
                choose=TRANSLATE;
                break;

            case R.id.but_scale:
                choose=SCAIL;
                break;

            case R.id.but_skew:
                choose=SKEW;
                break;
        }
        mImg.setChoose(choose);
        mImg.invalidate();
    }

    //command + /
}
