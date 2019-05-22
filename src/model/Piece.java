package model;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

import controller.Controller;

public class Piece {

	private BufferedImage tile;
	private int[][] coordinates;
	private int posX;
	private int posY;
	private int size;

	public Piece() {
	}

	/*
	 * Inicia la pieza
	 * @param tile Otorga la imagen necesaria para la creación de la pieza
	 * @param coordinates Indican la posición de la pieza en el tablero
	 */
	
	public Piece(BufferedImage tile, int[][] coordinates) {
		this.tile = tile;
		this.coordinates = coordinates;
		this.posX = 3;
		this.posY = 0;
		this.size = 30;
	}

	/*
	 * Muestra la pieza
	 * 
	 * @param g Parámetro necesario para pintar la pieza
	 * @param posX Posición en el vector X
	 * @param posY Posición en el vector Y
	 */
	
	public void show(Graphics g, int posX, int posY) {
		Controller.t.start();
		this.posX=posX;
		this.posY=posY;
		for (int i = 0; i < coordinates.length; i++) {
			for (int j = 0; j < coordinates[0].length; j++) {
				if (coordinates[i][j] == 1) {
					g.drawImage(tile, j * size + this.posX * size, i * size + this.posY * size, null);
				}
			}
		}
	}
}