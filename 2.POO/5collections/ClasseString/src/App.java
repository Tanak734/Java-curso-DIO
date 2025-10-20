public class App {
    public static void main(String[] args) {
        String texto = "Hello Java World ";
        String texto2 = "HELLO";
        String texto3 = "hello";
        
        // equals - Compara strings por conteúdo
        System.out.println("equals: " + texto2.equals("HELLO"));
        
        // equalsIgnoreCase - Compara ignorando maiúsculas/minúsculas
        System.out.println("equalsIgnoreCase: " + texto2.equalsIgnoreCase(texto3));
        
        // compareTo - Compara lexicograficamente
        System.out.println("compareTo: " + texto2.compareTo("hello"));
        
        // length - Retorna tamanho da string
        System.out.println("length: " + texto.length());
        
        // charAt - Retorna caractere na posição
        System.out.println("charAt: " + texto.charAt(1));
        
        // indexOf - Retorna primeira ocorrência
        System.out.println("indexOf: " + texto.indexOf("Java"));
        
        // lastIndexOf - Retorna última ocorrência
        System.out.println("lastIndexOf: " + texto.lastIndexOf("l"));
        
        // contains - Verifica se contém a sequência
        System.out.println("contains: " + texto.contains("a"));
        
        // startsWith - Verifica se começa com prefixo
        System.out.println("startsWith: " + texto.startsWith(" Hello"));
        
        // endsWith - Verifica se termina com sufixo
        System.out.println("endsWith: " + texto.endsWith("World "));
        
        // substring - Retorna substring entre índices
        System.out.println("substring: " + texto.substring(7, 11));
        
        // concat - Concatena strings
        System.out.println("concat: " + texto2.concat(" PROGRAMMING"));
        
        // replace - Substitui caracteres
        System.out.println("replace: " + texto.replace('a', 'o'));
        
        // toLowerCase - Converte para minúsculas
        System.out.println("toLowerCase: " + texto2.toLowerCase());
        
        // toUpperCase - Converte para maiúsculas
        System.out.println("toUpperCase: " + texto3.toUpperCase());
        
        // trim - Remove espaços do início e fim
        System.out.println("trim: " + texto.trim());
        
        // split - Divide string em array
        String[] partes = texto.trim().split(" ");
        System.out.println("split: " + java.util.Arrays.toString(partes));
        
        // toCharArray - Converte para array de caracteres
        char[] chars = texto2.toCharArray();
        System.out.println("toCharArray: " + java.util.Arrays.toString(chars));
        
        // valueOf - Converte qualquer tipo para String
        System.out.println("valueOf: " + String.valueOf(12345));
    }
}
