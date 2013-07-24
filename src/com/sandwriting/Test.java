package com.sandwriting;

import android.content.Context;
import android.media.MediaPlayer;


public  class Test {
	
	public static MediaPlayer start,mp,mp1;
	public static String extra="";
	
	public static MediaPlayer getMediaPlayer(){
		return mp;
	}
	
	public static void setMediaPlayer(Context c,String s){
		if(s.equals("num1")){
			System.err.println("in num1 if********88");
			if(mp!=null)
				if(mp.isPlaying())
					mp.stop();
				mp=null;
			mp = MediaPlayer.create(c, R.raw.dream_world);
			if(mp.isPlaying())
				mp.stop();
			if(mp1!=null)
			if(mp1.isPlaying()){
				mp1.stop();
			}
			if(start!=null)
				if(start.isPlaying()){
					start.stop();
				}
			mp.start();
		}
		else if(s.equals("num2")){
		//	if(mp1==null)
			if(mp1!=null)
				if(mp1.isPlaying())
					mp1.stop();
				mp1=null;
			 mp1 = MediaPlayer.create(c, R.raw.dolls);
			 if(mp1.isPlaying())
					mp1.stop();
			 
			 if(mp!=null)
				 if(mp.isPlaying())
					 mp.stop();
			 if(start!=null)
				 if(start.isPlaying())
					 start.stop();
			 mp1.start();
		}
	
		else{
			if(start!=null)
				if(start.isPlaying())
					start.stop();
			start=null;
			start = MediaPlayer.create(c, R.raw.dream_world);
			 if(start.isPlaying())
				 start.stop();
			 
			 start.start();
		}
	}

	
	public static void stop(){
		 if(Test.mp!=null)
				if(Test.mp.isPlaying()){
					Test.mp.stop();
					Test.mp.release();
					Test.mp=null;
				}
		
		
		
				if(Test.mp1!=null)
					if(Test.mp1.isPlaying()){
						Test.mp1.stop();
						Test.mp1.release();
						Test.mp1=null;
					}
	}
}