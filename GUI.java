import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.KeyStroke;



//this class is just  for display. does none of the calculations
public class GUI {

	//instance GUI variables
	
	JLabel[] arr = new JLabel[3];
	private  JTextField _t = new JTextField();
	int i;
	int a;
	int b;
	int cc;
	ArrayList<calculate> lst = new ArrayList<calculate>();
	
	//constuctor
	public GUI() {
		
		
		JFrame obj = new JFrame();
		obj.setVisible(true);
		int something = 960;
		
		
//		obj.setMaximumSize(new Dimension(something,(int)(something*15.0/20.0)));
//		obj.setMinimumSize(new Dimension(something,(int)(something*15.0/20.0)));
		
		
		obj.getContentPane().setLayout(new BoxLayout(obj.getContentPane(),BoxLayout.Y_AXIS));
		obj.setSize(500, 800);
		
			JPanel math = new JPanel(new GridLayout(1,3));
			math.setFocusable(false);
			obj.add(math);
			//math.setMaximumSize(new Dimension(something,(int)(something*1.0/3.0)));
			//math.setMinimumSize(new Dimension(something,(int)(something*1.0/3.0)));
			
			math.setMaximumSize(new Dimension(500,100));
			math.setMinimumSize(new Dimension(500,100));
			
			math.setPreferredSize(new Dimension(something,(int)(something*1.0/3.0)));
			
			for(int r = 0; r < arr.length; r++) {
				arr[r] = new JLabel();
				arr[r].setMaximumSize(new Dimension(40,40));
				arr[r].setMinimumSize(new Dimension(40,40));
				math.add(arr[r]);
				arr[r].setFocusable(false);
				
			}
			
			

			JPanel text = new JPanel();
			text.setMaximumSize(new Dimension(100,20));
			text.setMinimumSize(new Dimension(100,20));
			//text.setPreferredSize(new Dimension(100,100));
			text.setLayout(new BoxLayout(text, BoxLayout.Y_AXIS));
				
				text.add(_t);
				_t.setEditable(true);
				_t.setText("Enter Answer");
				_t.addActionListener(en);
				
				
				System.out.println(_t.getText());
			obj.add(text);
			
			
			JPanel bar = new JPanel();
			JProgressBar b = new JProgressBar(); 
			bar.setMaximumSize(new Dimension(100,100));
			bar.setMinimumSize(new Dimension(100,100));
			bar.setPreferredSize(new Dimension(100,100));
			bar.setLayout(new BoxLayout(bar, BoxLayout.Y_AXIS));
			b.setBackground(Color.RED);
			
			obj.add(bar);
			
			
			
			/*JPanel button = new JPanel();
			button.setMaximumSize(new Dimension(100,100));
			button.setMinimumSize(new Dimension(100,100));
			button.setPreferredSize(new Dimension(100,100));
			button.setLayout(new BoxLayout(button, BoxLayout.Y_AXIS));
				JButton exit = new JButton("Exit");
				exit.setAlignmentX(Component.CENTER_ALIGNMENT);
				button.add(exit);
				exit.addMouseListener(ex);
				JButton help = new JButton("help");
				help.setAlignmentX(Component.CENTER_ALIGNMENT);
				button.add(help);
				help.addMouseListener(h);
			obj.add(button);
			
			*/
			
			obj.pack();
			
			
			text.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
	        .put(KeyStroke.getKeyStroke("ENTER"), "enter");
			text.getActionMap().put("enter",en); 
			
			
			
	}
	
