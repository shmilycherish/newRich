package RichMap;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午8:32
 * To change this template use File | Settings | File Templates.
 */
public class RichGameMapTest {
    @Test
    public void shouldGetCorrectInformationWhenInitializeRichMap() {
        RichGameMap richMap=new RichGameMap() ;
        List<Ground> grounds = richMap.getMap();

        assertThat(grounds.size(), is(70));
        assertThat(grounds.get(0).getDisplayName(),is("S"));
        assertThat(grounds.get(1),isHouseGroundAs("0", 200));
        assertThat(grounds.get(13),isHouseGroundAs("0",200));
        assertThat(grounds.get(14).getDisplayName(),is("H"));
        assertThat(grounds.get(15),isHouseGroundAs("0",200));
        assertThat(grounds.get(27),isHouseGroundAs("0",200));
        assertThat(grounds.get(28).getDisplayName(),is("T"));
        assertThat(grounds.get(29),isHouseGroundAs("0",500));
        assertThat(grounds.get(34),isHouseGroundAs("0",500));
        assertThat(grounds.get(35).getDisplayName(),is("G"));
        assertThat(grounds.get(36),isHouseGroundAs("0",300));
        assertThat(grounds.get(48),isHouseGroundAs("0",300));
        assertThat(grounds.get(49).getDisplayName(),is("P"));
        assertThat(grounds.get(50),isHouseGroundAs("0",300));
        assertThat(grounds.get(62),isHouseGroundAs("0",300));
        assertThat(grounds.get(63).getDisplayName(),is("M"));
        assertThat(grounds.get(64),isPointsGroundAs("$", 20));
        assertThat(grounds.get(69),isPointsGroundAs("$",60));
    }

    @Test
    public void shouldGetStartGroundRight(){
        RichGameMap richGameMap=new RichGameMap();
        assertThat(richGameMap.getGround(0).getDisplayName(),is("S"));
    }

    private Matcher<? super Ground> isHouseGroundAs(final String displayName, final int price) {
        return new TypeSafeMatcher<Ground>() {
            @Override
            protected boolean matchesSafely(Ground ground) {
                HouseGround houseGround=(HouseGround)ground;
                return houseGround.getDisplayName().equals(displayName) && (houseGround.getPrice() == price);
            }

            @Override
            public void describeTo(Description description) {
            }

            @Override
            protected void describeMismatchSafely(Ground ground, Description mismatchDescription) {
                HouseGround houseGround=(HouseGround)ground;
                String errorMessage = "The ground shouldGetInitStatus be with displayName: " + displayName + ", price: " ;
                errorMessage += "but in fact is (" + houseGround.getDisplayName() + " " +houseGround.getPrice() +" )";
                mismatchDescription.appendText(errorMessage);
            }
        };
    }

    private Matcher<? super Ground> isPointsGroundAs(final String displayName, final int points) {
        return new TypeSafeMatcher<Ground>() {
            @Override
            protected boolean matchesSafely(Ground ground) {
               PointsGround pointsGround=(PointsGround)ground;
                return pointsGround.getDisplayName().equals(displayName) && (pointsGround.getPoints() == points);
            }

            @Override
            public void describeTo(Description description) {
            }

            @Override
            protected void describeMismatchSafely(Ground ground, Description mismatchDescription) {
                PointsGround pointsGround=(PointsGround)ground;
                String errorMessage = "The ground shouldGetInitStatus be with displayName: " + displayName + ", price: " ;
                errorMessage += "but in fact is (" +pointsGround.getDisplayName() + " " +pointsGround.getPoints() +" )";
                mismatchDescription.appendText(errorMessage);
            }
        };
    }

}
