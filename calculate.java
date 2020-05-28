
//this class is used to create get the answers for question
public class calculate {

	//instance variables
	private int[] _question;
	private int _answer;
	private int _pAns;
	private int _one;
	private int _sign;
	private int _three;

	//instance variables
	public calculate() {
		
		_one  = (int)(Math.random()*10);
		_sign = 11+ (int)(Math.random()*2);
		_three = (int)(Math.random()*10);
		
		if(_sign == 12 && _one < _three) {
			_three = 0;
		}
		
		int[] Q = {_one, _sign,_three};
		
		_answer = (_one + ((_sign == 12)? -1: 1)*_three);

		_question = Q;
	}

	//get answers/ questions
	public int[] getQ(){ return _question; };
	
	public int getAns() {
		return _answer;
	}

	//set the answer
	public void setAns(int p) {
		_pAns = p;
	}
	//make a toString method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return _one + ((_sign == 12)? "-": "+") + _three + " = " + _answer +  "\t\t\t\t\t\t\t" + _pAns+ "\n";
	}
	
}
