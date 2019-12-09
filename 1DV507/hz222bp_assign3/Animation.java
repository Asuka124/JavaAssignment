package hz222bp_assign3;

import javafx.application.Application;
import javafx.animation.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.scene.Group;

/*Assignment 3; Exercise 9
 *Hailing Zhang(hz222bp) 
 *2018-03-01*/
public class Animation extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	private int animationCount = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group group = new Group();
		drawBg(group);

		Image cat = new Image("file:src/hz222bp_assign3/picture/cat/Run (1).png");
		ImageView kitten = new ImageView();
		kitten.setImage(cat);
		kitten.setFitWidth(100);
		kitten.setFitHeight(80);
		kitten.setLayoutX(25);
		kitten.setLayoutY(315);
		group.getChildren().add(kitten);

		Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(true);
		KeyFrame move = new KeyFrame(Duration.millis(10), e -> { // The speed
			animationCount++;
			if (animationCount < 395) {// where should the cat slip
				double pos = kitten.getLayoutX() + 1;
				kitten.setLayoutX(pos);
				int img = (int) (pos % 6);
				if (img == 0) {
					img = 6;
				}
				kitten.setImage(new Image("file:src/hz222bp_assign3/picture/cat/Run (" + img + ").png"));
			} else {
				int img = (animationCount - 330) / 10;// after slip
				if (img == 0) {
					img = 1;
				}
				if (img == 100) {
					kitten.setVisible(false);
					return;
				}
				kitten.setImage(new Image("file:src/hz222bp_assign3/picture/cat/Slide (" + img + ").png"));
			}
		});

		timeline.getKeyFrames().addAll(move);
		timeline.play();
		Scene scene = new Scene(group, 550, 465);
		primaryStage.setTitle("Running kitten LOL");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// Draw the background
	private void drawBg(Group group) {
		ImageView background = new ImageView();
		// The scene
		background.setImage(new Image("file:src/hz222bp_assign3/picture/background/bg.png"));
		background.setFitWidth(550);
		background.setFitHeight(500);
		group.getChildren().add(background);

		// The water
		int length = 6;
		Image[] Water = new Image[6];
		ImageView[] water = new ImageView[6];
		for (int i = 0; i < length; i++) {
			Water[i] = new Image("file:src/hz222bp_assign3/picture/background/17.png");
			water[i] = new ImageView();
			water[i].setImage(Water[i]);
			water[i].setFitWidth(100);
			water[i].setFitHeight(80);
			water[i].setLayoutX(100 * i);
			water[i].setLayoutY(420);
			group.getChildren().add(water[i]);
		}

		// The beginning milestone
		Image Tree = new Image("file:src/hz222bp_assign3/picture/background/Tree.png");
		ImageView tree = new ImageView();
		tree.setImage(Tree);
		tree.setFitWidth(100);
		tree.setFitHeight(136);
		tree.setLayoutX(5);
		tree.setLayoutY(255);
		group.getChildren().add(tree);

		// The first block of land
		Image West = new Image("file:src/hz222bp_assign3/picture/background/13.png");
		ImageView west = new ImageView();
		west.setImage(West);
		west.setFitWidth(150);
		west.setFitHeight(60);
		west.setLayoutY(390);
		group.getChildren().add(west);

		// The middle land
		Image mid = new Image("file:src/hz222bp_assign3/picture/background/14.png");
		ImageView middle = new ImageView();
		middle.setImage(mid);
		middle.setFitWidth(150);
		middle.setFitHeight(60);
		middle.setLayoutX(150);
		middle.setLayoutY(390);
		group.getChildren().add(middle);
		Image mid1 = new Image("file:src/hz222bp_assign3/picture/background/14.png");
		ImageView midlle = new ImageView();
		midlle.setImage(mid1);
		midlle.setFitWidth(150);
		midlle.setFitHeight(60);
		midlle.setLayoutX(300);
		midlle.setLayoutY(390);
		group.getChildren().add(midlle);

		// The last block of land
		Image East = new Image("file:src/hz222bp_assign3/picture/background/15.png");
		ImageView east = new ImageView();
		east.setImage(East);
		east.setFitWidth(100);
		east.setFitHeight(60);
		east.setLayoutX(450);
		east.setLayoutY(390);
		group.getChildren().add(east);

		// The end milestone
		Image Stone = new Image("file:src/hz222bp_assign3/picture/background/Stone.png");
		ImageView stone = new ImageView();
		stone.setImage(Stone);
		stone.setFitWidth(60);
		stone.setFitHeight(85);
		stone.setLayoutX(490);
		stone.setLayoutY(310);
		group.getChildren().add(stone);
	}
}