package models;


public class Data {

       private int arsenalScore,opponentScore,goal,pk,assist,shots,keyPasses,aerialsWon,dribbles,disp,
                 unsTouches,totalTackles,interceptions,clearances,blockedShots,crosses,
                 accCrosses,accLb,givePk,givenPk;
       private double pa;
       private String position;
       //to evaluate the score
       private double total;

       public Data(int arsenalScore, int opponentScore, int goal, int pk,int assist, int shots, int keyPasses,
                   int aerialsWon, int dribbles, int disp, int unsTouches, int totalTackles, int interceptions,
                   int clearances, int blockedShots, double pa, int crosses, int accCrosses, int accLb,
                   int givePk, int givenPk, String position) {
                          setArsenalScore(arsenalScore);
                          setOpponentScore(opponentScore);
                          setGoal(goal);
                          setPk(pk);
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

       public int getPk() {
            return pk;
       }

       public void setPk(int pk) {
            this.pk = pk;
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

       public double getPa() {
          return pa;
       }

       public void setPa(double pa) {
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

       public double getTotal() {
          return total;
       }

       //this is a method to calculate the total
       public void calculate(){
           total = total + goal + pk * 0.5 + assist * 0.5 + keyPasses * 0.25
                         + aerialsWon * 0.1 + dribbles * 0.1 + clearances * 0.1
                         + accLb * 0.1 + givePk * -1 + givenPk + crosses * 0.05
                         + accCrosses * 0.15;

          if(position.equals("FW")||position.equals("AM")){
             if(arsenalScore == 0){
                 total = total - 0.5;
             }else{
                 total = total + arsenalScore * 0.1;
             }
          }else{
             if(opponentScore == 0){
                 total = total + 1;
             }else{
                 total = total - opponentScore * 0.1;
             }
          }

          if(shots == 0){
             if(position.equals("FW")){
                 total = total - 1;
             }
          }else{
             total = total + shots * 0.1;
          }

          if(position.equals("D")){
              total = total + disp * -0.2 + unsTouches * -0.2;
          }else{
              total = total + disp * -0.1 + unsTouches * -0.1;
          }

          if(position.equals("FW")){
              total = total + totalTackles * 0.25 + interceptions * 0.25 + blockedShots * 0.3;
          }else{
              total = total + totalTackles * 0.15 + interceptions * 0.15 + blockedShots * 0.2;
          }

          if(pa >= 90){
              total = total + 0.1;
          }
          if(pa <= 70){
              total = total - 0.1;
          }
       }

       //the method that returns the total after the check the total
       public String getTotalScore(){
           calculate();

           if(total >= 3){
               return "S";
           }else if(total >= 2){
               return "A";
           }else if(total >= 1){
               return "B";
           }else if(total >= 0){
               return "C";
           }else{
               return "D";
           }
       }
}
