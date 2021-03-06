package RichMap;

import Tool.ColorPrint;
import org.junit.Test;
import org.mockito.Mockito;

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
        assertThat(richGameMap.getTotalGroundNumber(),is(70));
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

    @Test
      public void  shouldPrintMapWhenPrintMapOnConsole(){
        ColorPrint colorPrint= Mockito.mock(ColorPrint.class);
        RichGameMap richGameMap=new RichGameMap();
        richGameMap.printMap(colorPrint);
        Mockito.verify(colorPrint, Mockito.times(240)).printColorString(Mockito.anyString());
        Mockito.verify(colorPrint, Mockito.times(1)).printColorString("S");
        Mockito.verify(colorPrint, Mockito.times(1)).printColorString("H");
        Mockito.verify(colorPrint, Mockito.times(1)).printColorString("T");
        Mockito.verify(colorPrint, Mockito.times(1)).printColorString("G");
        Mockito.verify(colorPrint, Mockito.times(1)).printColorString("P");
        Mockito.verify(colorPrint, Mockito.times(1)).printColorString("M");
        Mockito.verify(colorPrint, Mockito.times(6)).printColorString("$");
        Mockito.verify(colorPrint, Mockito.times(58)).printColorString("0");
        Mockito.verify(colorPrint, Mockito.times(8)).printColorString("\n");
        Mockito.verify(colorPrint, Mockito.times(162)).printColorString(" ");

    }



}
