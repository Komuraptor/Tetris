package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import model.Piece;
import view.Board_View;

public class Controller implements KeyListener {
	private Piece p;
	private static Board_View bv;
	
	public static Timer t = new Timer(1000, new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			bv.setPosY();			
		}
	});
	
	/*
	 * Genera una nueva pieza
	 * 
	 * @param bv Recibe la vista del tablero
	 */
	
	public Controller(Board_View bv) {
		p = new Piece();
		Controller.bv = bv;
		
	}

	/*
	 * Recibe un evento que controla el comportamiento de la pieza
	 * 
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 * 
	 * @param e Recibe el evento a registrar
	 */
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {			
			bv.setPosRight();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			bv.setPosLeft();			
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			bv.setPosY();
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			bv.setPosYDown();
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			bv.rotate();
		}
	}	
	

	@Override
	public void keyReleased(KeyEvent e) {
		// unimplemented

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// unimplemented

	}

}