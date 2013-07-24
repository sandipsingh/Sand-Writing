package com.sandwriting;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class NewForMuzic extends Activity {
	ImageView pic1, pic2, pic;
  Button cancelButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.new_for_muzic);
        
		pic1=(ImageView)findViewById(R.id.imageView1);
		pic2=(ImageView)findViewById(R.id.imageView2);
		cancelButton = (Button) findViewById(R.id.button1);

	pic1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {

			ObjectsListActivity.check = 1;
			System.out.println("hello");
			Test.setMediaPlayer(NewForMuzic.this, "num1");
			finish();
		}
	});
	
pic2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {


			ObjectsListActivity.check = 2;
			//		GraphicsActivity.mPlay.stop();
					Test.setMediaPlayer(NewForMuzic.this, "num2");
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
