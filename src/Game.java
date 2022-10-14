import javax.swing.*;

public class Game {

	public static void main(String[] args) {
		final int WIDTH = 8;
		final int HEIGHT = 8;
		final int MINECOUNT = 10;
		
		int size = 25;
		
		JFrame FRAME = new JFrame();
		FRAME.setSize(400, 500);
		
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				JButton button = new JButton();
				button.setBounds(x + WIDTH / 4, y + HEIGHT / 4, size, size);
				
				FRAME.add(button);
			}
		}
		
		FRAME.setLayout(null);
		FRAME.setVisible(true);
	}

}
