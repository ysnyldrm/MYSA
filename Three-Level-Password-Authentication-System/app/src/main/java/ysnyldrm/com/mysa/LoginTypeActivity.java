package ysnyldrm.com.mysa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_type);
    }

    public void fingerprintMethod (View view ){

        Intent intent = new Intent(this,FingerprintActivity.class);
        startActivity(intent);
    }

    public void passwordMethod (View view ){

        Intent intent = new Intent(this,PasswordActivity.class);
        startActivity(intent);
    }
}
