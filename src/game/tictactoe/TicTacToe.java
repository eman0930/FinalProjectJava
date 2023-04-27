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
	JButton[] buttons = new JButton[9];
	boolean player1_turn;

	TicTacToe()
	{

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 800);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);

		textField.setBackground(new Color(25, 25, 25));
		textField.setForeground(new Color(25, 255, 0));
		textField.setFont(new Font("Ink Free", Font.BOLD, 75));
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setText("Tic-Tac-Toe");
		textField.setOpaque(true);

		titel_panel.setLayout(new BorderLayout());
		titel_panel.setBounds(0, 0, 800, 100);

		button_panel.setLayout(new GridLayout(3, 3));
		button_panel.setBackground(new Color(150, 150, 150));

		for (int i = 0; i < 9; i++)
		{
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			// buttons[i].setText(" ");
		}

		titel_panel.add(textField);
		frame.add(titel_panel, BorderLayout.NORTH);
		frame.add(button_panel);

		firstTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		for (int i = 0; i < 9; i++)
		{
			if (e.getSource() == buttons[i])
			{
				if (player1_turn)
				{
					if (buttons[i].getText() == "")
					{
						buttons[i].setForeground(new Color(255, 0, 0));
						buttons[i].setText("X");
						player1_turn = false;
						textField.setText("O turn");
						check();
					}
				}
				else
				{
					if (buttons[i].getText() == "")
					{
						buttons[i].setForeground(new Color(0, 0, 255));
						buttons[i].setText("O");
						player1_turn = true;
						textField.setText("X turn");
						check();
					}
				}
			}
		}
	}

	public void firstTurn()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		if (random.nextInt(2) == 0)
		{
			player1_turn = true;
			textField.setText("X turn");
		}
		else
		{
			player1_turn = false;
			textField.setText("O turn");
		}
	}

	public void check()
	{
		if ((buttons[0].getText() == "X") && (buttons[1].getText() == "X") && (buttons[2].getText() == "X"))
		{
			xWins(0, 1, 2);
		}
		else if ((buttons[3].getText() == "X") && (buttons[4].getText() == "X") && (buttons[5].getText() == "X"))
		{
			xWins(3, 4, 5);
		}
		else if ((buttons[6].getText() == "X") && (buttons[7].getText() == "X") && (buttons[8].getText() == "X"))
		{
			xWins(6, 7, 8);
		}
		else if ((buttons[0].getText() == "X") && (buttons[3].getText() == "X") && (buttons[6].getText() == "X"))
		{
			xWins(0, 3, 6);
		}
		else if ((buttons[1].getText() == "X") && (buttons[4].getText() == "X") && (buttons[7].getText() == "X"))
		{
			xWins(1, 4, 7);
		}
		else if ((buttons[2].getText() == "X") && (buttons[5].getText() == "X") && (buttons[8].getText() == "X"))
		{
			xWins(2, 5, 8);
		}
		else if ((buttons[0].getText() == "X") && (buttons[4].getText() == "X") && (buttons[8].getText() == "X"))
		{
			xWins(0, 4, 8);
		}
		else if ((buttons[2].getText() == "X") && (buttons[4].getText() == "X") && (buttons[6].getText() == "X"))
		{
			xWins(2, 4, 6);
		}
		// check O win
		else if ((buttons[0].getText() == "O") && (buttons[1].getText() == "O") && (buttons[2].getText() == "O"))
		{
			oWins(0, 1, 2);
		}
		else if ((buttons[3].getText() == "O") && (buttons[4].getText() == "O") && (buttons[5].getText() == "O"))
		{
			oWins(3, 4, 5);
		}
		else if ((buttons[6].getText() == "O") && (buttons[7].getText() == "O") && (buttons[8].getText() == "O"))
		{
			oWins(6, 7, 8);
		}
		else if ((buttons[0].getText() == "O") && (buttons[3].getText() == "O") && (buttons[6].getText() == "O"))
		{
			oWins(0, 3, 6);
		}
		else if ((buttons[1].getText() == "O") && (buttons[4].getText() == "O") && (buttons[7].getText() == "O"))
		{
			oWins(1, 4, 7);
		}
		else if ((buttons[2].getText() == "O") && (buttons[5].getText() == "O") && (buttons[8].getText() == "O"))
		{
			oWins(2, 5, 8);
		}
		else if ((buttons[0].getText() == "O") && (buttons[4].getText() == "O") && (buttons[8].getText() == "O"))
		{
			oWins(0, 4, 8);
		}
		else if ((buttons[2].getText() == "O") && (buttons[4].getText() == "O") && (buttons[6].getText() == "O"))
		{
			oWins(2, 4, 6);
		}
		else
		{
			int checkTie = 0;
			for (JButton i : buttons)
			{
				if (i.getText() == "O" || i.getText() == "X")
				{
					checkTie++;
				}
				if (checkTie == 9)
				{
					tie();
				}
			}
		}
	}

	public void xWins(int a, int b, int c)
	{
		buttons[a].setBackground(Color.GREEN);
		buttons[a].setOpaque(true);
		buttons[b].setBackground(Color.GREEN);
		buttons[b].setOpaque(true);
		buttons[c].setBackground(Color.GREEN);
		buttons[c].setOpaque(true);

		for (int i = 0; i < 9; i++)
		{
			buttons[i].setEnabled(false);
		}
		textField.setText("X wins");
	}

	public void oWins(int a, int b, int c)
	{
		buttons[a].setBackground(Color.GREEN);
		buttons[a].setOpaque(true);
		buttons[b].setBackground(Color.GREEN);
		buttons[b].setOpaque(true);
		buttons[c].setBackground(Color.GREEN);
		buttons[c].setOpaque(true);

		for (int i = 0; i < 9; i++)
		{
			buttons[i].setEnabled(false);
		}
		textField.setText("O wins");
	}

	public void tie()
	{
		buttons[1].setBackground(Color.YELLOW);
		buttons[1].setOpaque(true);

		buttons[2].setBackground(Color.YELLOW);
		buttons[2].setOpaque(true);

		buttons[3].setBackground(Color.YELLOW);
		buttons[3].setOpaque(true);

		buttons[4].setBackground(Color.YELLOW);
		buttons[4].setOpaque(true);

		buttons[5].setBackground(Color.YELLOW);
		buttons[5].setOpaque(true);

		buttons[6].setBackground(Color.YELLOW);
		buttons[6].setOpaque(true);

		buttons[7].setBackground(Color.YELLOW);
		buttons[7].setOpaque(true);

		buttons[8].setBackground(Color.YELLOW);
		buttons[8].setOpaque(true);

		buttons[0].setBackground(Color.YELLOW);
		buttons[0].setOpaque(true);

		for (int i = 0; i < 9; i++)
		{
			buttons[i].setEnabled(false);
		}
		textField.setText("Tie");
	}

}
