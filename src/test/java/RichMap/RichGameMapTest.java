package RichMap;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

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
    public void shouldGetStartGroundRight(){
        RichGameMap richGameMap=new RichGameMap();
        assertThat(richGameMap.getGround(0).getGroundType(),is(GroundType.Start));
        assertThat(richGameMap.getGround(1).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(13).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(14).getGroundType(),is(GroundType.Hospital));
        assertThat(richGameMap.getGround(15).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(27).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(28).getGroundType(),is(GroundType.Toy));
        assertThat(richGameMap.getGround(29).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(34).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(35).getGroundType(),is(GroundType.Gift));
        assertThat(richGameMap.getGround(36).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(48).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(49).getGroundType(),is(GroundType.Prison));
        assertThat(richGameMap.getGround(50).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(62).getGroundType(),is(GroundType.Clearing));
        assertThat(richGameMap.getGround(63).getGroundType(),is(GroundType.Magic));
        assertThat(richGameMap.getGround(64).getGroundType(),is(GroundType.Points));
        assertThat(richGameMap.getGround(69).getGroundType(),is(GroundType.Points));
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
