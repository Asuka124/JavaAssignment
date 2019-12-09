package hz222bp_assign2;

/*Assignment 2; Exercise 5
* @author Hailing Zhang(hz222bp)
* @since 2018-02-06
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Snowman extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Snowman");
		// background
		Circle sun = new Circle(520, 70, 45);
		sun.setFill(Color.YELLOW);

		Rectangle ground = new Rectangle(0, 360, 600, 97);
		ground.setFill(Color.WHITE);

		// Snowman
		// Head of snowman
		Circle head = new Circle(125, 115, 30);
		head.setFill(Color.WHITE);

		Circle rightEye = new Circle(140, 105, 5);
		Circle leftEye = new Circle(110, 105, 5);

		Line mouth = new Line(110, 120, 140, 120);

		Rectangle main = new Rectangle(103, 25, 50, 60);
		main.setFill(Color.BLACK);
		Rectangle brim = new Rectangle(85, 85, 80, 6);
		brim.setFill(Color.RED);
		Group hat = new Group(main, brim);
		hat.setTranslateX(10);
		hat.setRotate(15);

		// Body of snowman
		Circle body = new Circle(125, 180, 40);
		body.setFill(Color.WHITE);

		Circle Button1 = new Circle(125, 155, 5);
		Button1.setFill(Color.BLACK);
		Circle Button2 = new Circle(125, 175, 5);
		Button2.setFill(Color.BLACK);
		Circle Button3 = new Circle(125, 195, 5);
		Button3.setFill(Color.BLACK);

		Line rightArm = new Line(165, 170, 200, 130);
		rightArm.setStrokeWidth(4);
		Line leftArm = new Line(85, 165, 45, 110);
		leftArm.setStrokeWidth(4);

		Circle foot = new Circle(125, 260, 60);
		foot.setFill(Color.WHITE);

		// conclusion and display
		Group snowman = new Group(foot, body, head, leftEye, rightEye, mouth, Button1, Button2, Button3, leftArm,
				rightArm, hat);
		snowman.setTranslateX(170);
		snowman.setTranslateY(50);

		Group sky = new Group(ground, sun, snowman);
		Scene back = new Scene(sky, 595, 445, Color.rgb(0, 191, 255));

		primaryStage.setScene(back);
		primaryStage.show();
	}
}