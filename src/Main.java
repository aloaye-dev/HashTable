import java.util.Hashtable;

public class Main {
    public static void main(String []args){

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails",100);
        myHashTable.set("tile",50);
        myHashTable.set("lumber",80);
        myHashTable.set("bolts",200);
        myHashTable.set("screws",140);
//
        System.out.println(myHashTable.keys());
//        myHashTable.set("bolts",200);
//        myHashTable.set("screws",140);
//        System.out.println(myHashTable.get("lumber"));
//        System.out.println(myHashTable.get("bolts"));

  //      myHashTable.printTable();
    }
}
