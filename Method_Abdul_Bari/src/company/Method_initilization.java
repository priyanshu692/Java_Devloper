package company;

public class Method_initilization {
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
}
    class TestStudent4{
        public static void main(String args[]){
            Method_initilization s1=new Method_initilization();
            Method_initilization s2=new Method_initilization();
            s1.insertRecord(111,"Karan");
            s2.insertRecord(222,"Aryan");
            s1.displayInformation();
            s2.displayInformation();
        }
}

