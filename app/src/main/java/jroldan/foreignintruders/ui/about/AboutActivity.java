package jroldan.foreignintruders.ui.about;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jroldan.foreignintruders.R;
import mehdi.sakout.aboutpage.AboutPage;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.about_icon_email)
                .setDescription("App del videojuego de Foreign Intruders hecho con Unity 3D")
                .addEmail("jroldan686@gmail.com")
                .addWebsite("https://github.com/jroldan686")
                .addFacebook("Jesús Roldán López")
                .addTwitter("@Jeshusito")
                .addGitHub("jroldan686")
                .create();

        setContentView(aboutPage);
    }
}
