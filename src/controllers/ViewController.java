package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.Data;

public class ViewController {

    @FXML
    private TextField arsenalScore;

    @FXML
    private TextField opponentScore;

    @FXML
    private TextField goal;

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
    private TextField redCard;

    @FXML
    private TextField givePk;

    @FXML
    private TextField givenPk;

    @FXML
    private TextField position;

    @FXML
    void ok(ActionEvent event) {
        Data data = new Data(Integer.parseInt(arsenalScore.getText()),Integer.parseInt(opponentScore.getText()),
                Integer.parseInt(goal.getText()),Integer.parseInt(assist.getText()),
                Integer.parseInt(shots.getText()),Integer.parseInt(keyPasses.getText()),
                Integer.parseInt(aerialsWon.getText()),Integer.parseInt(dribbles.getText()),
                Integer.parseInt(disp.getText()),Integer.parseInt(unsTouches.getText()),
                Integer.parseInt(totalTackles.getText()),Integer.parseInt(interceptions.getText()),
                Integer.parseInt(clearances.getText()),Integer.parseInt(blockedShots.getText()),
                Integer.parseInt(pa.getText()),Integer.parseInt(crosses.getText()),
                Integer.parseInt(accCrosses.getText()),Integer.parseInt(accLb.getText()),
                Integer.parseInt(redCard.getText()),Integer.parseInt(givenPk.getText()),
                Integer.parseInt(givenPk.getText()),arsenalScore.getText());
    }

    @FXML
    void reset(ActionEvent event) {
        arsenalScore.clear();opponentScore.clear();goal.clear();
        assist.clear();shots.clear();keyPasses.clear();aerialsWon.clear();dribbles.clear();disp.clear();
        unsTouches.clear();totalTackles.clear();interceptions.clear();
        clearances.clear();blockedShots.clear();pa.clear();crosses.clear();
        accCrosses.clear();accLb.clear();redCard.clear();givePk.clear();
        givenPk.clear();position.clear();
    }

}