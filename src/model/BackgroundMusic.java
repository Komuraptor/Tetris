package model;

import java.applet.AudioClip;
import java.net.URL;

public class BackgroundMusic extends Thread{	
	
		/*
		 * Inicia la clase para incluir la música de fondo 
		 */
	
	    public BackgroundMusic(){
	        super();
	    }
	    
	    /*
	     * Empieza a reproducir la música
	     * 
	     * (non-Javadoc)
	     * @see java.lang.Thread#run()
	     */
	    
	    @Override
	    public void run(){
	        AudioClip sonido;
	            URL a = getClass().getResource("/resource/tetrisbackground.wav");
	            sonido = java.applet.Applet.newAudioClip(a);
	            
	        try{while (!Thread.currentThread().isInterrupted()) {            
	            sonido.loop();
	            Thread.sleep(38661);
	        }
	        }catch(InterruptedException ex){
	            sonido.stop();
	        }     
	    }	
}
