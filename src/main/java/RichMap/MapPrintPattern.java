package RichMap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cherish
 * Date: 13-3-23
 * Time: 下午8:22
 * To change this template use File | Settings | File Templates.
 */
public class MapPrintPattern {

    List<Ground>  groundMap=  new ArrayList<Ground>() ;
    private final int LENGTH=30;
    private final int WIDTH=8;
    private final int TOTAL=LENGTH*WIDTH;
    private List<Integer>  relationshipForGroundIndexAndMarchForwardGround=new ArrayList<Integer>() ;


    public MapPrintPattern(){
        initializeRelationship();
    }

    private void  initializeRelationship() {
        initializeFirstLineOfRelationshipInTheMap();
        initializeLastRowOfRelationshipInTheMap();
        initializeLastLineOfRelationshipInTheMap();
        initializeFirstRowOfRelationshipInTheMap();
    }



    private void initializeFirstLineOfRelationshipInTheMap() {
        for(int index=0;index<LENGTH-1;index++){
            relationshipForGroundIndexAndMarchForwardGround.add(index);
        }
    }

    private void initializeLastRowOfRelationshipInTheMap() {
        int mapIndex=LENGTH-2;
        for(int index=0;index<WIDTH-2;index++){
            mapIndex=getIndexInTheRowButNextLine(mapIndex);
            relationshipForGroundIndexAndMarchForwardGround.add(mapIndex);
        }
    }

    private void initializeLastLineOfRelationshipInTheMap() {
        for(int index=TOTAL-2;index>=TOTAL-LENGTH;index--){
            relationshipForGroundIndexAndMarchForwardGround.add(index);
        }
    }

    private void initializeFirstRowOfRelationshipInTheMap() {
        int mapIndex=TOTAL-LENGTH;
        for(int index=0;index<WIDTH-2;index++){
            mapIndex=getIndexInTheRowButPrecedingLine(mapIndex);
            relationshipForGroundIndexAndMarchForwardGround.add(mapIndex);
        }
    }

    private  int getIndexInTheRowButNextLine(int mapIndex){
       return mapIndex+LENGTH ;
    }

    private  int getIndexInTheRowButPrecedingLine(int mapIndex){
        return mapIndex-LENGTH ;
    }


    public List<Ground> generateMapPrintPattern(List<Ground> groundList) {
        prepareEmptyGroundForMap();
        prepareTurnGroundForMap();
        prepareMarchForwardGroundForMap(groundList);
        return groundMap;
    }

    private void prepareEmptyGroundForMap() {
        for(int count=0;count<TOTAL;count++) {
            groundMap.add(GroundFactory.newEmptyGround());
        }
    }

    private void prepareTurnGroundForMap() {
        int turnIndex=LENGTH-1;
        for(int count=0;count<WIDTH;count++) {
            groundMap.set(turnIndex, GroundFactory.newTurnGround());
            turnIndex=getIndexInTheRowButNextLine(turnIndex);
        }
    }

    private void prepareMarchForwardGroundForMap(List<Ground> groundList) {
        for(int count=0;count<groundList.size();count++) {
            groundMap.set(relationshipForGroundIndexAndMarchForwardGround.get(count),groundList.get(count));
        }
    }

    public int getTotal() {
        return TOTAL;
    }
}
