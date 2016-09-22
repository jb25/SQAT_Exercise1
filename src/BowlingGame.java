import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame(){}

	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}


	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		bonus= new Frame(firstThrow, secondThrow);
		addFrame(bonus);
	}

	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		int score=0;
		
		for (int i = 0; i < frames.size(); i++) {

			if(!frames.get(i).isStrike()&&!frames.get(i).isSpare()){
				if(i==0){
					score=frames.get(i).score();
				}else{

					if(frames.get(i-1).isSpare()){

						score= score+frames.get(i).score()+frames.get(i).getFirstThrow();

					}else if(frames.get(i-1).isStrike()){
						score= score+frames.get(i).score()+frames.get(i).getFirstThrow()+frames.get(i).getSecondThrow();

					}else{

					score= score+ frames.get(i).score();
				}
			}

			if (frames.get(i).isStrike() ||frames.get(i).isSpare()) {
				score=score+10;}
		}
			if (i==9&&frames.get(i).isStrike() ||frames.get(i).isSpare()) {
				if (bonus.isSpare()||bonus.isStrike()) {
					score=score+frames.get(i).getFirstThrow()+bonus.score();
				}else{
					score=score+frames.get(i).getFirstThrow()+bonus.getFirstThrow();
				}
				
				score=score+frames.get(i).getFirstThrow()+bonus.score();
			}



	}



	return score;
}

public List<Frame> getFrames() {
	return frames;
}


}
