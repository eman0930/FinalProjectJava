package game.pong;

import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle
{
	int id;
	int yVelocity;
	int speed = 10;
	/**
	 * sets up the padels
	 * @param x
	 * @param y
	 * @param PADDLE_WIDTH
	 * @param PADDLE_HEIGHT
	 * @param id
	 */
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id)
	{
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id=id;
	}
	/**
	 * looks for key pressed
	 * @param e
	 */
	public void keyPressed(KeyEvent e)
	{
		switch(id)
		{
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W)
			{
				setYDirection(-speed);
			}
			if(e.getKeyCode()==KeyEvent.VK_S)
			{
				setYDirection(speed);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				setYDirection(-speed);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				setYDirection(speed);
			}
			break;
		}
	}
	/**
	 * looks for when kee is relessed
	 * @param e
	 */
	public void KeyReleased(KeyEvent e)
	{
		switch(id)
		{
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W)
			{
				setYDirection(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_S)
			{
				setYDirection(0);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				setYDirection(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN);
			{
				setYDirection(0);
			}
			break;
		}
	}
	/**
	 * sets the speed
	 * @param yDirection
	 */
	public void setYDirection(int yDirection)
	{
		yVelocity = yDirection;
	}
	/**
	 * tells it to move
	 */
	public void move()
	{
		y= y + yVelocity;
	}
	/**
	 * draws
	 * @param g
	 */
	public void draw(Graphics g)
	{
		if(id==1)
			g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
}























