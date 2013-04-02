package Tool;

import enigma.console.Console;
import enigma.console.TextAttributes;
import enigma.core.Enigma;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-27
 * Time: 下午1:42
 * To change this template use File | Settings | File Templates.
 */
public class ColorPrint {
    private static final Console console;
    static
    {
        console = Enigma.getConsole("Rich");
    }

    public void  printColorString(String message){
        TextAttributes attributes = new TextAttributes(Color.GRAY);
        console.setTextAttributes(attributes);
        System.out.print(message);
    }
}
