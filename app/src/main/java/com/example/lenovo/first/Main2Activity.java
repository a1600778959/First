package com.example.lenovo.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button tureButton;
    private Button falseButton;
    private Button nextButton;
    private TextView mQuestion;
    private Question[] mQuestions=new Question[]{
            new Question ( R.string.question1,true ),
            new Question ( R.string.question2,true ),
            new Question ( R.string.question3,false ),
    };
    private int mCurrentIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );
        mQuestion=(TextView)findViewById ( R.id.question_text_view );
        int question=mQuestions[mCurrentIndex].getTextresID ();
        mQuestion.setText ( question );
        tureButton=(Button)findViewById ( R.id.ture_button );
        tureButton.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( Main2Activity.this,
                        R.string.L,
                        Toast.LENGTH_SHORT).show ();
            }
        } );
        falseButton=(Button)findViewById ( R.id.false_button2 );
        falseButton.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( Main2Activity.this,
                        R.string.L,
                        Toast.LENGTH_SHORT).show ();
            }
        } );
        nextButton=(Button)findViewById ( R.id.next_button3 );
        nextButton.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                mCurrentIndex=mCurrentIndex+1;
                int question=mQuestions[mCurrentIndex].getTextresID ();
                mQuestion.setText ( question );
              if(mCurrentIndex==3)
                  finish ();

            }
        } );

    }

}

