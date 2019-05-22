package view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Hold extends JPanel {

	private Rectangle bounds = new Rectangle(Window.PADDING, Window.PADDING, Window.WIDTH / 3 - 2 * Window.PADDING,
			Window.HEIGHT / 2 - Window.PADDING);
	private JLabel hold;

	public Hold() {
		setBackground(Color.WHITE);
		setBounds(bounds);
		setToolTipText("Hold");
		setOpaque(false);

		try {
			hold = new JLabel("Hold");
			hold.setFont(Background.font.deriveFont(20f));
			hold.setForeground(Color.WHITE);
			add(hold);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
