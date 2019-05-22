package view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Next extends JPanel {

	private Rectangle bounds = new Rectangle(2 * Window.WIDTH / 3 + Window.PADDING, Window.PADDING,
			Window.WIDTH / 3 - 2 * Window.PADDING, Window.HEIGHT / 2 - Window.PADDING);
	private JLabel next;

	public Next() {
		setBackground(Color.WHITE);
		setBounds(bounds);
		setToolTipText("Next");
		setOpaque(false);

		try {
			next = new JLabel("Next");
			next.setFont(Background.font.deriveFont(20f));
			add(next);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
