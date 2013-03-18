package RichMap;

import org.junit.Test;

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
        assertThat(startGround.getDisplayName(),is("S"));

    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeHospitalGround() {
        HospitalGround hospitalGround = new HospitalGround();
        assertThat(hospitalGround.getDisplayName(),is("H"));

    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeToyGround() {
        ToyGround toyGround = new ToyGround();
        assertThat(toyGround.getDisplayName(),is("T"));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeGiftGround() {
        GiftGround giftGround = new GiftGround();
        assertThat(giftGround.getDisplayName(),is("G"));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializePrisonGround() {
        PrisonGround prisonGround = new PrisonGround();
        assertThat(prisonGround.getDisplayName(),is("P"));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeMagicGround() {
        MagicGround magicGround = new MagicGround();
        assertThat(magicGround.getDisplayName(),is("M"));
    }
    @Test
    public void shouldGetCorrectInformationWhenInitializePointsGround() {
        PointsGround startGround = new PointsGround(20);
        assertThat(startGround.getDisplayName(),is("$"));
        assertThat(startGround.getPoints(),is(20));
    }

    @Test
    public void shouldGetCorrectInformationWhenInitializeHouseGround() {
        HouseGround houseGround = new HouseGround(20);
        assertThat(houseGround.getDisplayName(),is("0"));
        assertThat(houseGround.getPrice(),is(20));
    }
}
