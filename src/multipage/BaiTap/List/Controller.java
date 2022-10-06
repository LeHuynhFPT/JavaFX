package multipage.BaiTap.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {
    public void goToAdd(ActionEvent actionEvent) throws Exception {
        Parent Listpage = FXMLLoader.load(getClass().getResource("../Add/Add.fxml"));
        Scene ListScene = new Scene(Listpage, 700, 500);
        Main.rootStage.setTitle("Thêm mới");
        Main.rootStage.setScene(ListScene);
    }
}
