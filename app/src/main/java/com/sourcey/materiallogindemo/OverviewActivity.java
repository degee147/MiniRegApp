package com.sourcey.materiallogindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * Created by Ken on 26-Nov-15.
 */
public class OverviewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        ButterKnife.inject(this);

        String firstname = getIntent().getStringExtra(SignupActivity.FIRSTNAME_VALUE);
        TextView tvTitle = (TextView) findViewById(R.id.tvFirstName2);
        tvTitle.setText(firstname);

        String lastname = getIntent().getStringExtra(SignupActivity.LASTNAME_VALUE);
        TextView tvTitle2 = (TextView) findViewById(R.id.tvLastName2);
        tvTitle2.setText(lastname);

        String email = getIntent().getStringExtra(SignupActivity.EMAIL_VALUE);
        TextView tvTitle3 = (TextView) findViewById(R.id.tvEmail2);
        tvTitle3.setText(email);

        String country = getIntent().getStringExtra(SignupActivity.COUNTRY_VALUE);
        TextView tvTitle4 = (TextView) findViewById(R.id.tvCountry2);
        tvTitle4.setText(country);

        String gender = getIntent().getStringExtra(SignupActivity.GENDER_VALUE);
        TextView tvTitle5 = (TextView) findViewById(R.id.tvGender2);
        tvTitle5.setText(gender);

        String username = getIntent().getStringExtra(SignupActivity.USERNAME_VALUE);
        TextView tvTitle6 = (TextView) findViewById(R.id.tvUsername2);
        tvTitle6.setText(username);


//
    }

    public void registerClickHandler(View view) {
        Toast.makeText(OverviewActivity.this, "Congrats! Your registration is successful", Toast.LENGTH_LONG).show();
    }
}
