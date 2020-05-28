import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JLabel;





public class Overseer {
	//instance variables

	private GUI _g;
	//private calculate _c;
	private String _s;
	private String _f;
	private int _ni;
	private int _n;
	private int _correct;
	
	//constructor
	public Overseer() {
		_g = new GUI();
		_s = _g.in("num of question?");
		
		_g = new GUI();
		getPlayerIn();
	}
	
	// Gets the plater input and checks to see how many question left and what to say
	public void getPlayerIn() {
		calculate _c = new calculate();
		_n = Integer.parseInt(_s);
		_ni = Integer.parseInt(_s);
			while(_n>0) {
				_c = _g.updateMath();
				int an = _c.getAns();
				String s = _g.in("Enter answer");
				if(s.equals("exit")) {
					System.exit(0);
				}
				else {
					int p = Integer.parseInt(s);
					_c.setAns(p);
					check(p, an);
				}
				_n--;
			}
			_f = _g.in("You got " + _correct + " corect out of " + _ni + " for a percent of " + (int)((double)_correct/_ni *100) + "%" +"\n"
					+ "Type exit to exit or play again to play again");
			if(_f.equals("play again")) {
				_correct = 0;
				_s = _g.in("num of question?");
				getPlayerIn();
			}
			else if(_f.equals("replay")) {
				_g.display();
			}
			else {
				System.exit(0);
			}
			
	}

	//checks your answer based on user input and actually answer
	public void check(int p, int an) {
		
		if(p == an) {
			System.out.println("correct");
			_correct++;
			_g.msgJ(new JLabel("Correct, you have gotten " + _correct + " correct so far!"));
		}
		else {
			System.out.println("no");
			_g.msgJ(new JLabel("Incorrect! The correct answer was " + an));
		}
	}
	


	
	AbstractAction e = new AbstractAction() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
}
