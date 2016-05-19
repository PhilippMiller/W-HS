package aufgabe40;

public class GDI2MinichessSituation 
{

	char[][] board;           
	char player;
	
	public GDI2MinichessSituation(GDI2MinichessSituation sit) 
	{
		this.board = new char[4][4];
		for(int row=0; row < 4; row++)
			for(int col=0; col < 4; col++)
				this.board[row][col] = sit.board[row][col];
		this.player = sit.player;
	}

	public GDI2MinichessSituation() 
	{
		this.board = new char[4][4];
		for(int row=0; row < 4; row++)
			for(int col=0; col < 4; col++)
				if (row == 0)
					this.board[row][col] = 'B';
				else if (row == 3)
					this.board[row][col] = 'W';
				else
					this.board[row][col] = ' ';
		this.player = 'W';
	}
}
