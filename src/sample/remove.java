package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class remove  {


    Stage currentStage;


    @FXML
    public TextField number;

    int Number;
    

  private ActionEvent actionEvent;
  public void removed(MouseEvent mouseEvent) throws Exception {
        Number = Integer.parseInt(number.getText());
        System.out.println(Number);
        Controller cr = new Controller();
        cr.listView.getItems().remove((Number));
      currentStage.close();
    }
}
