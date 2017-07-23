package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreATeam=0;
    int scoreBTeam=0;
    public void displayForTeamA(int scoreATeam) {
        TextView scoreATeamView = (TextView) findViewById(R.id.scoreATeam);
        scoreATeamView.setText(String.valueOf(scoreATeam));
    }
    public void displayForTeamB(int scoreBTeam) {
        TextView scoreBTeamView = (TextView) findViewById(R.id.scoreBTeam);
        scoreBTeamView.setText(String.valueOf(scoreBTeam));
    }

    protected void increment(View view){
        scoreATeam=scoreATeam+3;
        displayForTeamA(scoreATeam);

    }
    protected void incrementB(View view){
        scoreBTeam=scoreBTeam+3;
        displayForTeamB(scoreBTeam);
    }


    protected void onlyTwo(View view){
        scoreATeam=scoreATeam+2;
        displayForTeamA(scoreATeam);
    }
    protected void onlyTwoB(View view){
        scoreBTeam=scoreBTeam+2;
        displayForTeamB(scoreBTeam);
    }
    protected void free(View view){
        scoreATeam=scoreATeam+1;
        displayForTeamA(scoreATeam);
    }
    protected void freeB(View view){
        scoreBTeam=scoreBTeam+1;
        displayForTeamB(scoreBTeam);
    }
    protected void reset(View view){
        scoreBTeam=0;
        scoreATeam=0;
        displayForTeamB(scoreBTeam);
        displayForTeamA(scoreATeam);

    }
}
