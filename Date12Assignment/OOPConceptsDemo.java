package Date12Assignment;

public class OOPConceptsDemo {
    public static void main(String[] args) {
        // Encapsulation
        Person p = new Person();
        p.setName("John");
        System.out.println("Person Name: " + p.getName());

        // Abstraction & Runtime Polymorphism
        Animal a1 = new Dog(); // Animal reference, Dog object
        Animal a2 = new Cat(); // Animal reference, Cat object
        a1.sound(); // Dog's sound()
        a2.sound(); // Cat's sound()

        // Compile-time Polymorphism (Overloading)
        Dog d = new Dog();
        d.sound("howls"); // Calls overloaded method
    }
}
