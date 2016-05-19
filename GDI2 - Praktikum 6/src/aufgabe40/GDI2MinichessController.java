package aufgabe40;
import java.util.*;

public class GDI2MinichessController 
{
	GDI2MinichessGUI gui = null;
	GDI2MinichessState state = GDI2MinichessState.START;
	boolean humanPlaysWhite;
	boolean humanPlaysBlack;
	GDI2MinichessSituation situation;
	GDI2MinichessPosition from = null;
	
	public GDI2MinichessController(GDI2MinichessGUI gui, boolean humanPlaysWhite, boolean humanPlaysBlack) 
	{
		this.gui = gui;
		this.humanPlaysBlack = humanPlaysBlack;
		this.humanPlaysWhite = humanPlaysWhite;
		gui.setController(this);  //  Man kennt sich ...
		this.init();
	}
	
	public GDI2MinichessController(GDI2MinichessGUI gui) 
	{
		this(gui, false, false);
	}

	private void init()
	{
		situation = new GDI2MinichessSituation();
		enterNewState(GDI2MinichessState.WAIT_FOR_WHITE_MOVE_FROM);
	}
	
	public void buttonPressedEvent(GDI2MinichessPosition pos)
	{
		int row = pos.getRow();
		int col = pos.getCol();
		switch (state)
		{
			case START:  
			{
				System.out.println("Gemach... Gleich können Sie klicken!");
				break;
			}
			case WAIT_FOR_WHITE_MOVE_FROM:
			{
				if (situation.board[row][col] == 'W')
				{
					//  gültiges Ausgangsfeld angeklickt!
					this.from = pos;
					enterNewState(GDI2MinichessState.WAIT_FOR_WHITE_MOVE_TO);
				}
				else
				{
					System.out.println("So nicht!!");
				}
				break;
			}
			case WAIT_FOR_WHITE_MOVE_TO:
			{
				int fromRow = from.getRow();
				int fromCol = from.getCol();
				if (((col == fromCol) && (row == fromRow-1) && (situation.board[row][col] == ' ')) 
					||
					((col == fromCol-1) && (row == fromRow-1)&& (situation.board[row][col] == 'B'))
					||
					((col == fromCol+1) && (row == fromRow-1)&& (situation.board[row][col] == 'B')))
				{
					//  gültiges Zielfeld angeklickt
					GDI2MinichessMove move = new GDI2MinichessMove(from,pos);
					situation = doMove(situation,move);
					gui.resetHighlighting();
					gui.showSituation(situation);
					enterNewState(GDI2MinichessState.WAIT_FOR_BLACK_MOVE_FROM);
				}
				else
				{
					System.out.println("Da können Sie aber nicht hinziehen, nö nö!");
				}
				break;
			}
			case WAIT_FOR_BLACK_MOVE_FROM:
			{
				if (situation.board[row][col] == 'B')
				{
					//  gültiges Ausgangsfeld angeklickt!
					this.from = pos;
					enterNewState(GDI2MinichessState.WAIT_FOR_BLACK_MOVE_TO);
				}
				else
				{
					System.out.println("So nicht!!");
				}
				break;
			}
			case WAIT_FOR_BLACK_MOVE_TO:
			{
				int fromRow = from.getRow();
				int fromCol = from.getCol();
				if (((col == fromCol) && (row == fromRow+1) && (situation.board[row][col] == ' ')) 
					||
					((col == fromCol-1) && (row == fromRow+1)&& (situation.board[row][col] == 'W'))
					||
					((col == fromCol+1) && (row == fromRow+1)&& (situation.board[row][col] == 'W')))
				{
					//  gültiges Zielfeld angeklickt
					GDI2MinichessMove move = new GDI2MinichessMove(from,pos);
					situation = doMove(situation,move);
					gui.resetHighlighting();
					gui.showSituation(situation);
					enterNewState(GDI2MinichessState.WAIT_FOR_WHITE_MOVE_FROM);
				}
				else
				{
					System.out.println("Da können Sie aber nicht hinziehen, nö nö!");
				}
				break;
			}
			case END:
			{
				System.out.println("Zu spät... Game isch over");
				break;
			}
		}
	}
	
