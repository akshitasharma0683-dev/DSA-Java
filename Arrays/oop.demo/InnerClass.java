public class InnerClass {
     /**
      * InnerInnerClass
      */
       class test {
     String name;

     test(String name){
        this.name=name;
     }
        
     }

     public static void main(String args[]){
       // test t1 = new test("radhe");
       // System.out.println(t1.name);

        InnerClass.test t2 = new InnerClass().new test("krishna");
                System.out.println(t2.name);

     }

}
