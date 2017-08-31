package hangman;

public class FredTheHangedMan {
	
	private int counter;
	private int word;
	
	public FredTheHangedMan(String word){
		this.counter = 0;
		this.word = word;
	}
	
	public void wrong(char letter){
		if(counter == 6){
			result(true);
		}
		counter++;
	}
	
	
	public String result(boolean isLoss){
		if(isLoss == true){
			return "You Lose! You Suck!";
		}
		else{
			return "You Win... You got lucky...";
		}
	}
}
