package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午7:58
 * To change this template use File | Settings | File Templates.
 */
public class HouseGround extends Ground {
    private  int price;
    public HouseGround(int price) {
        this.price=price;
    }

    @Override
    public String getDisplayName() {
        return "0"; 
    }

    public int getPrice() {
        return price;
    }
}
