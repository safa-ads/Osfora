package com.example.safaads.osfora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final actionsInfo info = new actionsInfo();

        //ImageButton retweet = findViewById(R.id.retweet);
        //retweet.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, info.getURL());
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            //}

       // });

       // ImageButton comment = findViewById(R.id.comment);
        //comment.setOnClickListener(new View.OnClickListener() {

          //  public void onClick(View v) {
                TextView cnum = findViewById(R.id.cnum);
                TextView rnum = findViewById(R.id.rnum);
                TextView hnum = findViewById(R.id.hnum);
                cnum.setText(numberFormat(info.getCommentNum()));
                rnum.setText(numberFormat(info.getRetweetNum()));
                hnum.setText(numberFormat(info.getHeartNum()));
            //}
        //});

    }



    public static String numberFormat(long count) {
        if (count < 1000) return "" + count;
        int exp = (int) (Math.log(count) / Math.log(1000));
        return String.format("%.1f %c",
                count / Math.pow(1000, exp),
                "kMGTPE".charAt(exp-1));
    }


}
