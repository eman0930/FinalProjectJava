package game.view;

import game.controller.*;
import javax.swing.*;
import java.awt.*;

public class GamesPanel extends JPanel
{
	private Controller app;
	
	private JButton pingPongButton;
	private JButton ticTacToeButton;
	
	private JPanel ticTacPanel;
	private JPanel pingPongPanel;
	
	private SpringLayout layout;
	
	public GamesPanel(Controller app)
	{
		super();
		this.app = app;
		
		this.pingPongButton = new JButton("Play!");
		this.ticTacToeButton = new JButton("Play!");
		
		this.pingPongPanel = new JPanel();
		this.ticTacPanel = new JPanel();
		
		this.layout = new SpringLayout();
		
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
		this.add(ticTacPanel);
		this.add(pingPongPanel);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, ticTacPanel, 250, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, ticTacPanel, -70, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, ticTacPanel, -250, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, ticTacPanel, -685, SpringLayout.EAST, this);
		
		layout.putConstraint(SpringLayout.NORTH, pingPongPanel, 0, SpringLayout.NORTH, ticTacPanel);
		layout.putConstraint(SpringLayout.EAST,  pingPongPanel, -225, SpringLayout.WEST, ticTacPanel);
		layout.putConstraint(SpringLayout.SOUTH,pingPongPanel, -0, SpringLayout.SOUTH, ticTacPanel);
		layout.putConstraint(SpringLayout.WEST,   pingPongPanel, 70, SpringLayout.WEST, this);
	}
	
	
	
	
}
