package hz222bp_assign3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.control.ColorPicker;

/*Assignment 3; Exercise 9
 *Hailing Zhang(hz222bp) 
 *2018-02-29*/
public class TinyPainter extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	private Group painter = new Group();// For holding all components(board and menu)

	private Rectangle board = new Rectangle(0, 40, 1000, 760);// The draw-board

	private ComboBox<String> shape = new ComboBox<>();
	private String itemShape;

	private ComboBox<String> size = new ComboBox<>();
	private int itemSize;

	private ColorPicker color = new ColorPicker();
	private Color itemColor;

	private double startX = 0;// set the position by clicking the mouse
	private double startY = 0;
	private double endX = 0;
	private double endY = 0;

	public void start(Stage primaryStage) {
		shape.getItems().addAll("Line", "Dot","Rectangle", "Circle");
		shape.setLayoutX(5);
		shape.setLayoutY(10);
		
		//get 6 different size between 0 to 40
        for(int i = 1; i <= 40 ; i+=10) {
        	size.getItems().addAll("" + i);
        }
		
		size.setLayoutX(120);
		size.setLayoutY(10);

		color.setLayoutX(195);
		color.setLayoutY(10);

		board.setFill(Color.rgb(255, 255, 255));

		//Get mouse action
		board.setOnMousePressed(e -> {
			if (shape.getValue() == null || size.getValue() == null || color.getValue() == null)
				return;
			startX = e.getX();
			startY = e.getY();
		});
		board.setOnMouseReleased(e -> {
			if (startX == 0 && startY == 0 && endX == 0 && endY == 0)
				return;
			endX = e.getX();
			endY = e.getY();
			Draw();
		});
		
		painter.getChildren().addAll(shape, size, color,board);
		Scene scene = new Scene(painter, 800, 600);
		primaryStage.setTitle("Tiny Painter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void Draw() { //Draw the item after getting all choices
		itemShape = shape.getValue();
		itemColor = color.getValue();
		itemSize = Integer.valueOf(size.getValue());
		switch (itemShape) {
		case "Line":
			DrawLine();
			break;
		case "Dot":
			DrawDot();
			break;
		case "Rectangle":
			DrawRectangle();
			break;
		case "Circle":
			DrawCircle();
			break;
		}
	}

	private void DrawLine() {
		Line line = new Line(startX, startY, endX, endY);
		line.setStrokeWidth(itemSize);
		line.setStroke(itemColor);
		painter.getChildren().add(line);
	}

	private void DrawDot() {
		Rectangle rt = new Rectangle(startX, startY, itemSize, itemSize);
		rt.setFill(itemColor);
		painter.getChildren().add(rt);
	}

	//
	private void DrawRectangle() {//the mouse can be released at four different directions
		double width = 0, height = 0, x = 0, y = 0;
		if (endX >= startX && endY >= startY) {
			width = endX - startX;
			height = endY - startY;
			x = startX;
			y = startY;
		} else if (endX >= startX && endY <= startY) {
			width = endX - startX;
			height = startY - endY;
			x = startX;
			y = endY;
		} else if (endX <= startX && endY >= startY) {
			width = startX - endX;
			height = endY - startY;
			x = endX;
			y = startY;
		} else if (endX <= startX && endY <= startY) {
			width = startX - endX;
			height = startY - endY;
			x = endX;
			y = endY;
		}
		Rectangle rt = new Rectangle(x, y, width, height);
		rt.setStrokeWidth(itemSize);
		rt.setFill(itemColor);
		painter.getChildren().add(rt);
	}

	private void DrawCircle() {
		Circle c = new Circle(startX, startY, itemSize);
		c.setFill(itemColor);
		painter.getChildren().add(c);
	}
}
