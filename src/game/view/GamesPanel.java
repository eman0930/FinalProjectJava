package game.view;

import game.controller.*;
import game.tictactoe.*;
import game.pong.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GamesPanel extends JPanel
{
	private Controller app;
	private MainTicTac main;
	private PongGame Pong;
	
	private JButton pingPongButton;
	private JButton ticTacToeButton;
	
	private JPanel ticTacPanel;
	private JPanel pingPongPanel;
	
	private SpringLayout layout;
	
	public GamesPanel(Controller app) throws IOException
	{
		super();
		this.app = app;
		
		this.layout = new SpringLayout();
		
		this.pingPongButton = new JButton("Play!");
		
		
		this.ticTacToeButton = new JButton("Play!");
		
		this.pingPongPanel = new JPanel();
		this.ticTacPanel = new JPanel();
		
		
		
		
		BufferedImage img = ImageIO.read(new File("pong.png"));
		pingPongButton.setIcon(new ImageIcon(img));
		pingPongButton.setHorizontalTextPosition(JButton.CENTER);
		pingPongButton.setVerticalTextPosition(JButton.CENTER);
		pingPongButton.setForeground(Color.RED);
		pingPongButton.setFont(new Font("Arial", Font.PLAIN, 40));
		
		
		BufferedImage img1 = ImageIO.read(new File("ticTacToe.png"));
		ticTacToeButton.setIcon(new ImageIcon(img1));
		ticTacToeButton.setHorizontalTextPosition(JButton.CENTER);
		ticTacToeButton.setVerticalTextPosition(JButton.CENTER);
		ticTacToeButton.setForeground(Color.BLACK);
		ticTacToeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.DARK_GRAY);
		this.pingPongPanel.add(pingPongButton);
		this.ticTacPanel.add(ticTacToeButton);
		this.pingPongPanel.setBackground(Color.DARK_GRAY);
		this.ticTacPanel.setBackground(Color.DARK_GRAY);
		
		this.add(ticTacPanel);
		this.add(pingPongPanel);
	}
	
	private void setupListeners()
	{
		ticTacToeButton.addActionListener(Click -> main.runGame(null));
		pingPongButton.addActionListener(Click -> Pong.play(null));
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, ticTacPanel, 80, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, ticTacPanel, -70, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, ticTacPanel, -250, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, ticTacPanel, -685, SpringLayout.EAST, this);
		
		layout.putConstraint(SpringLayout.NORTH, pingPongPanel, 0, SpringLayout.NORTH, ticTacPanel);
		layout.putConstraint(SpringLayout.EAST,  pingPongPanel, -225, SpringLayout.WEST, ticTacPanel);
		layout.putConstraint(SpringLayout.SOUTH,pingPongPanel, -0, SpringLayout.SOUTH, ticTacPanel);
		layout.putConstraint(SpringLayout.WEST,   pingPongPanel, 70, SpringLayout.WEST, this);
	}
	
	
	
	
}
