package RichMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-18
 * Time: 下午10:08
 * To change this template use File | Settings | File Templates.
 */
public class RichGameMap {
    private List<Ground> groundList=new ArrayList<Ground>();;

    public  RichGameMap(){
        initalizeMap();
    }
    private void initalizeMap() {
        groundList.clear();

        initStartGround();
        initAreaOne();
        initHospitalGround();
        initAreaTwo();
        initToyGround();
        intiAreaThree();
        initGiftGround();
        intiAreaFour();
        initPrisonGround();
        intiAreaFive();
        initMagicGround();
        initPointsGround();
    }

    private void initStartGround() {
        groundList.add(new StartGround());

    }

    private void initAreaOne() {
        for (int i = 0; i < 13; i++) {
            groundList.add(new HouseGround(200));
        }
    }

    private void initHospitalGround() {
        groundList.add(new HospitalGround());
    }

    private void initAreaTwo() {
        for (int i = 0; i < 13; i++) {
            groundList.add(new HouseGround(200));
        }
    }

    private void initToyGround() {
        groundList.add(new ToyGround());
    }

    private void intiAreaThree() {
        for (int i = 0; i < 6; i++) {
            groundList.add(new HouseGround(500));
        }
    }

    private void initGiftGround() {
        groundList.add(new GiftGround());
    }

    private void intiAreaFour() {
        for (int i = 0; i < 13; i++) {
            groundList.add(new HouseGround(300));
        }
    }

    private void initPrisonGround() {
        groundList.add(new PrisonGround());
    }

    private void intiAreaFive() {
        for (int i = 0; i < 13; i++) {
            groundList.add(new HouseGround(300));
        }
    }

    private void initMagicGround() {
        groundList.add(new MagicGround());
    }

    private void initPointsGround() {
        int[] points={20, 80, 100, 40, 80, 60};
        for (int i = 0; i < 6; i++) {
            groundList.add(new PointsGround(points[i]));
        }
    }




    public List<Ground> getMap() {
        return this.groundList;
    }

    public Ground getGround(int groundIndex) {
        return groundList.get(groundIndex);
    }


    public Integer getTotalGroundNumber() {
        return groundList.size();
    }
}
