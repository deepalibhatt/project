package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ReceptionController {

    @FXML
    private AnchorPane receptionPane;

    @FXML
    private Button Room_Management;

    @FXML
    private Button Guest_Management;

    @FXML
    private Button Availability;

    @FXML
    private Button Main_Menu;
    
    @FXML
    private Button Logout_Reception;


    @FXML
    private Button RoomBooking(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("RoomBooking.fxml"));
        receptionPane.getChildren().setAll(pane);
        return null;
    }
}


