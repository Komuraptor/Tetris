package model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Board {

//	private final int G_WIDTH = 10, G_HEIGHT = 20;
//	private int[][] grid = new int[G_WIDTH][G_HEIGHT];
	private Piece[] pieces = new Piece[7];
	private Piece next;
	private BufferedImage tile;
	private Random r;
	private static int id;
	private int size = 30;
	private int n;
	private int rotate;

	/*
	 * Genera la estructura de la spiezas y el tablero
	 * 
	 * @param rotate indica la rotación de la pieza
	 * 
	 */
	
	public Board(int rotate) {

		try {
			tile = ImageIO.read(getClass().getResource("/resource/tetromino.png"));
		} catch (IOException e) {
			System.out.println(e.toString());
		}

			int[][] s_piece = { { 0, 1, 1 }, { 1, 1, 0 } };
			int[][] z_piece = { { 1, 1, 0 }, { 0, 1, 1 } };
			int[][] i_piece = { { 1, 1, 1, 1 } };
			int[][] t_piece = { { 0, 1, 0 }, { 1, 1, 1 } };
			int[][] o_piece = { { 1, 1 }, { 1, 1 } };
			int[][] l_piece = { { 0, 0, 1 }, { 1, 1, 1 } };
			int[][] j_piece = { { 1, 0, 0 }, { 1, 1, 1 } };
			
			pieces[0] = new Piece(tile.getSubimage(0, 0, size, size), l_piece);
			pieces[1] = new Piece(tile.getSubimage(30, 0, size, size), i_piece);
			pieces[2] = new Piece(tile.getSubimage(60, 0, size, size), t_piece);
			pieces[3] = new Piece(tile.getSubimage(90, 0, size, size), z_piece);
			pieces[4] = new Piece(tile.getSubimage(120, 0, size, size), o_piece);
			pieces[5] = new Piece(tile.getSubimage(150, 0, size, size), s_piece);
			pieces[6] = new Piece(tile.getSubimage(180, 0, size, size), j_piece);				
	
	}

	/*
	 * Obtiene el array de piezas
	 * 
	 * @return <code>pieces</code> cada vez que se llama al método
	 * 
	 */
	
	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

	public Piece getNext() {
		r = new Random();
		n = r.nextInt(7);
		next = pieces[n];
		setId(n);
		return next;
	}
	
	public Piece getRotatedPiece(int rotate) {
		this.rotate = rotate;
		if(this.rotate==0) {
			int[][] s_piece_0 = { { 0, 1, 1 }, { 1, 1, 0 } };
			int[][] z_piece_0 = { { 1, 1, 0 }, { 0, 1, 1 } };
			int[][] i_piece_0 = { { 1, 1, 1, 1 } };
			int[][] t_piece_0 = { { 0, 1, 0 }, { 1, 1, 1 } };
			int[][] o_piece_0 = { { 1, 1 }, { 1, 1 } };
			int[][] l_piece_0 = { { 0, 0, 1 }, { 1, 1, 1 } };
			int[][] j_piece_0 = { { 1, 0, 0 }, { 1, 1, 1 } };
			
			pieces[0] = new Piece(tile.getSubimage(0, 0, size, size), l_piece_0);
			pieces[1] = new Piece(tile.getSubimage(30, 0, size, size), i_piece_0);
			pieces[2] = new Piece(tile.getSubimage(60, 0, size, size), t_piece_0);
			pieces[3] = new Piece(tile.getSubimage(90, 0, size, size), z_piece_0);
			pieces[4] = new Piece(tile.getSubimage(120, 0, size, size), o_piece_0);
			pieces[5] = new Piece(tile.getSubimage(150, 0, size, size), s_piece_0);
			pieces[6] = new Piece(tile.getSubimage(180, 0, size, size), j_piece_0);	
			
			next = pieces[n];
		}
		
		else if(this.rotate==1) {
			int[][] s_piece_1 = { { 1, 0 }, { 1, 1 }, { 0, 1 } };
			int[][] z_piece_1 = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
			int[][] i_piece_1 = { { 1 }, { 1 }, { 1 }, { 1 } };
			int[][] t_piece_1 = { { 1, 0 }, { 1, 1 }, { 1, 0 } };
			int[][] o_piece_1 = { { 1, 1 }, { 1, 1 } };
			int[][] l_piece_1 = { { 1, 0 }, { 1, 0 }, { 1, 1 } };
			int[][] j_piece_1 = { { 1, 1 }, { 1, 0 }, { 1, 0 } };
			
			pieces[0] = new Piece(tile.getSubimage(0, 0, size, size), l_piece_1);
			pieces[1] = new Piece(tile.getSubimage(30, 0, size, size), i_piece_1);
			pieces[2] = new Piece(tile.getSubimage(60, 0, size, size), t_piece_1);
			pieces[3] = new Piece(tile.getSubimage(90, 0, size, size), z_piece_1);
			pieces[4] = new Piece(tile.getSubimage(120, 0, size, size), o_piece_1);
			pieces[5] = new Piece(tile.getSubimage(150, 0, size, size), s_piece_1);
			pieces[6] = new Piece(tile.getSubimage(180, 0, size, size), j_piece_1);	
			
			next = pieces[n];
		}
		
		else if(this.rotate==2) {
			int[][] s_piece_2 = { { 0, 1, 1 }, { 1, 1, 0 } };
			int[][] z_piece_2 = { { 1, 1, 0 }, { 0, 1, 1 } };
			int[][] i_piece_2 = { { 1, 1, 1, 1 } };
			int[][] t_piece_2 = { { 1, 1, 1 }, { 0, 1, 0 } };
			int[][] o_piece_2 = { { 1, 1 }, { 1, 1 } };
			int[][] l_piece_2 = { { 1, 1, 1 }, { 1, 0, 0 } };
			int[][] j_piece_2 = { { 1, 1, 1 }, { 0, 0, 1 } };
			
			pieces[0] = new Piece(tile.getSubimage(0, 0, size, size), l_piece_2);
			pieces[1] = new Piece(tile.getSubimage(30, 0, size, size), i_piece_2);
			pieces[2] = new Piece(tile.getSubimage(60, 0, size, size), t_piece_2);
			pieces[3] = new Piece(tile.getSubimage(90, 0, size, size), z_piece_2);
			pieces[4] = new Piece(tile.getSubimage(120, 0, size, size), o_piece_2);
			pieces[5] = new Piece(tile.getSubimage(150, 0, size, size), s_piece_2);
			pieces[6] = new Piece(tile.getSubimage(180, 0, size, size), j_piece_2);	
			
			next = pieces[n];
		}
		
		else if(this.rotate==3) {
			int[][] s_piece_3 = { { 1, 0 }, { 1, 1 }, { 0, 1 } };
			int[][] z_piece_3 = { { 0, 1 }, { 1, 1 }, { 1, 0 } };
			int[][] i_piece_3 = { { 1 }, { 1 }, { 1 }, { 1 } };
			int[][] t_piece_3 = { { 0, 1 }, { 1, 1 }, { 0, 1 } };
			int[][] o_piece_3 = { { 1, 1 }, { 1, 1 } };
			int[][] l_piece_3 = { { 1, 1 }, { 0, 1 }, { 0, 1 } };
			int[][] j_piece_3 = { { 0, 1 }, { 0, 1 }, { 1, 1 } };
			
			pieces[0] = new Piece(tile.getSubimage(0, 0, size, size), l_piece_3);
			pieces[1] = new Piece(tile.getSubimage(30, 0, size, size), i_piece_3);
			pieces[2] = new Piece(tile.getSubimage(60, 0, size, size), t_piece_3);
			pieces[3] = new Piece(tile.getSubimage(90, 0, size, size), z_piece_3);
			pieces[4] = new Piece(tile.getSubimage(120, 0, size, size), o_piece_3);
			pieces[5] = new Piece(tile.getSubimage(150, 0, size, size), s_piece_3);
			pieces[6] = new Piece(tile.getSubimage(180, 0, size, size), j_piece_3);	
			
			next = pieces[n];
		}
		
		return next;
	}

	public void setNext(Piece next) {
		this.next = next;
	}

	public BufferedImage getTile() {
		return tile;
	}

	public void setTile(BufferedImage tile) {
		this.tile = tile;
	}

	public void setId(int id) {
		Board.id = id;
	}
	
	public static int getId() {
		return id;
	}
	
	public void setRotate(int rotate) {
		this.rotate = rotate;
	}
	
	public int getRotate() {
		return rotate;
	}
}