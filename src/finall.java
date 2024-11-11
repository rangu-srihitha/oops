public class wrapper {
    public static void main(String[] args) {
        //java only pass by value
        //final applied to only primitive data type
       final G kunal=new G("sri");
        kunal.name="other name";
       // kunal=new G("new obj"); cant do
        System.out.println(kunal.name);

    }
}
class G {final int a =10;
    String name;
    public G(String name){
        this.name=name;

    }




}
