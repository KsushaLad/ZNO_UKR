package com.ksusha.zno_ukr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Logo_Activity extends Activity {
    private Animation logo_animation;
    private TextView textView_animation;
    private ImageView imageView_animation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_layout);
        initialization();
        startMainActivity();
    }

    private void initialization() {
        logo_animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.logo_anim); //загрузка анимации в переменную
        textView_animation = findViewById(R.id.text_anim);
        imageView_animation = findViewById(R.id.image_anim);
        textView_animation.startAnimation(logo_animation); //запуск анимации
        imageView_animation.startAnimation(logo_animation);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    private void startMainActivity() {

        new Thread(() -> { //создание нового потока
            try {
                Thread.sleep(2500); //замирание потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent i = new Intent(Logo_Activity.this, MainActivity.class);
            startActivity(i);
        }).start();
    }
}
