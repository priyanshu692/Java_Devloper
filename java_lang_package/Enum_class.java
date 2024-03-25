package java_lang_package;

enum Dept{
    computer_sciense,
    information_technology,
    civil_engineer,
    Electronics_engineer
}

public class Enum_class {
    public static void main(String[] args) {
        Dept d = Dept.civil_engineer;
        System.out.println(d);
        Dept list[] = Dept.values();
        for (Dept x:list)
            System.out.println(x);
    }
}
