import java.util.*;
public class QueenBoard{
	public int[][] board;
		
	public String name(){
		return "Leung,Brian,6";
	}
	public QueenBoard(int n){
		board = new int[n][n];
	}
	
	public void solve(int n){
		solveH(n);
	}
	
	/*public boolean countSol(){
	}
	
	public String getCount(){
	}*/
	
	//HELPFUL FUNCTIONS
	private boolean solveH(int x){
		if (x>=board.length){
			return true;
		}else{
			if(){
			}else{
				
			}
			return solveH(x+1);
		}
		return false;
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
	public String board(){
		String ret = "";
		for (int i = 0; i<this.board.length; i++){ret+=Arrays.toString(this.board[i])+"\n";}
		return ret;
	}
	public static void main(String[] args){
		QueenBoard slay = new QueenBoard(6);
		//System.out.println(slay.solve(6));
		slay.putQueen(3,2);
		slay.putQueen(2,4);
		System.out.println(slay.board());
		slay.remQueen(3,2);
		System.out.println(slay.board());
	}
}
