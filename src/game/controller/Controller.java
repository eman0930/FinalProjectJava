package game.controller;

import java.io.IOException;

import game.pong.GameFrame;
import game.tictactoe.TicTacToe;
import game.view.*;

public class Controller
{
//	int idk = 1;
//	int yse = 2;
	private GamesFrame window;

	public Controller() throws IOException
	{
		this.window = new GamesFrame(this);
	}

	public void startPong()
	{
		GameFrame frame = new GameFrame(this);
	}
	
	public void statTicTac()
	{
		TicTacToe tictactoe = new TicTacToe();
	}

	public void handleError(Exception error)
	{
		// JOptionPane.showMessageDialog(window, error.getMessage(), "Oops!",
		// JOptionPane.ERROR_MESSAGE);
	}
	
	public void save(String path ,String score)
	{
		IOcontroller.saveTextToFile(this, path, score);
	}

	public void start()
	{
		// TODO Auto-generated method stub
		
	}
	
	private void iamgessinf()
	{
		
	}
}
