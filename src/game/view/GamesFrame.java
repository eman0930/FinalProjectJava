package game.view;

import game.controller.*;

import java.io.IOException;

import javax.swing.*;

public class GamesFrame extends JFrame
{
	private Controller app;
	private GamesPanel panel;

	public GamesFrame(Controller app) throws IOException
	{
		super();
		this.app = app;
		this.panel = new GamesPanel(this.app);

		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("my GUI Application");
		this.setSize(1600, 1100);
		this.setResizable(false);
		this.setVisible(true);
	}

}
