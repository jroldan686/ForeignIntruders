package jroldan.foreignintruders.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import jroldan.foreignintruders.R;
import jroldan.foreignintruders.base.BaseActivity;
import jroldan.foreignintruders.ui.login.LoginViewImpl;

public class SplashActivity extends BaseActivity {

    ImageView imgvSplash;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgvSplash = (ImageView)findViewById(R.id.imgvSplash);
        imgvSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent();
                intent.setClass(SplashActivity.this, LoginViewImpl.class);
                startActivity(intent);
            }
        });
    }
}
