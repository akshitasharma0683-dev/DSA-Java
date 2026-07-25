public class  Domenstration{

    int age;
    String name;
    static int population;

    Domenstration(int age,String name){
        this.age=age;
        this.name=name;
        population++;
    } 

    public static void main(String args[]){
        Domenstration obj1= new Domenstration(101, "radhe");
        Domenstration obj2= new Domenstration(102,"krishna" );
        Domenstration obj3= new Domenstration(103, "ram");

        System.out.println("Population is: "+population);
    }
}