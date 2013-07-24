package com.sandwriting;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NewForRock extends Activity {

	  Button cancelButton;

	ImageView pic1, pic2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.new_for_rock);

		pic1=(ImageView)findViewById(R.id.imageView1);
		pic2=(ImageView)findViewById(R.id.imageView2);
		cancelButton = (Button) findViewById(R.id.button1);
                          
	pic1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			FingerPaint.showImage1 = true;
		//	Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();
			System.out.println("clicked on image 1");
		finish();	
		}
	});
	
pic2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			FingerPaint.showImage2 = true;
			System.out.println("clicked on image 2");
			finish();
			}	
	});


cancelButton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		finish();
	}
});
	}

}
