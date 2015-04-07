package com.android_lessons.belkin.day15sunrise;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получим ссылку на солнце
        ImageView sun = (ImageView) findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        // Подключаем анимацию к нужному View
        sun.startAnimation(sunRise);

        // Получим ссылку на часы
        ImageView clock = (ImageView) findViewById(R.id.clock);
        // анимация для вращения часов
        Animation clockTurn = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clock.startAnimation(clockTurn);

        // получим ссылку на часовую стрелку
        ImageView hour = (ImageView) findViewById(R.id.hour_hand);
// анимация для стрелки
        Animation hourTurn = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
// присоединяем анимацию
        hour.startAnimation(hourTurn);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
