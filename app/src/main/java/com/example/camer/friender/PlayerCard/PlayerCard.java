package com.example.camer.friender.PlayerCard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.camer.friender.R;

public class PlayerCard extends AppCompatActivity {

    private ImageView mProfilePic;
    private ImageView mPref1;
    private ImageView mPref2;
    private ImageView mPref3;
    private ImageView mMostPlayed1;
    private ImageView mMostPlayed2;
    private ImageView mMostPlayed3;

    private TextView mPlayerID;
    private TextView mRanking;
    private TextView mDescription;
    private TextView mPreferences;
    private TextView mMostPlayedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_card);

        mProfilePic = (ImageView) findViewById(R.id.profilePic);
        mPref1 = (ImageView) findViewById(R.id.pref1);
        mPref2 = (ImageView) findViewById(R.id.pref2);
        mPref3 = (ImageView) findViewById(R.id.pref3);

        mMostPlayed1 = (ImageView) findViewById(R.id.mostPlayed1);
        mMostPlayed2 = (ImageView) findViewById(R.id.mostPlayed2);
        mMostPlayed3 = (ImageView) findViewById(R.id.mostPlayed3);
    }

}
