/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sandwriting;

import java.util.Set;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * This Activity appears as a dialog. It lists any paired devices and devices
 * detected in the area after discovery. When a device is chosen by the user,
 * the MAC address of the device is sent back to the parent Activity in the
 * result Intent.
 */
public class ObjectsListActivity extends Activity {
	// Debugging
	private static final String TAG = "ObjectsListActivity";

	private ArrayAdapter<String> mObjectsArrayAdapter;

	public MediaPlayer mp, mp1;
	String hello = "Hello!";
	String goodbye = "GoodBye!";
	public static int check = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Setup the window
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.objects_list);

		Button cancelButton = (Button) findViewById(R.id.button_cancel);
		cancelButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		SoundManager.instance().load(ObjectsListActivity.this);
		// Initialize array adapters.

		// Find and set up the ListView for paired devices
		ListView objectListView = (ListView) findViewById(R.id.lv_objects);
		objectListView.setAdapter(new StudentListAdapter(this));

		objectListView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				System.out.println("hii...the position is" + position);

				if (position == 0){
					//FingerPaint.showImage1 = true;
					Intent i = new Intent(ObjectsListActivity.this, NewForRock.class);
				startActivity(i);
				}
				if (position == 1){
					//FingerPaint.showImage2 = true;
					Intent i = new Intent(ObjectsListActivity.this, NewForMuzic.class);
					startActivity(i);
				}
			/*	if (position == 2) {
					check = 1;
					System.out.println("hello");
			//		GraphicsActivity.mPlay.stop();
					Test.setMediaPlayer(ObjectsListActivity.this, "num1");
					// if(Test.getMediaPlayer().isPlaying()){
					// Test.getMediaPlayer().stop();
					// Test.getMediaPlayer().start();
					// }
					// mp = MediaPlayer.create(ObjectsListActivity.this,
					// R.raw.dolls);

					// managerOfSound(hello);
					// SoundManager.instance().startBackgroundMusic();
					
					 * if ( mp1.isPlaying()) { mp1.pause(); mp.start(); } else{
					 * mp.start(); }
					 
				}
				if (position == 3) {
					check = 2;
			//		GraphicsActivity.mPlay.stop();
					Test.setMediaPlayer(ObjectsListActivity.this, "num2");
					// if(!Test.getMediaPlayer().isPlaying()){
					// Test.getMediaPlayer().stop();
					// Test.getMediaPlayer().start();
					// }
					// mp = MediaPlayer.create(ObjectsListActivity.this,
					// R.raw.sequence);
					// if(!mp.isPlaying())
					// mp.start();
					// SoundManager.instance().startBackgroundMusic();
					// managerOfSound(goodbye);

					
					 * if ( mp.isPlaying()) { mp.pause(); mp1.start(); } else{
					 * mp1.start(); }
					 
				}
*/
				finish();
			}

		});

	}

	
	
	
	private class StudentListAdapter extends BaseAdapter {
		private Context mContext;
		private String[] mStudents = { "Stone","Music"};
		private int[] mDetailsStudent = {

		R.drawable.pic1, R.drawable.sound_icon};

		public StudentListAdapter(Context context) {
			mContext = context;
		}

		public int getCount() {
			return mStudents.length;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = vi.inflate(R.layout.object_list1, null);
			}
			TextView tvname = (TextView) v.findViewById(R.id.myTextView);
			ImageView tvdetail = (ImageView) v.findViewById(R.id.myImageView);
			// TextView abc = (TextView)v.findViewById(R.id.abc);

			tvname.setText(mStudents[position]);
			tvdetail.setImageResource(mDetailsStudent[position]);
			// abc.setText("SudheerReddy");
                 
			return v;
		}
	};
	/*
	 * protected void managerOfSound(String theText) { if (mp!=null) {
	 * mp.reset(); mp.release(); mp = null; System.out.println("null"); } if
	 * (theText == hello){ System.out.println("hello1"); mp =
	 * MediaPlayer.create(this, R.raw.dolls); mp.starkt(); }
	 * if(theText==goodbye){ System.out.println("goodbye1"); mp =
	 * MediaPlayer.create(this, R.raw.sequence); mp.start(); }
	 * 
	 * 
	 * 
	 * }
	 */

}
