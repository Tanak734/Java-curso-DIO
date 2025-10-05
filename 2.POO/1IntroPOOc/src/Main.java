public class Main {


    public static void main (String[] args) {

        // publico
//        var male = new Person();
//        male.name = "joao";
//        male.age = 12;
//        var female = new Person();
//        female.name = "maria";
//        female.age = 10;
//        System.out.printf("Nome: %s | Idade: %s", male.name, male.age);
//        System.out.println("\n");
//        System.out.printf("Nome: %s | Idade: %s", female.name, female.age);

        // privado
        final var male = new Person("felipe");
        var female = new Person("joao");

        male.setAge(10);
        female.setAge(11);

        //como os itens sao privados eles nao podem ser acessados de maneira normal
        //precisando do get para pegar e atribuir e o
        System.out.printf("Nome: %s | Idade: %s", male.getName(), male.getAge());

        System.out.printf("Nome: %s | Idade: %s", female.getName(), female.getAge());





    }
}
