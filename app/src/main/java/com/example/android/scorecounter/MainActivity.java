package com.example.android.scorecounter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForA = 0;
    int scoreForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeForA(View v) {
        scoreForA = scoreForA + 3;
        displayForTeamA(scoreForA);
    }

    public void twoForA(View v) {
        scoreForA = scoreForA + 2;
        displayForTeamA(scoreForA);
    }

    public void oneForA(View v) {
        scoreForA = scoreForA + 1;
        displayForTeamA(scoreForA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threeForB(View v) {
        scoreForB = scoreForB + 3;
        displayForTeamB(scoreForB);
    }

    public void twoForB(View v) {
        scoreForB = scoreForB + 2;
        displayForTeamB(scoreForB);
    }

    public void oneForB(View v) {
        scoreForB = scoreForB + 1;
        displayForTeamB(scoreForB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScore(View v)
    {
        scoreForA=0;
        scoreForB=0;
        displayForTeamA(scoreForA);
        displayForTeamB(scoreForB);
    }

}