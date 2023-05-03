package game.controller;

import java.io.IOException;

/**
 * this is the runner that starts the game
 * @author elea4728
 *
 */
public class Runner
{
	public static void main (String [] args) throws IOException
	{
		Controller app = new Controller ();//
		app.start();
	}
}
  