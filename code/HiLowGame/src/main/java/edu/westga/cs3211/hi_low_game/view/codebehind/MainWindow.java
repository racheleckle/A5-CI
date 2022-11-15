package edu.westga.cs3211.hi_low_game.view.codebehind;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import edu.westga.cs3211.hi_low_game.model.HiLowGame;
import edu.westga.cs3211.hi_low_game.model.GuessReport;
import edu.westga.cs3211.hi_low_game.view.GuessReportTextifier;

/**
 * CodeBehind To Handle Processing for the MainWindow
 *
 * @author	CS 3211
 * @version Fall 2021
 */
public class MainWindow {       
	private HiLowGame gameManager;
	
	public static final String BAD_INPUT_TEXT = "Guess must be a valid integer.";
	
	@FXML private TextField guess;
	@FXML private TextArea result;
	@FXML private Button makeGuessButton;

	/**
	 * Handles the game action when a user selects the makeGuess button
	 * 
	 * @precondition none
	 * @postcondition calls HiLowGame::checkGuess with the provided guess and updates game state accordingly
	 * 
	 * @param event the ActionEvent generated when the button is pressed (not used by method)
	 */
	@FXML
	public void makeGuess(ActionEvent event) {
		int guess = -1;
		try {
			guess = Integer.parseInt(this.guess.getText());
		} catch (NumberFormatException e) {
			this.result.setText(MainWindow.BAD_INPUT_TEXT);
			return;
		}
		
		GuessReport result = this.gameManager.checkGuess(guess);
		String resultText = (new GuessReportTextifier()).textifyGuessReport(result);
		this.result.setText(resultText);
	}
	
	/**
	 * Handle initialization checks for the JavaFX components, and perform any
	 * necessary custom initialization.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	@FXML
	public void initialize() {
		this.gameManager = new HiLowGame();
	}
}
