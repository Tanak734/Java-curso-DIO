public class MaquinaPet {
    
    private Pet pet;
    private int agua;
    private int shampoo;
    private boolean maqClean;

    public MaquinaPet(){
        this.agua = 0;
        this.maqClean = true;
        this.shampoo = 0;
    }

    public void banhoPet(){

        if (pet == null){
            System.out.println("Nao ha pet na maquina\n");
            return;

        } else if (pet.isClean() == false) {
            if (this.maqClean == true) {
                System.out.println("Limpando o pet...");

                // limpeza pet
                this.agua -= 10;
                this.shampoo -= 2;


                pet.setClean(true);
                System.out.printf("O pet %s esta limpo", pet.getName());
            }
            System.out.println("Limpe a maquina primeiro antes de limpar o pet\n");
            
        } else {
            System.out.print("O pet ja está limpo");
        }

    }

    public void petExisteMaq(){
        
    }

    public void cleanMaq() {
        if (maqClean == false){
            System.out.println("A maquina esta suja\n");
            System.out.println("Limpando....\n");

            this.agua -= 3;
            this.shampoo -= 1;
            this.maqClean = true;

            System.out.println("A maquina esta limpa\n");
        }
        
        System.out.println("A maquina ja esta limpa\n");

    }




    public void addAgua(){
        if (this.agua > 30) {
            System.out.println("A maquina esta na capacidade maxima de agua\n");
        }

        this.agua += 2;
        System.out.println("Foram adicionados 2 litros de agua a maquina\n");
    }
    
    public void addShampoo(){
        if (this.shampoo == 10) {
            System.out.println("A maquina esta na capacidade maxima de shampoo\n");
            this.shampoo = 10;
        }
    
        this.shampoo += 2;
        System.out.println("Foram adicionados 2 litros de shampoo a maquina\n");
    }

    public void checkAgua() {
        System.out.printf("A capacidade atual de agua é de %s litros", this.agua);       
    }
    
    public void checkShampoo(){
        System.out.printf("A capacidade atual de shampoo é de %s litros", this.shampoo);       

    }


}