import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyClass[] myArray = new MyClass[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new MyClass("object " + i);
        }

        List<MyClass> myList = new ArrayList<>();
        for (MyClass myClass : myArray) {
            myList.add(myClass);
        }

        List<MyClass> subList = myList.subList(1, 3);
        System.out.println("Sublist: " + subList);

        myList.removeAll(subList);
        System.out.println("Originalna lista po usunięciu sublist: " + myList);
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
