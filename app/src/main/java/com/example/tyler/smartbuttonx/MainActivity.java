package com.example.tyler.smartbuttonx;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import android.view.Gravity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RelativeLayout;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button myButton = (Button)findViewById(R.id.startBtn);
        final RelativeLayout myLayout = (RelativeLayout)findViewById(R.id.activity_main);
        final TextView myTextView = (TextView)findViewById(R.id.ansTextView);
        final EditText myInput = (EditText)findViewById(R.id.inText);
        myLayout.setBackgroundColor(Color.GRAY);
        myButton.setText("Click me");
        //Set button onclicklistener
        myButton.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        int length = myInput.getText().length(); // finds length of the input number
                        for(int i = 0; i < length; i++)
                        {
                            char e = myInput.getText().charAt(i);
                            if(Character.isDigit(e) == false) //if character isnt a digit, then say so.
                            {
                                myTextView.setText("Sorry, "+myInput.getText()+" is not a number");
                                break;
                            }
                            else
                            {
                                if(Integer.parseInt(String.valueOf(myInput.getText())) % 2 == 0) //tests if number is even
                                {
                                    myTextView.setText("Your number is... "+myInput.getText()+"." +
                                            " And it is an even number!");
                                }
                                else if(Integer.parseInt(String.valueOf(myInput.getText())) % 2 != 0) //tests if number is odd.
                                {
                                    myTextView.setText("Your number is... "+myInput.getText()+"." +
                                            " And it is an odd number!");
                                }

                            }
                        }

                    }
                }
        );




    }

}
