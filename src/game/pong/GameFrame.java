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
		
	}
}
