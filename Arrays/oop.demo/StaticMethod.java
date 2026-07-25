
public class StaticMethod {
    
public static void main(String[] args){
 fun();

 StaticMethod s= new StaticMethod();
 System.out.print(s.greet());

}

 static void fun(){
    System.out.println("have fun");
   // greet(); not allowed becouse greet needs its instace 
}

String greet(){
    fun();
    return "hello world + fun() ";
}
}
