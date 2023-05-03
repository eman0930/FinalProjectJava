package game.pong;

import java.awt.*;
import java.util.*;

public class Ball extends Rectangle
{
	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
	/**
	 * sets balls size and random direcshen it goes
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	Ball(int x,  int y, int width, int height)
	{
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection*initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection*initialSpeed);
	}
	/**
	 * makes random direcshn
	 * @param randomXDirection
	 */
	public void setXDirection(int randomXDirection)
	{
		xVelocity = randomXDirection;
	}
	/**
	 * makes random direshin
	 * @param randomYDirection
	 */
	public void setYDirection(int randomYDirection)
	{
		yVelocity = randomYDirection;
	}
	/**
	 * sets how fast it moves
	 */
	public void move()
	{
		x += xVelocity;
		y += yVelocity;
	}
	/**
	 * draws the ball
	 * @param g
	 */
	public void draw(Graphics g)
	{
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
	
	
	
	
}
