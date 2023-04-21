package game.tictactoe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener
{
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel titel_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textField = new JLabel();
	JButton [] buttons = new JButton[9];
	boolean player1_turn;
	
	TicTacToe()
	{
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textField.setBackground(new Color(25,25,25));
		textField.setForeground(new Color(25,255,0));
		textField.setFont(new Font("Ink Free",Font.BOLD,75));
		textField.setHorizontalAlignment(JLabel.CENTER);
		
	}
	
	
}
