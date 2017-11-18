package jroldan.foreignintruders.ui.login;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import jroldan.foreignintruders.R;
import jroldan.foreignintruders.base.BaseActivity;

/**
 * Created by jesus on 17/11/17.
 */

public class LoginViewImpl extends BaseActivity implements LoginView {

    private TextView txvSignUp;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txvSignUp = (TextView)findViewById(R.id.txvSignUp);
        txvSignUp.setPaintFlags(txvSignUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
