import java.time.OffsetDateTime;

public class Person { // molde para criar pessoas

    // classes publicas - acessiveis
//    public String name;
//    public int age;
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//



    //private String name;
    //private int age;
//
//
//    public String getName() { //pega o atributo "nome"
//        return name;
//    }
//
//    public int getAge() { // pega o atributo "idade"
//        return age;
//    }
//
//    public void setName(String name) { //recebe um argumento String que
//        this.name = name;
//    }
//
//    public void setAge(int age) { // Recebe um argumento de numeral
//        this.age = age;
//    }


    //---------------------------------------------//
    //exemplo de static//
//
//    private static String test;
//
//    public static String getTest() {
//        return test;
//    }
//
//    public static void setTest(String test) { // static nao pode ser instaciada
//        Person.test = test;
//
//

    //---------------------------------------------//
    //exemplo de construtores e final

    private final String name; // os valores definidos para ela nao podesem mudar
    private int age;
    private int lastYear = OffsetDateTime.now().getYear();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //definindo um construtor
    public Person(String name) {
        this.name = name; // se nome = "joao" é apenas joao

    }

    public void incAge(){
        if (this.lastYear >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYear = OffsetDateTime.now().getYear();
    }
}
