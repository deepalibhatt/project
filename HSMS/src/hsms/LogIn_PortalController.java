package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class LogIn_PortalController {

    @FXML
    private AnchorPane AdminlogInPane;

    @FXML
    void AdminLogIn(ActionEvent event)throws IOException {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
       AdminlogInPane.getChildren().setAll(pane);
    }

}
