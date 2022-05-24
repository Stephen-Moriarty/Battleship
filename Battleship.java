import java.util.InputMismatchException;
import java.util.Scanner;
public class Battleship {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        String[][] ocean = getMatrix();
        printMatrix(ocean);
        Ship ship = new Ship();
        Ship[] myShips = new Ship[6];
        myShips[0] = new Ship("Carrier", 5, 0, 'C');
        myShips[1] = new Ship("Battleship", 4, 1, 'B');
        myShips[2] = new Ship("Destroyer", 3, 2, 'D');
        myShips[3] = new Ship("Submarine", 3, 3, 'S');
        myShips[4] = new Ship("Patrol Boat", 2, 4, 'P');
        myShips[5] = new Ship("Patrol Boat", 2, 4, 'P');
        // for(int i=0; i<myShips.length; i++){
        //     println(ship.getShipName(myShips[i]));
        //     println(ship.getShipHealth(myShips[i]));
        //     println(ship.getShipID(myShips[i]));
        //     println(ship.getShipType(myShips[i]));
        // }
        // placeShip(ship.getShipHealth(myShips[0]), ship.getShipType(myShips[0]), ocean);
        // placeShip(ship.getShipHealth(myShips[0]), ship.getShipType(myShips[0]), ocean, 's');
        // placeShip(ship.getShipHealth(myShips[0]), ship.getShipType(myShips[0]), ocean, 'n');
        String str = "";
        int in = 0;
        char x;
        for(int i=0; i<myShips.length; i++){
            System.out.println(ship.getShipName(myShips[i]));
        do{
            System.out.println("Type in its home coordinate with a space between the letter and number.");
            str=k.next();
            x = str.toUpperCase().charAt(0);
            try{
                in=k.nextInt();
            }catch(InputMismatchException e){
                k.nextLine();
            }
        }while(in <= 0 || in >= 11 || x < 'A' || x > 'J');
        in = subtractOne(in);
        int finalChoice = getCharNum(x);
        System.out.println(finalChoice);
        finalChoice = numToValidPos(finalChoice);
        System.out.println(finalChoice);
        System.out.println("What direction do you want?:");
        String idk = "0";
        char direction;
        do{
            idk = k.next();
            direction = idk.toLowerCase().charAt(0);
        }while(direction!='n'&&direction!='s'&&direction!='e'&&direction!='w');
        placeShip(ship.getShipHealth(myShips[i]), ship.getShipType(myShips[i]), ocean, direction, in);
        printMatrix(ocean);
    }
        //printShipData(myShips); //for debugging
    }
    public static void placeShip(int h, char t, String[][] ocean, char direction, int x){
        String temp;
        temp=t+"";
        switch(direction){
            case('n'):
            for(int i=h; i>0; i--){// should go from bottom to top
                ocean[i][x] = temp;
            }
            break;
            case('s'):
            for(int i=0; i<h; i++){// top to bottom
                ocean[i][x] = temp;
            }
            break;
            case('e'):
            for(int i=h; i>0; i--){// left to right
                ocean[x][i] = temp;
            }
            break;
            case('w'):
            for(int i=0; i<h; i++){// right to left
                ocean[x][i] = temp;
            }
            break;
            default:
            System.out.println("UH OH!");
        }
    }
    public static String getUserChoice(){
        Scanner k = new Scanner(System.in);
        System.out.println("Type in its home coordinate with a space between the letter and number.");
        String input = k.next();
        k.close();
        return input;
    }
    public static void printShipData(Ship[] myShips){
        Ship ship = new Ship();
        for(int i=0; i<myShips.length; i++){
            println(ship.getShipName(myShips[i]));
            println(ship.getShipHealth(myShips[i]));
            println(ship.getShipID(myShips[i]));
            println(ship.getShipType(myShips[i]));
        }
    }
    public static boolean checkChar(char a){
        if(a>='A'&&a<='J'){
            return false;
        }else{
            return true;
        }
    }
    public static int getCharNum(char a){
        int temp = (int) a;
        return temp;
    }
    public static int subtractOne(int v){
        return --v;
    }
    public static int numToValidPos(int a){
        a=a-65;
        return a;
    }
    public static void println(Object myObj){
        System.out.println(myObj);
    }
    public static void printLabels(){
        System.out.print("   ");
        for(int i=65; i<75; i++){
            System.out.print((char) i);
        }
        System.out.println();
    }
    public static String[][] getMatrix(){
        String[][] temp = new String[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                temp[i][j] = ".";
            }
        }
        return temp;
    }
    public static void printMatrix(String[][] any){
        printLabels();
        for(int i=0; i<10; i++){
            int temp = i+1;
            if(temp==10){
                System.out.print(temp + " ");
            }else{
                System.out.print(temp + "  ");
            }
            for(int j=0; j<10; j++){
                System.out.print(any[i][j]);
            }
            System.out.println();
        }
    }

}

