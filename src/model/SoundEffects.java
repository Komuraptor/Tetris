package model;

import java.applet.AudioClip;
import java.net.URL;

public class SoundEffects extends Thread{
	
		/*
		 * Genera el sonido para el movimiento de la pieza
		 */
	
	    public void mov(){
	        try
	            {
	                AudioClip sonido; 
	                URL a = getClass().getResource("/recursos/Movimiento.wav");
	                sonido = java.applet.Applet.newAudioClip(a);
	                sonido.play();
	                Thread.sleep(200);
	                sonido.stop();
	            }
	            catch (Exception e){}
	    }
	
}
	

	
