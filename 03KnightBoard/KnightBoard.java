import java.util.Arrays;
public class KnightBoard{
    public int[][] board;
    public int[][] solution;
    public KnightBoard(int startingRows,int startingCols){
	board = new int[startingRows][startingCols];
    } 
    public String toString(){
	return "Hi";
    } //blank if you never called solve or when there is no solution
    /*
    public void solve(){
	if (solveH(0,0,0)){
	    System.out.println("YAY");}
	else{
	    System.out.println("AW");}
    } 

    private boolean solveH(int row ,int col, int level){
	if (level>startingRows*startingCols){
	    return true;
	}else{
	    
	    return (solveH(row+2,col+1,level+1)||
		    solveH(row-2,col+1,level+1)||
		    solveH(row+2,col-1,level+1)||
		    solveH(row-2,col-1,level+1)||
		    solveH(row+1,col+2,level+1)||
		    solveH(row-1,col+2,level+1)||
		    solveH(row+1,col-2,level+1)||
		    solveH(row-1,col-2,level+1))
		    }}*/ // level is the # of the knight
    public boolean putKnight(int x, int y, int level){
	try{
	    board[x][y] = level;
	    return true;
	}catch(Exception e){
	    return false;
	}
    }   
    public static void main(String[] args){
	KnightBoard ni = new KnightBoard(5,5);
	ni.putKnight(0,500,1);
       	System.out.println(Arrays.deepToString(ni.board));
    }

}
