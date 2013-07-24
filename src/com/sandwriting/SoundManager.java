package com.sandwriting;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class SoundManager   
{
  private static SoundManager instance = new SoundManager();     
  private static Object lock = new Object();
  private MediaPlayer musicPlayer,musicPlayer1;
  public int soundButton;
  public int soundPhoto;
  private SoundPool soundPool;

  public static SoundManager instance()                
  {
    synchronized (lock)     
    {
      SoundManager localSoundManager = instance;             
      return localSoundManager;         
    }
  }        

  public void load(Context paramContext)           
  {
    this.musicPlayer = MediaPlayer.create(paramContext, R.raw.dolls);
    this.musicPlayer.setLooping(true);
    this.musicPlayer1 = MediaPlayer.create(paramContext, R.raw.sequence);
    this.musicPlayer1.setLooping(true);
    this.soundPool = new SoundPool(10, 3, 0);
 //   this.soundButton = this.soundPool.load(paramContext, 2130903040, 1);
  //  this.soundPhoto = this.soundPool.load(paramContext, 2130903042, 1);
  }

  public void playButtonClick(float paramFloat)
  {
    this.soundPool.play(this.soundButton, paramFloat, paramFloat, 1, 0, 1.0F);
  }

  public void playPhotoClick(float paramFloat)
  {
    this.soundPool.play(this.soundPhoto, paramFloat, paramFloat, 1, 0, 1.0F);
  }

  public void startBackgroundMusic()                           
  {   
	  
	  
	  

	  //if check=1
	  if(ObjectsListActivity.check==1){
		   if (!this.musicPlayer.isPlaying() && !this.musicPlayer1.isPlaying())        
		    {System.out.println("in first one");
		   // this.musicPlayer.pause();
		    
		    this.musicPlayer.seekTo(0);
		      this.musicPlayer.start();

		    }  
		   
		   else if (!this.musicPlayer.isPlaying() && this.musicPlayer1.isPlaying())        
		     {System.out.println("in third one");
		    this.musicPlayer1.stop();
		    System.out.println("hi...in here");
		            
		      this.musicPlayer.seekTo(0);
		       this.musicPlayer.start();
		     }
		   
		   else if (this.musicPlayer.isPlaying() && !this.musicPlayer1.isPlaying())        
		     {System.out.println("in 5th one");
		    // this.musicPlayer.pause();
		     this.musicPlayer.stop();

		      this.musicPlayer.seekTo(0);
		       this.musicPlayer.start();
		     }                                   
		     
		   
		   
		   else if (this.musicPlayer.isPlaying() && this.musicPlayer1.isPlaying())        
		     {System.out.println("both music running in firt phase.........");
		    // this.musicPlayer.pause();

		      this.musicPlayer.stop();
		       this.musicPlayer1.stop();                                                                   
		     }
		     
		   
	  }
	  
	  

	  
	  //if check=2
	  
	  if(ObjectsListActivity.check==2){
		  
		  
		  if (!this.musicPlayer.isPlaying() && !this.musicPlayer1.isPlaying())        
		    {System.out.println("in second one");

		    this.musicPlayer1.seekTo(0);
		    this.musicPlayer1.start();
		    }
		    
		   
		     
		  else if (!this.musicPlayer.isPlaying() && this.musicPlayer1.isPlaying())        
		     {System.out.println("in 4th one");
		  this.musicPlayer1.stop();

		      this.musicPlayer1.seekTo(0);
		       this.musicPlayer1.start();
		     }
		     
		     
		  else if (this.musicPlayer.isPlaying() && !this.musicPlayer1.isPlaying())        
		     {System.out.println("in 6th one");

		     this.musicPlayer.stop();
		      this.musicPlayer1.seekTo(0);
		       this.musicPlayer1.start();
		       System.out.println("check.id in sound class"+ObjectsListActivity.check);

		     }
		  
		     
		  else if (this.musicPlayer.isPlaying() && this.musicPlayer1.isPlaying())        
		     {System.out.println("both music runnong in 8th one.................");
		    // this.musicPlayer.pause();
		      this.musicPlayer.stop();
		       this.musicPlayer1.stop();
		     }
		  
		  
		  
	  }
 
     
  }  
  
  
  
  /*public void pause()                       
  {
    musicPlayer.pause(); 
    musicPlayer1.pause();             

  }*/
  
/*
  public void stopBackgroundMusic()                       
  {
    this.musicPlayer.pause();
    this.musicPlayer1.pause();             

  }*/
}

/* Location:           E:\dress up game 2\dressup 3\com.blogspot.strogonov.animechristmasdressupv1.2.3.apk\classes_dex2jar.jar
 * Qualified Name:     com.blogspot.strogonov.animechristmasdressup.SoundManager
 * JD-Core Version:    0.6.2
 */