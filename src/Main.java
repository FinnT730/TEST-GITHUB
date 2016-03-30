import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) 
    {
        Main.launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		stage.show();		
		stage.setTitle("Editor");
		
		Image image = new Image("test.png");
		
		GridPane gp = new GridPane();
		
		Group root = new Group();
		
		
		
		
		Scene s = new Scene(root);
		
		
		
		
		stage.setScene(s);
		
		// stage.setResizable(true);
	}


}
