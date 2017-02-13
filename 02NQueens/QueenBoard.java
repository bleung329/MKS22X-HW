import java.util.*;
public class QueenBoard{
	public int[][] board;
	public boolean solve(int n){
		board = new int[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
			}
		}
		return solveH(n);
	}
	private boolean solveH(int n){
		return true;
	}/*
	public boolean countSol(){
	}
	public String getCount(){
	}*/
	public static void main(String[] args){
		QueenBoard slay = new QueenBoard();
		slay.solve(3);
	}
}