package hz222bp_assign2.Yahtzee;

import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;

/*Assignment 2; Exercise 7
* @author Hailing Zhang(hz222bp)
* @since 2018-02-10
*/
public class Yahtzee {
	public Group yahtzee;
	private int X, Y; // A Cartesian coordinate system for the overview
	public CheckBox checkBox;

	private int die = 0;// The number of dot(s) after rolling
	private boolean hold = false;
	private Rectangle nothing, Show;// the picture for showing the dices or not

	public Yahtzee(int x, int y) {
		yahtzee = new Group();
		X = x;
		Y = y;
		drawAll();
	}

	private void drawAll() {
		DiceImage();
		CheckBox();
	}

	private void DiceImage() {
		//The position of images are relative and all images are in the zip 
		if (die >= 1 && die <= 6) {
			String diceImgPath = "file:src/hz222bp_assign2/Yahtzee/d" + die + ".png";
			Image diceImg = new Image(diceImgPath);
			ImageView diceImgView = new ImageView();
			diceImgView.setImage(diceImg);
			
			diceImgView.setLayoutX(X - 11);
			diceImgView.setLayoutY(Y - 11);
			diceImgView.setScaleX(0.65);
			diceImgView.setScaleY(0.65);
			
			yahtzee.getChildren().removeAll(nothing, Show);
			yahtzee.getChildren().add(diceImgView);
		} else {
			nothing = new Rectangle(X, Y, 42, 42);
			nothing.setFill(Color.GRAY);
			nothing.setArcHeight(10);
			nothing.setArcWidth(10);
			Show = new Rectangle(X + 2, Y + 2, 38, 38);
			Show.setFill(Color.WHITE);
			Show.setArcHeight(10);
			Show.setArcWidth(10);
			yahtzee.getChildren().addAll(nothing, Show);
		}
	}

	// Check boxes for holding dices
	private void CheckBox() {
		checkBox = new CheckBox("");
		checkBox.setLayoutX(X + 12);
		checkBox.setLayoutY(Y + 45);
		checkBox.setScaleX(0.9);
		checkBox.setScaleY(0.9);
		
		checkBox.setSelected(hold);
		checkBox.setDisable(die == 0 ? true : false);
		checkBox.setOnAction(e -> {
			checkBox.setSelected(hold ? false : true);
			hold = hold ? false : true;
		});
		yahtzee.getChildren().add(checkBox);
	}

	//For checking the results
	public void setDot(int dot) {
		die = dot;
		drawAll();
	}

	public int getDot() {
		return die;
	}

	public boolean getHold() {
		return hold;
	}
}
