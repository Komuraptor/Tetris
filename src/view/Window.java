package view;

import javax.swing.JFrame;
import model.*;


/* 
 * Aplicación que genera un juego llamado Tetris
 * 
 * @author Adán Bouhaouita
 * @author Jesús Roldán
 * 
 * @version 2.1
 */

public class Window extends JFrame {

	public static final int WIDTH = 600, HEIGHT = 600, PADDING = 10;
	SoundEffects se = new SoundEffects();
	BackgroundMusic bm = new BackgroundMusic();

	/* 
	 * Genera la ventana donde se reproducirá el juego
	 * @since 1.0
	 * 
	 */
	
	public Window() {
		super("Tetris");
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		add(new Background());
		pack();
		bm.start();
	}

	/*
	 * Método principal del proyecto
	 * Crea la ventana y la hace visible
	 * 
	 * since 1.0
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		new Window().setVisible(true);
	}

}
