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
	}/*
	private boolean solveH(int n){
		for (int i=0;i<board.length;i++){
			if (board[n][i] == 1){
				continue;
			}
			else{
				
		}
	}
	public boolean countSol(){
	}
	public String getCount(){
	}*/
	//HELPFUL FUNCTIONS
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
	public String board(){
		String ret = "";
		for (int i = 0; i<this.board.length; i++){ret+=Arrays.toString(this.board[i])+"\n";}
		return ret;
	}
	public static void main(String[] args){
		QueenBoard slay = new QueenBoard();
		System.out.println(slay.solve(6));
		slay.putQueen(3,2);
		System.out.println(slay.board());

	}
}
