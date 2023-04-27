package game.controller;

import java.io.IOException;

import game.view.*;

public class Controller
{
	private GamesFrame window;
	
	public Controller() throws IOException
	{
		this.window = new GamesFrame(this);
	}
	
	public void start()
	{
	
	}
	
	public void handleError(Exception error)
	{
		//JOptionPane.showMessageDialog(window, error.getMessage(), "Oops!", JOptionPane.ERROR_MESSAGE);
	}
}
