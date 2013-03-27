package RichMap;

import org.junit.Test;

import static RichMap.GroundType.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-15
 * Time: 下午8:35
 * To change this template use File | Settings | File Templates.
 */
public class GroundTest {

    @Test
      public void shouldGetCorrectInformationWhenInitializeStartGround() {
        StartGround startGround = new StartGround();
        assertThat(startGround.getGroundType(), is(Start));

    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeHospitalGround() {
        HospitalGround hospitalGround = new HospitalGround();
        assertThat(hospitalGround.getGroundType(),is(Hospital));

    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeToyGround() {
        ToyGround toyGround = new ToyGround();
        assertThat(toyGround.getGroundType(),is(Toy));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeGiftGround() {
        GiftGround giftGround = new GiftGround();
        assertThat(giftGround.getGroundType(),is(Gift));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializePrisonGround() {
        PrisonGround prisonGround = new PrisonGround();
        assertThat(prisonGround.getGroundType(),is(Prison));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeMagicGround() {
        MagicGround magicGround = new MagicGround();
        assertThat(magicGround.getGroundType(),is(Magic));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializePointsGround() {
        PointsGround startGround = new PointsGround();
        assertThat(startGround.getGroundType(),is(Points));
    }


    @Test
    public void shouldGetCorrectInformationWhenInitializeHouseGround() {
        HouseGround houseGround = new HouseGround();
        assertThat(houseGround.getGroundType(),is(Clearing));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeEmptyGround() {
        EmptyGround emptyGround = new EmptyGround();
        assertThat(emptyGround.getGroundType(),is(Empty));
    }
    @Test
    public void shouldGetCorrectInformationWhenInitializeTurnGround() {
        TurnGround turnGround = new TurnGround();
        assertThat(turnGround.getGroundType(),is(Turn));
    }
}
