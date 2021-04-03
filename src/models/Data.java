package models;

public class Data {

       private int arsenalScore,opponentScore,goal,assist,shots,keyPasses,aerialsWon,dribbles,disp,
                 unsTouches,totalTackles,interceptions,clearances,blockedShots,pa,crosses,
                 accCrosses,accLb,redCard,givePk,givenPk;
       private String position;


 public Data(int arsenalScore, int opponentScore, int goal, int assist, int shots, int keyPasses,
             int aerialsWon,int dribbles, int disp, int unsTouches, int totalTackles, int interceptions,
             int clearances, int blockedShots, int pa, int crosses, int accCrosses, int accLb,
             int redCard, int givePk, int givenPk, String position) {
                    setArsenalScore(arsenalScore);
                    setOpponentScore(opponentScore);
                    setGoal(goal);
                    setAssist(assist);
                    setShots(shots);
                    setKeyPasses(keyPasses);
                    setAerialsWon(aerialsWon);
                    setDribbles(dribbles);
                    setDisp(disp);
                    setUnsTouches(unsTouches);
                    setTotalTackles(totalTackles);
                    setInterceptions(interceptions);
                    setClearances(clearances);
                    setBlockedShots(blockedShots);
                    setPa(pa);
                    setCrosses(crosses);
                    setAccCrosses(accCrosses);
                    setAccLb(accLb);
                    setRedCard(redCard);
                    setGivePk(givePk);
                    setGivenPk(givenPk);
                    setPosition(position);
 }

 public int getArsenalScore() {
  return arsenalScore;
 }

 public void setArsenalScore(int arsenalScore) {
  this.arsenalScore = arsenalScore;
 }

 public int getOpponentScore() {
  return opponentScore;
 }

 public void setOpponentScore(int opponentScore) {
  this.opponentScore = opponentScore;
 }

 public int getGoal() {
  return goal;
 }

 public void setGoal(int goal) {
  this.goal = goal;
 }

 public int getAssist() {
  return assist;
 }

 public void setAssist(int assist) {
  this.assist = assist;
 }

 public int getShots() {
  return shots;
 }

 public void setShots(int shots) {
  this.shots = shots;
 }

 public int getKeyPasses() {
  return keyPasses;
 }

 public void setKeyPasses(int keyPasses) {
  this.keyPasses = keyPasses;
 }

 public int getAerialsWon() {
  return aerialsWon;
 }

 public void setAerialsWon(int aerialsWon) {
  this.aerialsWon = aerialsWon;
 }

 public int getDribbles() {
  return dribbles;
 }

 public void setDribbles(int dribbles) {
  this.dribbles = dribbles;
 }

 public int getDisp() {
  return disp;
 }

 public void setDisp(int disp) {
  this.disp = disp;
 }

 public int getUnsTouches() {
  return unsTouches;
 }

 public void setUnsTouches(int unsTouches) {
  this.unsTouches = unsTouches;
 }

 public int getTotalTackles() {
  return totalTackles;
 }

 public void setTotalTackles(int totalTackles) {
  this.totalTackles = totalTackles;
 }

 public int getInterceptions() {
  return interceptions;
 }

 public void setInterceptions(int interceptions) {
  this.interceptions = interceptions;
 }

 public int getClearances() {
  return clearances;
 }

 public void setClearances(int clearances) {
  this.clearances = clearances;
 }

 public int getBlockedShots() {
  return blockedShots;
 }

 public void setBlockedShots(int blockedShots) {
  this.blockedShots = blockedShots;
 }

 public int getPa() {
  return pa;
 }

 public void setPa(int pa) {
  this.pa = pa;
 }

 public int getCrosses() {
  return crosses;
 }

 public void setCrosses(int crosses) {
  this.crosses = crosses;
 }

 public int getAccCrosses() {
  return accCrosses;
 }

 public void setAccCrosses(int accCrosses) {
  this.accCrosses = accCrosses;
 }

 public int getAccLb() {
  return accLb;
 }

 public void setAccLb(int accLb) {
  this.accLb = accLb;
 }

 public int getRedCard() {
  return redCard;
 }

 public void setRedCard(int redCard) {
  this.redCard = redCard;
 }

 public int getGivePk() {
  return givePk;
 }

 public void setGivePk(int givePk) {
  this.givePk = givePk;
 }

 public int getGivenPk() {
  return givenPk;
 }

 public void setGivenPk(int givenPk) {
  this.givenPk = givenPk;
 }

 public String getPosition() {
  return position;
 }

 public void setPosition(String position) {
  this.position = position;
 }
}
