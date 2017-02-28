import java.util.Arrays;

public class KnightBoard{
    public int[][] board;
    public int[][] solution;
    public KnightBoard(int startingRows,int startingCols){
	board = new int[startingRows][startingCols];
    } 
    public String toString(){
	if (solution==null){
	    return "";
	}
	return boord();
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
   	        if (goodSpots(row,col)){
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
    
    public int[][] goodSpots(int x, int y){
        int[][] spots = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
	    int[][] ret = new int[8][2];
	    for (int i = 0; i<8; i++){
	        try{
		        if (!(board[x+spots[i][0]][y+spots[i][1]]==0)){
		            ret[i][0] = x+spots[i][0];
                    ret[i][1] = y+spots[i][1];
		        }
		        else{
                    ret[i][0] = -1;
                    ret[i][1] = -1;
		        }
                }catch(Exception e){
		            ret[i][0] = -1;
                    ret[i][1] = -1;
	        }
	    }
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
