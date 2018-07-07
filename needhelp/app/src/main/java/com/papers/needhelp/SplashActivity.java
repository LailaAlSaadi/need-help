package com.papers.needhelp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.papers.needhelp.common.SharedPreferencesManager;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_splash)
public class SplashActivity extends AppCompatActivity {

    @AfterViews
    public void startSplash() {
        new Handler().postDelayed(() -> {


            String uid = new SharedPreferencesManager(this).getString("uid", null);
            Intent i;
            if (uid == null) {
                i = new Intent(this, LoginActivity_.class);
            } else {
                i = new Intent(this, MainActivity_.class);
            }
            startActivity(i);

            finish();
        }, 3000);
    }
}
