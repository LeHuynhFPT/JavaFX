package multipage.BaiTap.Add;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {

    public void goToList(ActionEvent actionEvent) throws Exception {
        Parent Listpage = FXMLLoader.load(getClass().getResource("../List/List.fxml"));
        Scene ListScene = new Scene(Listpage, 700, 500);
        Main.rootStage.setTitle("Back to list");
        Main.rootStage.setScene(ListScene);
    }
}
