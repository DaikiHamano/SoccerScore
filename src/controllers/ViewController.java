package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import models.Data;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private TextField arsenalScore;

    @FXML
    private TextField opponentScore;

    @FXML
    private TextField goal;

    @FXML
    private TextField pk;

    @FXML
    private TextField assist;

    @FXML
    private TextField shots;

    @FXML
    private TextField keyPasses;

    @FXML
    private TextField aerialsWon;

    @FXML
    private TextField dribbles;

    @FXML
    private TextField disp;

    @FXML
    private TextField unsTouches;

    @FXML
    private TextField totalTackles;

    @FXML
    private TextField interceptions;

    @FXML
    private TextField clearances;

    @FXML
    private TextField blockedShots;

    @FXML
    private TextField pa;

    @FXML
    private TextField crosses;

    @FXML
    private TextField accCrosses;

    @FXML
    private TextField accLb;

    @FXML
    private ToggleGroup red;

    @FXML
    private RadioButton yes;

    @FXML
    private RadioButton no;

    @FXML
    private TextField givePk;

    @FXML
    private TextField givenPk;

    @FXML
    private TextField position;

    @FXML
    private Label errorMessage;

    @FXML
    private Label score;

    @FXML
    private Label value;

    //to reset the message first
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        errorMessage.setText("");
        score.setText("");
        value.setText("");
    }

    //to check the blank and if the word is correct or not
    @FXML
    void ok(ActionEvent event) {
        //to check the blank
        if(arsenalScore.getText().isBlank()||opponentScore.getText().isBlank()||goal.getText().isBlank()||
                assist.getText().isBlank()||shots.getText().isBlank()||keyPasses.getText().isBlank()||
                aerialsWon.getText().isBlank()||dribbles.getText().isBlank()||disp.getText().isBlank()||
                unsTouches.getText().isBlank()||totalTackles.getText().isBlank()||interceptions.getText().isBlank()||
                clearances.getText().isBlank()||blockedShots.getText().isBlank()||pa.getText().isBlank()||
                crosses.getText().isBlank()||accCrosses.getText().isBlank()||accLb.getText().isBlank()||
                givePk.getText().isBlank()||givenPk.getText().isBlank()||pk.getText().isBlank()){
            errorMessage.setText("Fill in the blanks");
        //to check the position name
        }else if(position.getText().equals("FW")||position.getText().equals("AM")
                ||position.getText().equals("M")||position.getText().equals("D")){
            errorMessage.setText("");
        }else{
            errorMessage.setText("Put a proper position");
        }

        //to put the data to the object
        Data data = new Data(Integer.parseInt(arsenalScore.getText()),Integer.parseInt(opponentScore.getText()),
                Integer.parseInt(goal.getText()),Integer.parseInt(pk.getText()),Integer.parseInt(assist.getText()),
                Integer.parseInt(shots.getText()),Integer.parseInt(keyPasses.getText()),
                Integer.parseInt(aerialsWon.getText()),Integer.parseInt(dribbles.getText()),
                Integer.parseInt(disp.getText()),Integer.parseInt(unsTouches.getText()),
                Integer.parseInt(totalTackles.getText()),Integer.parseInt(interceptions.getText()),
                Integer.parseInt(clearances.getText()),Integer.parseInt(blockedShots.getText()),
                Double.parseDouble(pa.getText()),Integer.parseInt(crosses.getText()),
                Integer.parseInt(accCrosses.getText()),Integer.parseInt(accLb.getText()),
                Integer.parseInt(givenPk.getText()), Integer.parseInt(givenPk.getText()),position.getText());

        //to check the redCard
        if(no.isSelected()){
            score.setText(data.getTotalScore());
            double l = ((double)Math.round(data.getTotal() * 10))/10;
            value.setText(String.valueOf(l));
        }else{
            double redTotal = data.getTotal() - 2;
            if(redTotal >= 3){
                score.setText("S");
            }else if(redTotal >= 2){
                score.setText("A");
            }else if(redTotal >= 1){
                score.setText("B");
            }else if(redTotal >= 0){
                score.setText("C");
            }else{
                score.setText("D");
            }
            double l = ((double)Math.round(data.getTotal() * 10))/10;
            value.setText(String.valueOf(l));
        }
    }

    //for deleting
    @FXML
    void reset(ActionEvent event) {
        arsenalScore.clear();opponentScore.clear();goal.clear();pk.clear();
        assist.clear();shots.clear();keyPasses.clear();aerialsWon.clear();dribbles.clear();disp.clear();
        unsTouches.clear();totalTackles.clear();interceptions.clear();
        clearances.clear();blockedShots.clear();pa.clear();crosses.clear();
        accCrosses.clear();accLb.clear();givePk.clear();
        givenPk.clear();position.clear();
        score.setText("");
        value.setText("");
        no.setSelected(true);
        errorMessage.setText("");
    }
}