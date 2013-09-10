package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
	Button buttonPlus;
	Button buttonMinus;
	Button buttonMultiply;
	Button buttonDivide;
	EditText firstInput;
	EditText secondInput;
	EditText result;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonPlus = (Button)findViewById(R.id.buttonPlus);
		buttonPlus.setOnClickListener(this);
		buttonMinus = (Button)findViewById(R.id.buttonMinus);
		buttonMinus.setOnClickListener(this);
		buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
		buttonMultiply.setOnClickListener(this);
		buttonDivide = (Button)findViewById(R.id.buttonDivide);
		buttonDivide.setOnClickListener(this);
		firstInput = (EditText)findViewById(R.id.firstInput);
		secondInput = (EditText)findViewById(R.id.secondInput);
		result = (EditText)findViewById(R.id.result);

	}

	public void onClick(View view) {
		double first;
		double second;
		double answer;
		
		try {
			first = Double.parseDouble(firstInput.getText().toString());
		}	catch (NumberFormatException e1)	{
			firstInput.setText("Enter a number");
			first = 0.0;
		}	catch (Exception e1)	{
			firstInput.setText("Enter a number");
			first = 0.0;	
		}
		
		try {
			second = Double.parseDouble(secondInput.getText().toString());
		}	catch (NumberFormatException e2)	{
			secondInput.setText("Enter a number");
			second = 0.0;
		}	catch (Exception e1)	{
			secondInput.setText("Enter a number");
			second = 0.0;	
		}		
		
		
		switch (view.getId()) {
		case R.id.buttonPlus:
			answer = first + second;
			break;
		case R.id.buttonMinus:
			answer = first - second;
			break;
		case R.id.buttonMultiply:
			answer = first * second;
			break;		
		case R.id.buttonDivide:
			answer = first / second;
			break;
		default:
			answer = 0;
		}
		result.setText(Double.toString(answer));
	}
	
	
}