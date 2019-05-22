package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.Timer;

import controller.Controller;
import model.Board;
import model.Piece;

@SuppressWarnings("serial")
public class Board_View extends JPanel {

	private Board b;
	private Piece p;
	private Rectangle bounds = new Rectangle(0, 0, Window.WIDTH / 2, Window.HEIGHT);
	private Timer timer;
	private Controller controller;
	private int posX = 3;
	private int posY = 0;
	private int rotate = 0;

	/*
	 * Inicia la vista del tablero
	 */
	public Board_View() {		
		setBackground(Color.BLACK);
		setBounds(bounds);
		setToolTipText("Board");
		setFocusable(true);

		b = new Board(0);
		p = b.getNext();
		controller = new Controller(this);
		addKeyListener(controller);		
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		p.show(g, getPosX(), getPosY());
		repaint();
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public void setPosRight() {
		this.posX ++;
		if(b.getRotate()==0^b.getRotate()==2) {
			if(Board.getId()==4&&posX>=8)
				posX=8;
			else if(Board.getId()==1&&posX>6)
				posX=6;
			else if((Board.getId()!=1&&Board.getId()!=4)&&posX>7) {
				posX=7;
			}		
		}
		else if(b.getRotate()==1^b.getRotate()==3) {
			if(Board.getId()==4&&posX>=8)
				posX=8;
			else if(Board.getId()==1&&posX>=10)
				posX=9;
			else if((Board.getId()!=1&&Board.getId()!=4)&&posX>=8)
				posX=8;
		}
	}
	
	public void setPosLeft() {
		this.posX --;
		if(posX<0)
			posX = 0;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosY() {
		if(b.getRotate()==0^b.getRotate()==2) {
			if(posY>=18&&Board.getId()!=1) {
				Controller.t.stop();
				p = b.getNext();	
				setInicialPosX();
				setInicialPosY();
			}
			else if(posY>=19&&Board.getId()==1) {
				Controller.t.stop();
				p = b.getNext();
				setInicialPosX();
				setInicialPosY();
			}
			else
				posY++;
		}
		else if(b.getRotate()==1^b.getRotate()==3) {
			if(posY>=17&&Board.getId()!=1&&Board.getId()!=4) {
				Controller.t.stop();
				p = b.getNext();
				setInicialPosX();
				setInicialPosY();
			}
			else if(posY>=16&&Board.getId()==1) {
				Controller.t.stop();
				p = b.getNext();
				setInicialPosX();
				setInicialPosY();
			}
			else if(posY>=18&&Board.getId()==4) {
				Controller.t.stop();
				p = b.getNext();
				setInicialPosX();
				setInicialPosY();
			}
			else
				posY++;
		}				
	}
	
	public void setPosYDown() {
		if(b.getRotate()==0^b.getRotate()==2) {
			if(Board.getId()!=1)
				posY=18;
			else
				posY=19;
		}
		else if(b.getRotate()==1^b.getRotate()==3) {
			if(Board.getId()==1)
				posY=16;
			else if(Board.getId()==4) 
				posY=18;
			else
				posY=17;				
		}
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setInicialPosX() {
		posX = 3;
	}
	
	public void setInicialPosY() {
		posY = 0;
	}
	
	/*
	 * Controla el comportamiento de la pieza a la hora de rotarla
	 */
	public void rotate() {
		rotate++;
		if(rotate>3)
			rotate=0; 
		if((Board.getId()!=1&&Board.getId()!=4)) {
			if((rotate==0^rotate==2)&&posX>=7) 
				posX=7;			
			else if((rotate==1^rotate==3)&&posX>=8) 
				posX=8;	
			if((rotate==0^rotate==2)&&posY>=18)
				posY=18;
			else if((rotate==1^rotate==3)&&posY>=17)
				posY=17;
		}
		else if(Board.getId()==1) {
			if((rotate==0^rotate==2)&&posX>=6)
				posX=6;
			else if((rotate==1^rotate==3)&&posX>=9)
				posX=9;
			if((rotate==0^rotate==2)&&posY>=16)
				posY=16;
			else if((rotate==1^rotate==3)&&posY>=19)
				posY=19;
		}			
		p = b.getRotatedPiece(rotate);
	}

}