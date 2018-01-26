package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class LogIn_GiftShopController {

    @FXML
    private AnchorPane GiftShopLogInPane;

    @FXML
    void GiftShopInterface(ActionEvent event) throws IOException {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("Gift_Shop.fxml"));
       GiftShopLogInPane.getChildren().setAll(pane);
    }

}

