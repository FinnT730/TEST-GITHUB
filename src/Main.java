import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) 
    {
        Main.launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle( "Canvas Example" );
        
	    Group root = new Group();
	    Scene theScene = new Scene( root );
	    
	    
	    Image img = new Image("https://pbs.twimg.com/tweet_video/Ce0lJYdXEAAYzct.mp4");
	    
	    GridPane pane = new GridPane();
	    
	    ProgressBar ps = new ProgressBar(100);
	    
	    if(ps.getProgress() != 1000) {
	    	ps.setProgress(ps.getProgress() + 1);
	    }
	    	    
	    pane.getChildren().add(ps);
	    
	    stage.setScene(new Scene(pane));
	         
	    stage.show();
	}


}
