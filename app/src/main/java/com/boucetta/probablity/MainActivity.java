package com.boucetta.probablity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<TextView> listView = new ArrayList<>();
    ArrayList<TextView> listFrequencies = new ArrayList<>();
    TextView probability;
    TextView zero, zeroFrequency;
    TextView one, oneFrequency;
    TextView two, twoFrequency;
    TextView three, threeFrequency;
    TextView four, fourFrequency;
    TextView five, fiveFrequency;
    TextView six, sixFrequency;
    TextView seven, sevenFrequency;
    TextView eight, eightFrequency;
    TextView nine, nineFrequency;
    TextView ten, tenFrequency;
    TextView eleven, elevenFrequency;

    Button launch;
    Button getResult;

    int[] occurrences = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int result = 0;
    int numberClick = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.textView0);
        zeroFrequency = findViewById(R.id.frequency0);
        one = findViewById(R.id.textView1);
        oneFrequency = findViewById(R.id.frequency1);
        two = findViewById(R.id.textView2);
        twoFrequency = findViewById(R.id.frequency2);
        three = findViewById(R.id.textView3);
        threeFrequency = findViewById(R.id.frequency3);
        four = findViewById(R.id.textView4);
        fourFrequency = findViewById(R.id.frequency4);
        five = findViewById(R.id.textView5);
        fiveFrequency = findViewById(R.id.frequency5);
        six = findViewById(R.id.textView6);
        sixFrequency = findViewById(R.id.frequency6);
        seven = findViewById(R.id.textView7);
        sevenFrequency = findViewById(R.id.frequency7);
        eight = findViewById(R.id.textView8);
        eightFrequency = findViewById(R.id.frequency8);
        nine = findViewById(R.id.textView9);
        nineFrequency = findViewById(R.id.frequency9);
        ten = findViewById(R.id.textView10);
        tenFrequency = findViewById(R.id.frequency10);
        eleven = findViewById(R.id.textView11);
        elevenFrequency = findViewById(R.id.frequency11);
        launch = findViewById(R.id.launch);
        getResult = findViewById(R.id.result);
        Collections.addAll(listView, zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven);
        Collections.addAll(listFrequencies, zeroFrequency, oneFrequency, twoFrequency, threeFrequency,
                fourFrequency, fiveFrequency, sixFrequency, sevenFrequency, eightFrequency, nineFrequency, tenFrequency,
                elevenFrequency);
        probability = findViewById(R.id.probability);
        probability.setText("" + 1f / 12f);


    }

    public void emptyTextView(ArrayList<TextView> list) {
        for (TextView item : list) {
            item.setText("");
        }
    }

    public void launchTrial(View v) {


        Random myRandom = new Random();


        emptyTextView(listView);
        emptyTextView(listFrequencies);
        result = myRandom.nextInt(12);
        listView.get(result).setText("" + result);
        switch (result) {
            case 0:
                occurrences[0]++;
                break;
            case 1:
                occurrences[1]++;
                break;
            case 2:
                occurrences[2]++;
                break;
            case 3:
                occurrences[3]++;
                break;
            case 4:
                occurrences[4]++;
                break;
            case 5:
                occurrences[5]++;
                break;
            case 6:
                occurrences[6]++;
                break;
            case 7:
                occurrences[7]++;
                break;
            case 8:
                occurrences[8]++;
                break;
            case 9:
                occurrences[9]++;
                break;
            case 10:
                occurrences[10]++;
                break;
            case 11:
                occurrences[11]++;
                break;


        }
        numberClick++;


    }

    public void getFrequencies(View v) {
        for (int i = 0; i <= 11; i++) {
            float a = occurrences[i];
            float b = numberClick;
            listFrequencies.get(i).setText("" + a / b);

        }

    }

    public void clear(View v) {
        numberClick = 0;
        for (int i = 0; i <= 11; i++) {
            listFrequencies.get(i).setText("");
            listView.get(i).setText("" + i);
            occurrences[i] = 0;

        }
    }
}