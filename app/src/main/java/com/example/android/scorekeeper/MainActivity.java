package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    int foulsOnTeamA = 0;
    int foulsOnTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Count Fouls For Team A.
     */
    public void countOneFoulOnTeamA(View v) {
        foulsOnTeamA = foulsOnTeamA + 1;
        displayFoulsOnTeamA(foulsOnTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Count Fouls For Team B.
     */
    public void countOneFoulOnTeamB(View v) {
        foulsOnTeamB = foulsOnTeamB + 1;
        displayFoulsOnTeamB(foulsOnTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        foulsOnTeamA = 0;
        scoreTeamB = 0;
        foulsOnTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayFoulsOnTeamA(foulsOnTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsOnTeamB(foulsOnTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays numbers of fouls against Team A.
     */
    public void displayFoulsOnTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays fouls against Team B.
     */
    public void displayFoulsOnTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
}