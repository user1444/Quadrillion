package Scenes;

import DataModels.Achievement;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import sample.Glob;

public class AchivementsScene extends QuadScene {
	
	public Achievement[] achievements;

    public AchivementsScene(Achievement[] achievements) {
        super(new Pane(), Glob.windowWidth(), Glob.windowHeight());
        VBox mainLayout = new VBox();
        setRoot(mainLayout);
        this.achievements = achievements;
    }
}
