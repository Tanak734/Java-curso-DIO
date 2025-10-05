public record Person(String name, int age ) {

    public String saudacao() {
        return  "ola " + name + " voce tem " + age + " anos";
    }
}