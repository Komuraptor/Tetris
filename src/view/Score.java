package view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Score extends JPanel {

	private Rectangle bounds = new Rectangle(2 * (Window.WIDTH / 3) + Window.PADDING,
			Window.HEIGHT / 2 + Window.PADDING, Window.WIDTH / 3 - 2 * Window.PADDING,
			Window.HEIGHT / 2 - 2 * Window.PADDING);
	private JLabel score;

	public Score() {
		setBackground(Color.WHITE);
		setBounds(bounds);
		setToolTipText("Score");
		setOpaque(false);

		try {
			score = new JLabel("Score");
			score.setFont(Background.font.deriveFont(20f));
			add(score);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
