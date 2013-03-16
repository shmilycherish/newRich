package Player;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-16
 * Time: 下午8:45
 * To change this template use File | Settings | File Templates.
 */
public class PlayerTest {

    @Test
    public void shouldGetCorrectInformationWhenIniQianfuren()
    {
        Player player = new QianFuRenPlayer(10000);

        assertThat(player.getFunds(), is(10000));
        assertThat(player.getCharacterName(), is("钱夫人"));
        assertThat(player.getDisplayName(), is("Q"));
    }

    @Test
    public void shouldGetCorrectInformationWhenIniATuBo()
    {
        Player player = new ATuBoPlayer(10000);

        assertThat(player.getFunds(), is(10000));
        assertThat(player.getCharacterName(), is("阿土伯"));
        assertThat(player.getDisplayName(), is("A"));
    }

    @Test
    public void shouldGetCorrectInformationWhenIniSunMeiMei()
    {
        Player player = new SunMeiMeiPlayer(10000);

        assertThat(player.getFunds(), is(10000));
        assertThat(player.getCharacterName(), is("孙美美"));
        assertThat(player.getDisplayName(), is("S"));
    }

    @Test
    public void shouldGetCorrectInformationWhenIniJinBaoBei()
    {
        Player player = new JinBaoBeiPlayer(10000);

        assertThat(player.getFunds(), is(10000));
        assertThat(player.getCharacterName(), is("金宝贝"));
        assertThat(player.getDisplayName(), is("J"));
    }
}
