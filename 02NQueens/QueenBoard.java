public class QueenBoard
{
	public int[][] board;
	public int solCount = 0;
	public boolean counted = false;
	public String name()
	{
		return "Leung,Brian,6";
	}
	public QueenBoard(int n)
	{
		board = new int[n][n];
	}

	//COUNT YOUR SOLUTIONS
	public void countSolutions()
	{
		if(board.length == 1)
		{
			solCount = 1;
			return;
		}
		else
		{
			countSolutionsH(0);
			counted = true;
		}
	}
	public boolean countSolutionsH(int L)
	{
		if(L >= board.length)
		{
	    solCount++;
	    return true;
		}
		for(int r = 0 ; r < board.length; r ++)
		{
			if( isGood(r,L))
			{
				putQueen(r,L);
				countSolutionsH(L + 1);
				remQueen(r, L);	
			}
		}
		return false;
    }
	public int getSolutionCount()
	{
		if (!(counted))
			return -1;
		return solCount;
	}
	
	//SOLVE
	public boolean solve(int n)
	{
		return solveH(n);
	}
	private boolean solveH(int x)
	{
		if (x==board.length)
		{
			return true;
		}
		else
		{
			for (int i=0; i<board.length; i++)
			{
				if (isGood(x,i))
				{
					putQueen(x,i);
					if (solveH(x+1))
					{
						return true;
					}
					else
					{
						remQueen(x,i);
					}
				}
				
			}
			return false;
		}
	}
	
	//PUT
	public void putQueen(int x, int y)
	{
		for (int i = 0; i<board.length; i++)
		{
			board[x][i] = 1;
			board[i][y] = 1;
			if (!(x-i<0||y-i<0))
			{
			board[x-i][y-i] = 1;
			}
			if (!(x+i>board.length-1||y+i>board.length-1))
			{
			board[x+i][y+i] = 1;
			}
			if (!(x+i>board.length-1||y-i<0))
			{
			board[x+i][y-i] = 1;
			}
			if (!(x-i<0||y+i>board.length-1))
			{
			board[x-i][y+i] = 1;
			}
		}
		board[x][y] = 2;
	}
	//IS IT SAFE?
	
	public boolean isGood(int x, int y)
	{
		return board[x][y]==0;
	}
	
	//REMOVE
	public void remQueen(int x, int y)
	{
		for (int i = 0; i<board.length; i++)
		{
			board[x][i] = 0;
			board[i][y] = 0;
			if (!(x-i<0||y-i<0))
			{
			board[x-i][y-i] = 0;
			}
			if (!(x+i>board.length-1||y+i>board.length-1))
			{
			board[x+i][y+i] = 0;
			}
			if (!(x+i>board.length-1||y-i<0))
			{
			board[x+i][y-i] = 0;
			}
			if (!(x-i<0||y+i>board.length-1))
			{
			board[x-i][y+i] = 0;
			}
		}
		board[x][y] = 0;
		//Patch up the holes.
		for (int i=0; i<board.length; i++)
		{
			for (int j=0; j<board.length;j++)
			{
				if (board[i][j] == 2)
				{
					this.putQueen(i,j);
				}
			}
		}
	}
	
	//CLEAR
	public void clear()
	{
		for (int i = 0;i<board.length;i++)
		{
			for (int j=0; j<board.length; j++)
			{
				board[i][j] = 0;
			}
		}
	}
	
	//PRINT
	public String boord()
	{
		String ret = "Y->\n";
		for (int i = 0; i<board.length;i++)
		{
			for (int j = 0;j<board[i].length;j++)
			{
				ret+=""+board[i][j]+"\t";
			}
			ret+="\n";
		}
		return ret;
	}
	public String toString()
	{
    	return boord();
    }
}