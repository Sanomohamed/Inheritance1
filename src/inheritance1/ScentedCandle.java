package inheritance1;
public class ScentedCandle extends Candle{
    String scent;
    public ScentedCandle(String color, double height,String scent) {
        super(color, height);
        this.scent=scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    
    public void setHeight(double height){
        super.setHeight(height);
        this.price=3*height;
    }   
}
