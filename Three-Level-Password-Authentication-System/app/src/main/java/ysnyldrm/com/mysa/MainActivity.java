package ysnyldrm.com.mysa;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText password;
    private EditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.input_name);
        email = (EditText) findViewById(R.id.input_email);
        password = (EditText) findViewById(R.id.input_password);
        phoneNumber = (EditText) findViewById(R.id.input_phoneNumber);



    }

    public void CreateAccount(View view ){

        boolean flag = true;

        String nameString = name.getText().toString();
        String emailString = email.getText().toString();
        String passwordString = password.getText().toString();
        String phoneNumberString = phoneNumber.getText().toString();

        if (TextUtils.isEmpty(nameString)) {
            name.setError("This field is required !");
            flag = false;
        } else if (TextUtils.isEmpty(emailString)) {
            email.setError("This field is required !");
            flag = false;

        } else if (TextUtils.isEmpty(passwordString)) {
            password.setError("This field is required !");
            flag = false;
        }
          else if(TextUtils.isEmpty(phoneNumberString)){
            phoneNumber.setError("This field is required !");
        }
          else if(flag == true){

            final ProgressDialog progressDialog = new ProgressDialog(this,
                    R.style.Theme_AppCompat_DayNight_Dialog);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Creating Account...");
            progressDialog.show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {



                }

            }, 1000);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    final Intent mainIntent = new Intent(MainActivity.this, LoginTypeActivity.class);
                    MainActivity.this.startActivity(mainIntent);
                    MainActivity.this.finish();
                    progressDialog.dismiss();
                }

            }, 3000);
        }



    }
}
