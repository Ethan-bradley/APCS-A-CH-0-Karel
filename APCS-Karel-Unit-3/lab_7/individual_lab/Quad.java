package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Quad extends Robot
{
    //This array should track 
    int[][]columns = new int[4][5];
    public Quad(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixQuad() {
        turnLeft();
        for (int i=0;i<4;i++) {
        for (int j = 0;j<4;j++) {
                
                if (!nextToABeeper()) {
                    putBeeper();
                    columns[i][j] = 1;
                }
                move();
            }
            if (!nextToABeeper()) {
                    putBeeper();
                    columns[i][4] = 1;
                }
            turnRight();
            move(4);
            turnRight();
            move(4);
            turn180();
        }
    }
    private void turnRight() {
        turnLeft();
            turnLeft();
            turnLeft();
    }
    private void turn180() {
        turnLeft();
            turnLeft();
    }
    private void move(int amount) {
        for (int i =0;i<amount;i++)
            move();
    }
    public void printFixes() {
        //This method should print the beepers placed in each column of the quad
        //If a beeper was already present, then the entry should be zero
        //If a beeper was placed, the entry should be 1
        //The first column should be {1, 1, 1, 0, 0}
        
       for (int i = 0;i<columns.length;i++) {
           System.out.println("Column "+i);
           System.out.println("");
           for (int j = 0;j<columns[i].length;j++) {
               
               System.out.print(" "+columns[i][j]);
            
               
        }
        System.out.println("");
    }
    }
   
}