	private Icon one = new ImageIcon(getClass().getResource("one.png"));
	private Icon two = new ImageIcon(getClass().getResource("two.png"));
	private Icon three = new ImageIcon(getClass().getResource("three.png"));
	private Icon four = new ImageIcon(getClass().getResource("four.png"));
	private Icon five = new ImageIcon(getClass().getResource("five.png"));
	private Icon six = new ImageIcon(getClass().getResource("six.png"));
	private Icon seven = new ImageIcon(getClass().getResource("seven.png"));
	private Icon eight = new ImageIcon(getClass().getResource("eight.png"));
	private Icon nine = new ImageIcon(getClass().getResource("nine.png"));
	private Icon zero = new ImageIcon(getClass().getResource("zero.png"));
	private Icon sub = new ImageIcon(getClass().getResource("sub.png"));
	private Icon add = new ImageIcon(getClass().getResource("add.png"));
	
	
	
	//updates the GUI everytime a new question appears or when the user interacts with the  GUI
	public calculate updateMath() {
		int[] num = new int[3];
		calculate c = new calculate();
		for(int r = 0; r < c.getQ().length; r++) {
			if(c.getQ()[r] == 1) {
				arr[r].setIcon(one);
				num[r] = 1;
				System.out.println(1);
		
			}
			else if(c.getQ()[r] == 2) {

					arr[r].setIcon(two);
					num[r] = 2;
					System.out.println(2);
				
			}
			else if(c.getQ()[r] == 3) {
				
					arr[r].setIcon(three);
					num[r] = 3;
					System.out.println(3);
				
			}
			else if(c.getQ()[r] == 4) {
				
					arr[r].setIcon(four);
					num[r] = 4;
					System.out.println(4);
				
			}
			else if(c.getQ()[r] == 5) {
				
					arr[r].setIcon(five);
					num[r] = 5;
					System.out.println(5);
				
			}
			else if(c.getQ()[r] == 6) {
				
					arr[r].setIcon(six);
					num[r] = 6;
					System.out.println(6);
				
			}
			else if(c.getQ()[r] == 7) {
				
					arr[r].setIcon(seven);
					num[r] = 7;
					System.out.println(7);
				
			}
			else if(c.getQ()[r] == 8) {
				
					arr[r].setIcon(eight);
					num[r] = 8;
					System.out.println(8);
				
			}
			else if(c.getQ()[r] == 9) {
				
					arr[r].setIcon(nine);
					num[r] = 9;
					System.out.println(9);
				
			}
			else if(c.getQ()[r] == 0) {
				arr[r].setIcon(zero);
				num[r] = 0;
				System.out.println(0);
			}
			else if(c.getQ()[r] == 12) {
				arr[r].setIcon(sub);
				num[r] = 12;
				System.out.println("-");
			}
			else if(c.getQ()[r] == 11) {
				arr[r].setIcon(add);	
				num[r] = 11;
				System.out.println("+");
			}
			if(r == 2) {
				lst.add(c);
			}
		}
		
		 a = num[0];
		 b = num [2];
		
		if(num[1] == 12) {
			cc = a - b;
		}
		else {
			cc = a + b;
		}
		
		
		return c;
	}

	//Getter to get answer
	public String getA() {
		return _t.getText();
	}

	//checks if a click has occured to exit screen
	AbstractAction en = new AbstractAction() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = _t.getText();
			
			if(_t.getText().equals("exit")) {
				System.exit(0);
			}
			else {
				i = Integer.parseInt(s);
			}
			
			_t.setText("");
			
			
		} 
		
	};

	//initializes the display
	public void display() {
		String s = "Question\n and\n Answer \t\t\t Your Answer\n";
		for(calculate c : lst) {
			s += c.toString();
		}
		msg(s);
	}
	//auto generated GUI methods
	public void msg(Object msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void msgJ(JLabel msg) {
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void msgS(String msg) {
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
public void msgI(int msg) {
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	
	public int option(String[] options, JPanel jPanel) {
		return JOptionPane.showOptionDialog(
				null, 
				jPanel, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	public int option2(String[] options, JLabel jLabel) {
		return JOptionPane.showOptionDialog(
				null, 
				jLabel, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	public void println(String msg) {
		System.out.println(msg);
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
	
	

