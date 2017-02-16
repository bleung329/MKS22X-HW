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

    public void solve(){
	if (solveH(0,0,1)){
	    System.out.println("YAY");}
	else{
	    System.out.println("AW");}
    } 

    private boolean solveH(int row ,int col, int level){
	if (level==board.length*board[0].length){
	    return true;
	}else{
	    if (goodSpot(row,col)){
		putKnight(row,col,level);
		return (solveH(row+2,col+1,level+1)||
			solveH(row-2,col+1,level+1)||
			solveH(row+2,col-1,level+1)||
			solveH(row-2,col-1,level+1)||
			solveH(row+1,col+2,level+1)||
			solveH(row-1,col+2,level+1)||
			solveH(row+1,col-2,level+1)||
			solveH(row-1,col-2,level+1));
	    }
	    else{
		for(int i=0;i<board.length;i++)
		    for(int j=0;j<board[i].length;j++)
			{
			    board[i][j]=0;
			}
		return false;
	    }
	}
    } // level is the # of the knight
    public void putKnight(int x, int y, int level){
	board[x][y] = level;
    }
    public boolean goodSpot(int x, int y){
	try{
	    if (!(board[x][y]==0)){
		return false;
	    }else{
		return true;
	    }
	}catch(Exception e){
	    return false;
	}
    }
    public String boord(){
	String ret = "Y->\n";
	for (int i = 0; i<board.length;i++){
	    for (int j = 0;j<board[i].length;j++){
		ret+=""+board[i][j]+"\t";
	    }
	    ret+="\n";
	}
	System.out.println(ret);
	return ret;
    }
    public static void main(String[] args){
	KnightBoard ni = new KnightBoard(10,10);
	ni.boord();
	ni.solve();
	ni.boord();
    }

}
