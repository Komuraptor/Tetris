package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Background extends JPanel {

	private BufferedImage bg;
	public static Font font;

	/*
	 * Añade un fondo al tablero
	 */
	
	public Background() {
		setPreferredSize(new Dimension(Window.WIDTH, Window.HEIGHT));
		setLayout(null);

		try {
			bg = ImageIO.read(getClass().getResource("/resource/bgimage.jpg"));
			InputStream input = getClass().getResourceAsStream("/resource/retro.ttf");
			font = Font.createFont(Font.TRUETYPE_FONT, input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		add(new Board_View());
		add(new Score());
		add(new Next());
		add(new Hold());

	}

	/*
	 * Metodo necesario para pintar imagenes
	 * 
	 *  @param g Parámetro necesario para pintar
	 */
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bg, 0, 0, null);
	}

}
