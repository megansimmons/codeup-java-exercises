package minis;

public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    private void eat(){
        System.out.println("Nom nom nom!");
    }



    public int getCostInCents(){
        return this.costInCents;
    }

    public void setCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }


    public boolean getWouldRecommend(){
        return this.wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

  /*  public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(){

        }

    }*/


}
