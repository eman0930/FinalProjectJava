package game.pong;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame
{
	GamePanel panel;
	
	gameFrame()
	{
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
