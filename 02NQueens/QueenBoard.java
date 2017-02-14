import java.util.*;
public class QueenBoard{
	public int[][] board;
	public boolean solve(int n){
		board = new int[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				board[i][j] = 0;
			}
		}
		board[2][1] = 13;
		return true;
		//return solveH(n);
	}
	/*private boolean solveH(int n){
		for (int i=0;i<board.length;i++){
			if (board[n][i] == 1){
				continue;
			}
			else{
				
		}
	}/*
	public boolean countSol(){
	}
	public String getCount(){
	}*/
	//HELPFUL FUNCTIONS
	public void putQueen(int x, int y){
		for (int i = 0; i<board.length; i++){
			board[x][i] = 1;
			board[i][y] = 1;
		}
		board[x][y] = 2;
	}
	public String board(){
		String ret = "";
		for (int i = 0; i<this.board.length; i++){ret+=Arrays.toString(this.board[i]);}
		return ret;
	}
	public static void main(String[] args){
		QueenBoard slay = new QueenBoard();
		System.out.println(slay.solve(6));
		slay.putQueen(2,1);
		System.out.println(slay.board(s));

	}
}
