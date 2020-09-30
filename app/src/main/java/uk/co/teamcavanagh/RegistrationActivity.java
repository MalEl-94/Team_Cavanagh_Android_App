package uk.co.teamcavanagh;


import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationActivity extends AppCompatActivity {

    EditText nameTxt,emailTxt,passTxt,confPasstxt;
    Button regBtn;
    DatabaseReference dbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        nameTxt = (EditText)findViewById(R.id.nameTxt);
        emailTxt = (EditText)findViewById(R.id.emailTxt);
        passTxt = (EditText)findViewById(R.id.pwdTxt);
        confPasstxt = (EditText)findViewById(R.id.confPwdTxt);
        regBtn = (Button)findViewById(R.id.regBtn);
        dbRef = FirebaseDatabase.getInstance().getReference().child("Member");












        TextView login = (TextView)findViewById(R.id.lnkLogin);
        login.setMovementMethod(LinkMovementMethod.getInstance());

        //Login button listener
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
