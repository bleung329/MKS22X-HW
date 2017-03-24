																																																																																																																																		import java.util.*;
public class QueenBoard{
	public int[][] board;
	public int soulCount = -1;
	public String name(){
		return "Leung,Brian,6";
	}
	public QueenBoard(int n){
		board = new int[n][n];
	}
	
	public boolean solve(){
		return solveH(0);
	}
	//Counting stuff
	public int getSolutionCount(){
    	return soulCount;
    }
	public int countSolutions(){
		soulCount = 0;
		int it = 0;
		int it2 = 0;
		while (it2<board.length){
			putQueen(it,it2);
			if(solveH(it+1)){
				clear();
				soulCount+=1;
			}else{
				clear();
			}
			it2++;
		}
		return soulCount;
	}
    /**toString
     *and all nunbers that represent queens are replaced with 'Q' 
     *all others are displayed as underscores '_'
     */
    public String toString(){
    	return boord();
    }
	
	//HELPFUL FUNCTIONS
	private boolean solveH(int x){
		if (x==board.length){
			return true;
		}else{
			for (int i=0; i<board.length; i++){
				if (isGood(x,i)){
					putQueen(x,i);
					if (solveH(x+1)){
						return true;
					}else{
						remQueen(x,i);
					}
				}
				
			}
			return false;
		}
	}
	public boolean isGood(int x, int y){
		return board[x][y]==0;
	}
	public void putQueen(int x, int y){
		for (int i = 0; i<board.length; i++){
			board[x][i] = 1;
			board[i][y] = 1;
			if (!(x-i<0||y-i<0)){
			board[x-i][y-i] = 1;}
			if (!(x+i>board.length-1||y+i>board.length-1)){
			board[x+i][y+i] = 1;}
			if (!(x+i>board.length-1||y-i<0)){
			board[x+i][y-i] = 1;}
			if (!(x-i<0||y+i>board.length-1)){
			board[x-i][y+i] = 1;}
		}
		board[x][y] = 2;
	}
	public void remQueen(int x, int y){
		for (int i = 0; i<board.length; i++){
			board[x][i] = 0;
			board[i][y] = 0;
			if (!(x-i<0||y-i<0)){
			board[x-i][y-i] = 0;}
			if (!(x+i>board.length-1||y+i>board.length-1)){
			board[x+i][y+i] = 0;}
			if (!(x+i>board.length-1||y-i<0)){
			board[x+i][y-i] = 0;}
			if (!(x-i<0||y+i>board.length-1)){
			board[x-i][y+i] = 0;}
		}
		board[x][y] = 0;
		//Patch up the holes.
		for (int i=0; i<board.length; i++){
			for (int j=0; j<board.length;j++){
				if (board[i][j] == 2){
					this.putQueen(i,j);
				}
			}
		}
	}
	//Clear a board
	public void clear(){
		for (int i = 0;i<board.length;i++){
			for (int j=0; j<board.length; j++){
				board[i][j] = 0;
			}
		}
	}
	public String board(){
		String ret = "";
		for (int i = 0; i<this.board.length; i++){ret+=Arrays.toString(this.board[i])+"\n";}
		return ret;
	}
	public String boord(){
		String ret = "Y->\n";
		for (int i = 0; i<board.length;i++){
			for (int j = 0;j<board[i].length;j++){
				ret+=""+board[i][j]+"\t";
			}
			ret+="\n";
		}
		return ret;
	}/*
	public static void main(String[] args){
		QueenBoard slay = new QueenBoard(5);
		System.out.println(slay.countSolutions());
	}*/
}
