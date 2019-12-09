package hz222bp_assign2;
import javafx.application.Application;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/*
 * Assignment 2; Exercise 6;
 * 
 * @author Hailing Zhang(hz222bp)
 * @since 2018-02-09
 */

public class CompoundInterest extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Title and scene
		Text text = new Text(115, 35, "Compound Interest");
		text.setFont(Font.font("SansSerif", 26));

		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setPadding(new Insets(15, 12, 30, 25));
		gp.setHgap(5.5);
		gp.setVgap(5.5);

		// the input part
		gp.add(new Label("Amount: "), 0, 9);
		final TextField am = new TextField();
		gp.add(am, 3, 9);

		gp.add(new Label("Interest: "), 0, 12);
		final TextField in = new TextField();
		gp.add(in, 3, 12);

		gp.add(new Label("Number of years: "), 0, 16);
		final TextField nu = new TextField();
		gp.add(nu, 3, 16);

		// the calculate button
		Label result = new Label();
		gp.add(result, 0, 24);
		Button cac = new Button();
		cac.setText("Caculate");
		gp.add(cac, 0, 22);
		cac.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Double rate = Double.parseDouble(in.getText()) / 100;
				int money = (int) Math.round(
						Double.parseDouble(am.getText()) * Math.pow((1 + rate), Double.parseDouble(nu.getText())));
				result.setText("In total that will be " + money);
			}
		});

		// Display
		Group root = new Group(text, gp);
		Scene scene = new Scene(root, 445, 275);

		primaryStage.setTitle("Compound Interest");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}