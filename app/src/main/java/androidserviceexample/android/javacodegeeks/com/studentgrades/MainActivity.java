package androidserviceexample.android.javacodegeeks.com.studentgrades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find screen elements
        final TextView gradestext = findViewById(R.id.textline);
        Button zeroGrades = findViewById(R.id.zero_button);
        Button setGrades = findViewById(R.id.set_button);
        Button getGrades = findViewById(R.id.get_button);


        //initialize grades
        final Grades grades = new Grades("", "", "", "");

        // Set a click listener on that View (Numbers)
        zeroGrades.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //zero variables
                grades.setmBiology("E");
                grades.setmEnglish("E");
                grades.setmHistory("E");
                grades.setmMath("E");

                CharSequence text = "Zeroize grades";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });


        // Set a click listener on that View (Numbers)
        setGrades.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Apply new grades
                grades.setmBiology("A");
                grades.setmEnglish("B");
                grades.setmHistory("C");
                grades.setmMath("D");

            }
        });

        // Set a click listener on that View (Numbers)
        getGrades.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //read grades and put in textline

                //gradestext.setText("Name: Jeff ;" + bioGrade + englGrade + histGrade + mathGrade);
                String text = getString(R.string.grade_text, grades.getmBiology(), grades.getmEnglish(), grades.getmHistory(), grades.getmMath());
                gradestext.setText(text);

            }
        });

    }
}
