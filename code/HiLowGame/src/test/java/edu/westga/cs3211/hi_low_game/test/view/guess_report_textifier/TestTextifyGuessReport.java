package edu.westga.cs3211.hi_low_game.test.view.guess_report_textifier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.westga.cs3211.hi_low_game.view.GuessReportTextifier;
import edu.westga.cs3211.hi_low_game.model.GuessReport;

public class TestTextifyGuessReport  {

	@Test
	public void testTextifyTooHigh() {
		GuessReportTextifier textifier = new GuessReportTextifier();
		
		String result = textifier.textifyGuessReport(GuessReport.TOO_HIGH);
		
		assertEquals(result, GuessReportTextifier.TOO_HIGH_TEXT, "checking result");
	}

	@Test
	public void testTextifyTooLow() {
		GuessReportTextifier textifier = new GuessReportTextifier();
		
		String result = textifier.textifyGuessReport(GuessReport.TOO_LOW);
		
		assertEquals(result, GuessReportTextifier.TOO_LOW_TEXT, "checking result");
	}

	@Test
	public void testTextifyCorrect() {
		GuessReportTextifier textifier = new GuessReportTextifier();
		
		String result = textifier.textifyGuessReport(GuessReport.CORRECT);
		
		assertEquals(result, GuessReportTextifier.CORRECT_TEXT, "checking result");
	}

	@Test
	public void testTextifyGuessLimitReached() {
		GuessReportTextifier textifier = new GuessReportTextifier();
		
		String result = textifier.textifyGuessReport(GuessReport.GUESS_LIMIT_REACHED);
		
		assertEquals(result, GuessReportTextifier.GUESS_LIMIT_REACHED_TEXT, "checking result");
	}
}