	private GDI2MinichessSituation doMove(GDI2MinichessSituation sit, GDI2MinichessMove move)
	{
		GDI2MinichessPosition from = move.getFrom();
		GDI2MinichessPosition to = move.getTo();
		GDI2MinichessSituation newSituation = new GDI2MinichessSituation(sit);
		newSituation.board[from.getRow()][from.getCol()] = ' ';
		newSituation.board[to.getRow()][to.getCol()] = sit.player;
		return newSituation;
	}

	public void escKeyPressedEvent()
	{
		switch (state)
		{
			case WAIT_FOR_WHITE_MOVE_TO:
			{
				gui.resetHighlighting();
				enterNewState(GDI2MinichessState.WAIT_FOR_WHITE_MOVE_FROM);
				break;
			}
			case WAIT_FOR_BLACK_MOVE_TO:
			{
				gui.resetHighlighting();
				enterNewState(GDI2MinichessState.WAIT_FOR_BLACK_MOVE_FROM);
				break;
			}
		    default:
		    	System.out.println("Da können Sie drücken soviel Sie wollen...");
		}
	}
	
	public void enterNewState(GDI2MinichessState newState)
	{
		this.state = newState;
		switch (state)
		{
			case START:  
			{
				System.out.println("Jetzt geht's los...");
				break;
			}
			case WAIT_FOR_WHITE_MOVE_FROM:
			{
				if (gameIsOver(situation))
					enterNewState(GDI2MinichessState.END);
				else if (!humanPlaysWhite)
				{
					this.situation.player = 'W';
					List<GDI2MinichessMove> possibleMoves = computePossibleMoves(situation);
					GDI2MinichessMove move = possibleMoves.get((int)(Math.random()*possibleMoves.size()));
					situation = doMove(situation,move);
					gui.resetHighlighting();
					gui.showSituation(situation);
					slowDownAndRelax();
					enterNewState(GDI2MinichessState.WAIT_FOR_BLACK_MOVE_FROM);
				}
				else
					this.situation.player = 'W';
				break;
			}
			case WAIT_FOR_WHITE_MOVE_TO:
			{
				gui.highlightFromField(from);
				List<GDI2MinichessPosition> possibleToFields = computePossibleToFields(from,situation.player);
				gui.highlightPossibleToFields(possibleToFields);
				break;
			}
			case WAIT_FOR_BLACK_MOVE_FROM:
			{
				if (gameIsOver(situation))
					enterNewState(GDI2MinichessState.END);
				else if (!humanPlaysBlack)
				{
					this.situation.player = 'B';
					List<GDI2MinichessMove> possibleMoves = computePossibleMoves(situation);
					GDI2MinichessMove move = possibleMoves.get((int)(Math.random()*possibleMoves.size()));
					situation = doMove(situation,move);
					gui.resetHighlighting();
					gui.showSituation(situation);
					slowDownAndRelax();
					enterNewState(GDI2MinichessState.WAIT_FOR_WHITE_MOVE_FROM);
				}
				else
					this.situation.player = 'B';
				break;
			}
			case WAIT_FOR_BLACK_MOVE_TO:
			{
				gui.highlightFromField(from);
				List<GDI2MinichessPosition> possibleToFields = computePossibleToFields(from,situation.player);
				gui.highlightPossibleToFields(possibleToFields);
				break;
			}
			case END:
			{
				System.out.println("Danke und Tschüss...");
				break;
			}
				
		}
	}

