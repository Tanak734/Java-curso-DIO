public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee();
        var manager1 = new Manager();

        System.err.println(employee1 instanceof Manager);
        System.err.println(manager1 instanceof Employee);
    }
}
