package edu.westga.cs3211.hi_low_game.view;

import edu.westga.cs3211.hi_low_game.model.GuessReport;

/**
 * Converts a GuessReport to a String representation
 *
 * @author	CS 3211
 * @version Fall 2021
 */
public class GuessReportTextifier {
	public static final String TOO_HIGH_TEXT = "Guess is too high, try again.";
	public static final String TOO_LOW_TEXT = "Guess is too low, try again.";
	public static final String GUESS_LIMIT_REACHED_TEXT = "Failed to guess the number, new number has been generated, try again.";
	public static final String CORRECT_TEXT = "Sucessfully guessed the number, new number has been generated, try again.";
	    
	/**
	 * Converts a GuessReport to a String representation.
	 * 
	 * @precondition result != null
	 * @postcondition none
	 * 
	 * @param result the GuessReport to convert
	 * 
	 * @return the String representation of the GuessReport
	 */   
	public String textifyGuessReport(GuessReport result) {
		String resultText = "";
		if (result == GuessReport.TOO_HIGH) {
			resultText = GuessReportTextifier.TOO_HIGH_TEXT;
		} else if (result == GuessReport.TOO_LOW) {
			resultText = GuessReportTextifier.TOO_LOW_TEXT;
		} else if (result == GuessReport.GUESS_LIMIT_REACHED) {
			resultText = GuessReportTextifier.GUESS_LIMIT_REACHED_TEXT;
		} else {
			resultText = GuessReportTextifier.CORRECT_TEXT;
		}
		return resultText;
	}
}
