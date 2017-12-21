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

        // Find the TextView
        TextView gradestext = (TextView) findViewById(R.id.textline);
        Button zeroGrades = (Button) findViewById(R.id.zero_button);
        Button setGrades = (Button) findViewById(R.id.set_button);
        Button getGrades = (Button) findViewById(R.id.get_button);

        //grades.setText("oioiio");

        //initialize grades
        final Grades grades = new Grades("Start grades class", "A", "B", "C", "E");

        // Set a click listener on that View (Numbers)
        zeroGrades.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //zero variables
                //CharSequence text = "Hello toast!";
                CharSequence text = grades.getMtoastText();
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
                //zero variables
            }
        });

        // Set a click listener on that View (Numbers)
        getGrades.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //zero variables
            }
        });

    }
}
