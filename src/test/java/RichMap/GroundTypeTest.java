package RichMap;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-20
 * Time: 下午5:55
 * To change this template use File | Settings | File Templates.
 */
public class GroundTypeTest {
    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsStartGround (){
         assertThat(GroundType.Start.getDisplayName(),is("S"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsHospitalGround (){
        assertThat(GroundType.Hospital.getDisplayName(),is("H"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsToyGround (){
        assertThat(GroundType.Toy.getDisplayName(),is("T"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsGiftGround (){
        assertThat(GroundType.Gift.getDisplayName(),is("G"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsPrisonGround (){
        assertThat(GroundType.Prison.getDisplayName(),is("P"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsMagicGround (){
        assertThat(GroundType.Magic.getDisplayName(),is("M"));
    }


    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsPointsGround(){
        assertThat(GroundType.Points.getDisplayName(),is("$"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsHouseGroundWithNoHouse (){
        assertThat(GroundType.Clearing.getDisplayName(),is("0"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsHouseGroundWithBothy (){
        assertThat(GroundType.Bothy.getDisplayName(),is("1"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsHouseGroundWithForeignStyleHouse (){
        assertThat(GroundType.ForeignStyleHouse.getDisplayName(),is("2"));
    }

    @Test
    public void ShouldGetRightDisplayNameWhenGroundIsHouseGroundWithSkyscraper(){
        assertThat(GroundType.Skyscraper.getDisplayName(),is("3"));
    }
}
