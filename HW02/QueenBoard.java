import java.util.*;
public class QueenBoard{
	int[][] board;
	public boolean solve(int n){
		board = new int[n][n];
		Arrays.fill(board,0);
		return solveH(n);
	}
	private boolean solveH(int n){
		return true;
	}
	public boolean countSol(){
	}
	public String getCount(){
	}
	publlic static void main(String[] args){
		
	}
}