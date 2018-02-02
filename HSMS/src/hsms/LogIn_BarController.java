package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class LogIn_BarController {

    @FXML
    private AnchorPane BarLogInPane;

    @FXML
    private Button LogIn;

    @FXML
    void BarInterface(ActionEvent event) throws IOException {
     AnchorPane pane = FXMLLoader.load(getClass().getResource("Bar.fxml"));
        BarLogInPane.getChildren().setAll(pane);
    }

}


    