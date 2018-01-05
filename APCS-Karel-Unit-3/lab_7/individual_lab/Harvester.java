package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Harvester extends Robot
{
    int[][]field = new int[6][5];
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void harvest() {
        for (int i=0;i<6;i++) {
            
            for (int j = 0;j<5;j++) {
                move();
                if (nextToABeeper()) {
                    pickBeeper();
                    field[i][j] = 1;
                }
            }
            turnLeft();
            turnLeft();
            move();
            move();
            move();
            move();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
        }    
    }
    
    public void printField() {
       //Write instructions so that the field is printed to the console after harvesting
       // 1 means there is a beeper at that location, 0 means none is at that location.
       for (int i = 0;i<field.length;i++) {
           System.out.println("Row "+i);
           for (int j = 0;j<field[i].length;j++) {
               System.out.print(" "+field[i][j]);
            }
        }
    }
   
}

