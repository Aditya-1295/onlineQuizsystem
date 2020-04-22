package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class dialogcontroller implements Initializable{


    Question q;
    @FXML
    public TextField editQuestion;
    @FXML
    public TextField editopt1;
    @FXML
    public TextField editopt2;
    @FXML
    public TextField editopt3;
    @FXML
    public TextField editopt4;

    Stage currentStage;



    public void processResult(MouseEvent mouseEvent){

        String question = editQuestion.getText().trim();
        String opt1 =editopt1.getText();
        String opt2 = editopt2.getText();
        String opt3 = editopt3.getText();
        String opt4 = editopt4.getText();
        q = new Question(1,question,opt1,opt2,opt3,opt4);
        currentStage.close();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(()->{
            q.display();

        });

    }
}
