package RichMap;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-19
 * Time: 下午9:04
 * To change this template use File | Settings | File Templates.
 */
public enum GroundType {
    Start("S"), Hospital("H"), Toy("T"), Gift("G"), Prison("P"),
    Magic("M"), Points("$"), Clearing("0"),Bothy("1"), ForeignStyleHouse("2"),
    Skyscraper("3"), Empty(" "), Turn("\n");

    private String displayName;

    GroundType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
           return displayName;
    }
}
