package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class LogIn_ReportsController {

    @FXML
    private AnchorPane ManagerLogInPane;

    @FXML
    void AdminLogIn(ActionEvent event) {

    }

    @FXML
    void ReportsLogin(ActionEvent event) throws IOException {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("Reports.fxml"));
       ManagerLogInPane.getChildren().setAll(pane);

    }

}
