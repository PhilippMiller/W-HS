package aufgabe40;

public enum GDI2MinichessState 
{
	START, 						// Startzustand zu Beginn des Spiels
	WAIT_FOR_WHITE_MOVE_FROM,   // Warten auf Ausgangsfeld Zug Weiss
	WAIT_FOR_WHITE_MOVE_TO, 	// Warten auf Zielfeld Zug Weiss
	WAIT_FOR_BLACK_MOVE_FROM,   // Warten auf Ausgangsfeld Zug Schwarz
	WAIT_FOR_BLACK_MOVE_TO,     // Warten auf Zielfeld Zug Schwarz
	END							// Endzustand
}
