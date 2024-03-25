package Inheritance;

public class Inheritance3 {
    public static void main(String[] args) {
        Child c = new Child();
        //Child c1 = new Child(y);
        //Child c2 = new Child(x,z);
    }
}

class Parents {
    Parents() {
        System.out.println("non parameterized constructor");
    }

    Parents(int x) {
        System.out.println("parameterized constructor");
    }
}

class Child extends Parents {
    Child() {
        //super(); // Calling the no-argument constructor of the superclass explicitly
        System.out.println("non parameterized constructor");
    }
    /* Child(int x, int z ){

    }

    Child(int y) {
        // Calling the parameterized constructor of the superclass explicitly
        System.out.println("parameterized constructor");
    } */
}