	private boolean gameIsOver(GDI2MinichessSituation sit) 
	{
		if (sit.player == 'W')
			for(int col=0; col < 4; col++)
				if (sit.board[0][col]=='W')
					return true;  // Weiss ist durchgekommen!
		if (sit.player == 'B')
			for(int col=0; col < 4; col++)
				if (sit.board[3][col]=='B')
					return true;  // Schwarz ist durchgekommen!
		for(int row=0; row < 4; row++)
			for(int col=0; col < 4; col++)
				if (sit.board[row][col]==sit.player)
					if ((sit.player == 'W')&&(sit.board[row-1][col] == ' '))
						return false;  // Weiss kann nach vorne (oben) ziehen!
					else if ((sit.player == 'B') && (sit.board[row+1][col] == ' '))
						return false;  // Schwarz kann nach vorne (unten) ziehen!
					else if ((sit.player == 'W') && (col>0) && (sit.board[row-1][col-1] == 'B'))
						return false;  // Weiss kann nach vorne-links schlagen!
					else if ((sit.player == 'W') && (col<3) && (sit.board[row-1][col+1] == 'B'))
						return false;  // Weiss kann nach vorne-rechts schlagen!
					else if ((sit.player == 'B') && (col>0) && (sit.board[row+1][col-1] == 'W'))
						return false;  // Schwarz kann nach vorne-rechts schlagen!
					else if ((sit.player == 'B') && (col<3) && (sit.board[row+1][col+1] == 'W'))
						return false;  // Schwarz kann nach vorne-links schlagen!
		return true;  // Anscheinend kein Zug mehr möglich, sonst wären wir schon vorher mal 
		              // mit return rausgeflogen...			
	}
	
	private List<GDI2MinichessPosition> computePossibleToFields(GDI2MinichessPosition from, char player)
	{
		List<GDI2MinichessPosition> possibleToFields = new ArrayList<GDI2MinichessPosition>();
		GDI2MinichessSituation sit = this.situation;
		int row = from.getRow();
		int col = from.getCol();
		if (sit.board[row][col]==player)
		{
			if ((sit.player == 'W')&&(sit.board[row-1][col] == ' '))
				possibleToFields.add(new GDI2MinichessPosition(row-1,col));
				// Weiss kann nach vorne (oben) ziehen!
			if ((sit.player == 'B') && (sit.board[row+1][col] == ' '))
				possibleToFields.add(new GDI2MinichessPosition(row+1,col));
				// Schwarz kann nach vorne (unten) ziehen!
			if ((sit.player == 'W') && (col>0) && (sit.board[row-1][col-1] == 'B'))
				possibleToFields.add(new GDI2MinichessPosition(row-1,col-1));  
				// Weiss kann nach vorne-links schlagen!
			if ((sit.player == 'W') && (col<3) && (sit.board[row-1][col+1] == 'B'))
				possibleToFields.add(new GDI2MinichessPosition(row-1,col+1));
				// Weiss kann nach vorne-rechts schlagen!
			if ((sit.player == 'B') && (col>0) && (sit.board[row+1][col-1] == 'W'))
				possibleToFields.add(new GDI2MinichessPosition(row+1,col-1));  
				// Schwarz kann nach vorne-rechts schlagen!
			if ((sit.player == 'B') && (col<3) && (sit.board[row+1][col+1] == 'W'))
				possibleToFields.add(new GDI2MinichessPosition(row+1,col+1)); 
				// Schwarz kann nach vorne-links schlagen!
		}
		return possibleToFields;
	}
	
	private List<GDI2MinichessMove> computePossibleMoves(GDI2MinichessSituation sit) 
	{
		List<GDI2MinichessMove> possibleMoves = new ArrayList<GDI2MinichessMove>();
		for(int row=0; row < 4; row++)
			for(int col=0; col < 4; col++)
			{
				GDI2MinichessPosition from = new GDI2MinichessPosition(row,col);
				List<GDI2MinichessPosition> possibleToFields = computePossibleToFields(from,sit.player);
				if (!possibleToFields.isEmpty())
					for(GDI2MinichessPosition to : possibleToFields)
						possibleMoves.add(new GDI2MinichessMove(from,to));	
			}
		return possibleMoves;
	}
	
	private void slowDownAndRelax() 
	{
		try
		{
		     Thread.sleep(1000);
		}
		catch(InterruptedException e){}
	}
}
