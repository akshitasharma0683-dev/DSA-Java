
 class Constuctor {
    
    int age;
    int contactNO;
    String name;
    String address;

    //default constructor
    Constuctor(){
        this.age=0;
        this.contactNO=0;
        this.name="unknown";
        this.address="not available" ;   }

        //parameterized constructor
        Constuctor(int age, int contactNO, String name,String address){
            this.age=age;
            this.contactNO=contactNO;
            this.name=name;
            this.address=address;

        }

        //copy constructor
        Constuctor(Constuctor obj){
            this.age=obj.age;
            this.contactNO=obj.contactNO;
            this.name=obj.name;
            this.address=obj.address;
        
        }
        @Override
        public String toString(){
            return "Age: "+age+" Contact No: "+contactNO+" Name: "+name+" Address: "+address;
        }

    }
public class ConstuctorDemo {

        public static void main(String [] args){
            Constuctor obj1 = new Constuctor();
            Constuctor obj2 = new Constuctor(18, 6546757, "radhe", "indore");
            Constuctor obj3 = new Constuctor(obj2);

            System.err.println(obj1);
            System.err.println(obj2);
            System.err.println(obj3);
        }
}
