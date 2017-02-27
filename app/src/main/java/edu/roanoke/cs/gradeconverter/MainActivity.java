package edu.roanoke.cs.gradeconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView userOut = (TextView)findViewById(R.id.output);
        EditText userIn  = (EditText)findViewById(R.id.UserGrade);
        int userGrade = Integer.parseInt(userIn.getText().toString());
        userOut.setText(convertNumberToLetterGrade(userGrade));
    }

    /*
     * Pre:  userGrade is a positive integer
     * Post: Returns a string, the conversion of the usersGrade into a letter using the standard
     *       grading scale.
     */
    public String convertNumberToLetterGrade(int userGrade) {
        String letterGrade = "F";
        if(userGrade >= 90) {
            letterGrade = "A";
        } else if (userGrade > 80) {
            letterGrade = "B";
        } else if (userGrade > 70) {
            letterGrade = "C";
        } else {
            letterGrade = "D";
        }

        return letterGrade;
    }
}
