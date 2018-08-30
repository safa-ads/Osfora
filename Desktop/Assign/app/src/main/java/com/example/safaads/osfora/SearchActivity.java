package com.example.safaads.osfora;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {

    static final String EXTRA_NAME="ProfileID";
    private String profileID;
    EditText profileIDEdit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //X.setOnClickListener(new View.OnClickListener(){
        //  public void onClick(View v){
        Intent intent = new Intent (this, ProfileActivity.class);
        //profileIDEdit = (EditText) findViewById(R.id.);
        profileID = profileIDEdit.getText().toString(); //Get by @tim_cook orrrrr by id of user
        intent.putExtra(EXTRA_NAME, profileID);
        startActivity(intent);
    }

}
