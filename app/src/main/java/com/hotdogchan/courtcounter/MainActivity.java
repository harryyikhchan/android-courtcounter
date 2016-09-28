package com.hotdogchan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Global Variable
    int scoreA = 0;
    int scoreB = 0;
    TextView teamAScore;
    TextView teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamBScore = (TextView) findViewById(R.id.teamBScore);
    }

    public void addThreePointsforTeamA(View view) {
        scoreA += 3; // score = score +3;
        displayScoreA(scoreA);
    }

    public void addTwoPointsforTeamA(View view) {
        scoreA += 2; // score = score +2;
        displayScoreA(scoreA);
    }

    public void freeThrowforTeamA(View view) {
        scoreA += 1; // score = score +1;
        displayScoreA(scoreA);
    }

    public void AddThreePointsforTeamB(View view) {
        scoreB += 3; // score = score +3;
        displayScoreB(scoreB);
    }

    public void addTwoPointsforTeamB(View view) {
        scoreB += 2; // score = score +2;
        displayScoreB(scoreB);
    }

    public void freeThrowforTeamB(View view) {
        scoreB += 1; // score = score +1;
        displayScoreB(scoreB);
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }

    public void displayScoreA(int number) {
        teamAScore.setText("" + number);
    }

    public void displayScoreB(int number) {
        teamBScore.setText("" + number);
    }
}
