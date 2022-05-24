public class Ship{
    private String name = "null";
    private int health = 0;
    private int ID = 0;
    private char type = '0';
    public Ship(String name, int health, int ID, char type){
        this.name = name;
        this.health = health;
        this.ID = ID;
        this.type = type;
    }
    public Ship(){

    }
    // public Ship(int i){
    //         ID = i;
    //         switch (ID){
    //             case '0':
    //                 name = "P";
    //                 length = 2;
    //                 health=length;
    //             break;
    //             case '1':
    //                 name = "S";
    //                 length = 3;
    //                 health=length;
    //             break;
    //             case '2':
    //                 name = "D";
    //                 length = 3;
    //                 health=length;
    //             break;
    //             case '3':
    //                 name = "B";
    //                 length = 4;
    //                 health=length;
    //             break;
    //             case '4':
    //                 name = "C";
    //                 length = 5;
    //                 health=length;
    //             break;
    //         }
    // }

    //Getters
    public String getShipName(Ship a){
        return a.name;
    }
    public int getShipHealth(Ship a){
        return a.health;
    }
    public int getShipID(Ship a){
        return a.ID;
    }
    public char getShipType(Ship a){
        return a.type;
    }


    //Setters:
    public void setShipHealth(Ship a, int health){
        a.health = health;
    }

    // public void printShipData(Ship[] ships, String name, int length, int health, int ID){
    //     System.out.println(Ships[i].getName);
    //     System.out.println(name);
    //     System.out.print(length);
    //     System.out.print(ID);
    //     System.out.print(health);
    //     System.out.println();
    // }
    public void printShip(Ship[] ships){
        for(int i=0; i<ships.length; i++){
            System.out.println(ships[i]);
        }
    }
}