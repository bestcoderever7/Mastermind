import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ooooo implements ActionListener {
	boolean hardmodeornot = false;
	boolean veryhardmodeornot = false;
	boolean impossiblemodeornot = false;
	boolean colors = false;
	int score = 0;
	int scoreplus = 100;
	int scoreplusminus = 10;
	int timesbeaten = 0;
	int level = 1;
	int maxlevel = 201;
	int clicks = 0;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton c1 = new JButton();
	JButton c2 = new JButton();
	JButton c3 = new JButton();
	JButton c4 = new JButton();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton delete = new JButton();
	JButton cool = new JButton();
	int lastbutton = 0;
	int w = 0;
	int x = 0;
	int y = 0;
	int z = 0;
	int bcolor;
	int b2color;
	int b3color;
	int b4color;
	int cbc;
	int cb2c;
	int cb3c;
	int cb4c;
	boolean colorChoice;
	boolean nameMode;

	public static void main(String[] args) {
		ooooo o = new ooooo();

	}

	public ooooo() {
		String keylimepie = JOptionPane.showInputDialog("Enter your name.");
		if(keylimepie.equals("Logan"))
		{
			colorChoice = true;
		}
		 if(colorChoice == true)
		 {
		 int con = JOptionPane.showConfirmDialog(null,
		 "Turn on the alternate set of colors?", "Turn on",
		 JOptionPane.YES_NO_OPTION);
		 if(con == JOptionPane.YES_OPTION)
		 {
		 colors = true;
		 }
		 }
		while (w == 0) {
			w = new Random().nextInt(5);
		}
		while (x == 0) {
			x = new Random().nextInt(5);
		}
		while (y == 0) {
			y = new Random().nextInt(5);
		}
		while (z == 0) {
			z = new Random().nextInt(5);
		}
		f.setTitle("Mastermind");
		f.setVisible(true);
		f.setSize(250, 133);
		f.add(p);
		b.addActionListener(this);
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		c1.addActionListener(this);
		p.add(c1);
		c2.addActionListener(this);
		p.add(c2);
		c3.addActionListener(this);
		p.add(c3);
		c4.addActionListener(this);
		b.setText("     ");
		b2.setText("     ");
		b3.setText("     ");
		b4.setText("     ");
		c1.setText("     ");
		c2.setText("     ");
		c3.setText("     ");
		c4.setText("     ");
		delete.setText("UNDO");
		delete.addActionListener(this);
		p.add(c4);
		p.add(delete);
		if (colors == true) {
			b.setBackground(Color.WHITE);
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			c1.setBackground(Color.CYAN);
			c2.setBackground(Color.ORANGE);
			c3.setBackground(Color.GRAY);
			c4.setBackground(Color.YELLOW);
		} else {
			b.setBackground(Color.WHITE);
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			c1.setBackground(Color.RED);
			c2.setBackground(Color.BLUE);
			c3.setBackground(Color.GREEN);
			c4.setBackground(Color.MAGENTA);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == c1) {
			if (colors == false) {
				if (clicks == 0) {
					b.setBackground(Color.RED);
					bcolor = 1;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.RED);
					b2color = 1;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.RED);
					b3color = 1;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.RED);
					b4color = 1;
					lastbutton = 4;
				}
			} else if (colors == true) {
				if (clicks == 0) {
					b.setBackground(Color.CYAN);
					bcolor = 1;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.CYAN);
					b2color = 1;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.CYAN);
					b3color = 1;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.CYAN);
					b4color = 1;
					lastbutton = 4;
				}
			}
		} else if (e.getSource() == c2) {
			if (colors == false) {
				if (clicks == 0) {
					b.setBackground(Color.BLUE);
					bcolor = 2;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.BLUE);
					b2color = 2;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.BLUE);
					b3color = 2;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.BLUE);
					b4color = 2;
					lastbutton = 4;
				}
			} else if (colors == true) {
				if (clicks == 0) {
					b.setBackground(Color.ORANGE);
					bcolor = 2;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.ORANGE);
					b2color = 2;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.ORANGE);
					b3color = 2;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.ORANGE);
					b4color = 2;
					lastbutton = 4;
				}
			}
		} else if (e.getSource() == c3) {
			if (colors == false) {
				if (clicks == 0) {
					b.setBackground(Color.GREEN);
					bcolor = 3;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.GREEN);
					b2color = 3;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.GREEN);
					b3color = 3;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.GREEN);
					b4color = 3;
					lastbutton = 4;
				}
			} else if (colors == true) {
				if (clicks == 0) {
					b.setBackground(Color.GRAY);
					bcolor = 3;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.GRAY);
					b2color = 3;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.GRAY);
					b3color = 3;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.GRAY);
					b4color = 3;
					lastbutton = 4;
				}
			}
		} else if (e.getSource() == c4) {
			if (colors == false) {
				if (clicks == 0) {
					b.setBackground(Color.MAGENTA);
					bcolor = 4;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.MAGENTA);
					b2color = 4;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.MAGENTA);
					b3color = 4;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.MAGENTA);
					b4color = 4;
					lastbutton = 4;
				}
			} else if (colors == true) {
				if (clicks == 0) {
					b.setBackground(Color.YELLOW);
					bcolor = 4;
					lastbutton = 1;
				} else if (clicks == 1) {
					b2.setBackground(Color.YELLOW);
					b2color = 4;
					lastbutton = 2;
				} else if (clicks == 2) {
					b3.setBackground(Color.YELLOW);
					b3color = 4;
					lastbutton = 3;
				} else if (clicks == 3) {
					b4.setBackground(Color.YELLOW);
					b4color = 4;
					lastbutton = 4;
				}
			}
		} else if (e.getSource() == b) {
			JOptionPane.showMessageDialog(null, "" + w + x + y + z);
			clicks--;
		} else if (e.getSource() == delete) {
			if (lastbutton == 1) {
				b.setBackground(Color.WHITE);
				lastbutton--;
			} else if (lastbutton == 2) {
				b2.setBackground(Color.WHITE);
				lastbutton--;
			} else if (lastbutton == 3) {
				b3.setBackground(Color.WHITE);
				lastbutton--;
			} else if (lastbutton == 4) {
				b4.setBackground(Color.WHITE);
				lastbutton--;
			}
			clicks-=2;
		}
		clicks++;
		if (clicks == 4) {
			String bu = "";
			String bu2 = "";
			String bu3 = "";
			String bu4 = "";
			if (w == bcolor) {
				bu = "C";
			} else {
				bu = "I";
			}
			if (x == b2color) {
				bu2 = "C";
			} else {
				bu2 = "I";
			}
			if (y == b3color) {
				bu3 = "C";
			} else {
				bu3 = "I";
			}
			if (z == b4color) {
				bu4 = "C";
			} else {
				bu4 = "I";
			}
			String hoo = "" + bu + bu2 + bu3 + bu4;
			if (hoo.equals("CCCC")) {
				score += scoreplus;
				JOptionPane.showMessageDialog(null,
						"You beat the level! \n Score: " + score);
				level++;
				w = new Random().nextInt(5);
				x = new Random().nextInt(5);
				y = new Random().nextInt(5);
				z = new Random().nextInt(5);
				while (w == 0) {
					w = new Random().nextInt(5);
				}
				while (x == 0) {
					x = new Random().nextInt(5);
				}
				while (y == 0) {
					y = new Random().nextInt(5);
				}
				while (z == 0) {
					z = new Random().nextInt(5);
				}
				scoreplus = 100;
				if (score > 999) {
					JOptionPane.showMessageDialog(null,
							"Congratulations! You have beaten Mastermind!");
					score = 0;
					if (level < maxlevel) {
						if (timesbeaten == 0) {
							JOptionPane.showMessageDialog(null,
									"You have unlocked hard mode!");
							f.setTitle("Hard Mode");
							scoreplusminus = 20;
							maxlevel = 51;
							hardmodeornot = true;
						} else if (timesbeaten == 1) {
							JOptionPane.showMessageDialog(null,
									"You have unlocked very hard mode!");
							f.setTitle("Very Hard Mode");
							scoreplusminus = 25;
							maxlevel = 41;
							veryhardmodeornot = true;
						} else if (timesbeaten == 2) {
							JOptionPane.showMessageDialog(null,
									"You have unlocked impossible mode!");
							f.setTitle("Impossible Mode");
							scoreplusminus = 50;
							maxlevel = 21;
							impossiblemodeornot = true;
						} else {
							JOptionPane
									.showMessageDialog(null,
											"You have fully completed Mastermind, congratulations!");
							timesbeaten = 0;
							colorChoice = true;
						}
						timesbeaten++;
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "" + hoo);
				scoreplus -= scoreplusminus;
			}
			b.setBackground(Color.WHITE);
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			clicks = 0;
		}
	}
}
