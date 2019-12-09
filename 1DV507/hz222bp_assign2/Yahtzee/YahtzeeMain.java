package hz222bp_assign2.Yahtzee;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.ArrayList;

/*Assignment 2; Exercise 7
* @author Hailing Zhang(hz222bp)
* @since 2018-02-10
*/
public class YahtzeeMain extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	private int Count = 3;// Allow the user to roll the dice three times

	@Override
	public void start(Stage primaryStage) {
		Group group = new Group();
		// Showing the clue for left chances
		Text name = new Text(6, 21, "Yahtzee");
		name.setFont(Font.font(22));
		Text counter = new Text(100, 117, "You have " + Count + " roll(s) left.");

		// Statistics
		Yahtzee[] dice = new Yahtzee[5];
		dice[0] = new Yahtzee(5, 30);
		dice[1] = new Yahtzee(50, 30);
		dice[2] = new Yahtzee(95, 30);
		dice[3] = new Yahtzee(140, 30);
		dice[4] = new Yahtzee(185, 30);

		// Roller button
		Button rollButton = new Button("Roll the dice!");
		rollButton.setLayoutX(6);
		rollButton.setLayoutY(100);
		rollButton.setOnAction(e -> {
			if (Count <= 0) {
				System.err.println("The program only needs to work once.");
				System.exit(1);
			}
			
			Count--;
			int random;
			for (int i = 0; i < dice.length; i++) {
				if (!dice[i].getHold()) {
					random = (int) (Math.random() * 6) + 1;
					dice[i].setDot(random);
				}
			}
			if (Count == 0) {
				counter.setText(checkResult(dice));
			} else {
				counter.setText("You have " + Count + " roll(s) left.");
			}
		});

		// Concluded all parts
		for (int i = 0; i < dice.length; i++) {
			group.getChildren().add(dice[i].yahtzee);
		}
		
		group.getChildren().add(name);
		group.getChildren().add(counter);
		group.getChildren().add(rollButton);
		Scene scene = new Scene(group, 235, 130);
		primaryStage.setTitle("Yahtzee");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// Return the result of the game
	private String checkResult(Yahtzee[] dice) {
		ArrayList<Integer> die = new ArrayList<Integer>();
		for (int i = 0; i < dice.length; i++) {
			die.add(dice[i].getDot());
		}
		
		Collections.sort(die);
		//Condition
		if (die.get(0) == die.get(1) && die.get(1) == die.get(2) && die.get(2) == die.get(3)
				&& die.get(3) == die.get(4)) {
			return "Yahtzee";
		} else if ((die.get(0) == die.get(1) && die.get(1) == die.get(2) && die.get(2) == die.get(3))
				|| (die.get(1) == die.get(2) && die.get(2) == die.get(3) && die.get(3) == die.get(4))) {
			return "Four of a kind";
		} else if ((die.get(0) == die.get(1) && die.get(1) == die.get(2))
				|| (die.get(1) == die.get(2) && die.get(2) == die.get(3))
				|| (die.get(2) == die.get(3) && die.get(3) == die.get(4))) {
			return "Three of a kind";
		} else if ((die.get(0) == die.get(1) && die.get(1) == die.get(2) && die.get(3) == die.get(4))
				|| (die.get(2) == die.get(3) && die.get(4) == die.get(2) && die.get(0) == die.get(1))) {
			return "Full House";
		} else if (die.get(1) - die.get(0) == 1 && die.get(2) - die.get(1) == 1 && die.get(3) - die.get(2) == 1
				&& die.get(4) - die.get(3) == 1) {
			return "Large Straight";
		} else if ((die.get(1) - die.get(0) == 1 && die.get(2) - die.get(1) == 1 && die.get(3) - die.get(2) == 1)
				|| (die.get(2) - die.get(0) == 1 && die.get(3) - die.get(2) == 1 && die.get(4) - die.get(3) == 1)
				|| (die.get(1) - die.get(0) == 1 && die.get(3) - die.get(1) == 1 && die.get(4) - die.get(3) == 1)
				|| (die.get(1) - die.get(0) == 1 && die.get(2) - die.get(1) == 1 && die.get(4) - die.get(2) == 1)
				|| (die.get(1) - die.get(0) == 1 && die.get(2) - die.get(1) == 1 && die.get(3) - die.get(2) == 1)) {
			return "Small Straight";
		} else {
			return "Pair";
		}
	}
	}