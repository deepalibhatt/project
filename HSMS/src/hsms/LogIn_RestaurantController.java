package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class LogIn_RestaurantController {

    @FXML
    private AnchorPane RestaurantLogInPane;

    @FXML
    void RestaurantInterface(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("Restaurant.fxml"));
       RestaurantLogInPane.getChildren().setAll(pane);
    }

}
