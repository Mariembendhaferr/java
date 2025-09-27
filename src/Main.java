//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Animal chat = new Animal();
        Animal chien = new Animal();
        Zoo frigya = new Zoo();
        chien.family="chien";
        chien.name="boby";
        chien.age=2;
        chien.isMammal=true;
        System.out.println("chien : "+chien);

        chat.family="chat";
        chat.name="michou";
        chat.age=1;
        chat.isMammal=true;
        System.out.println("michou : "+chat);

        frigya.name ="frigya";
        System.out.println("frigya : "+frigya);*/

        //creation de la zoo et des animaux
        Zoo zoo = new Zoo("my Zoo","tunisie");
        Animal animal = new Animal("Chat","katis",2,true);
        Animal animal2 = new Animal("Chien","loulou",1,true);
        Animal animal3 = new Animal("Lion","Mike",1,true);
        Animal animal4 = new Animal("Tigre","Sam",1,true);
        Animal animal5 = new Animal("Pingoin","Dean",1,true);
        Animal animal6 = new Animal("Fox","Foxy",1,true);
        Animal animal7 = new Animal("Fox","Foxy",1,true);
        Animal animal8 = new Animal("Chat","katis",1,true);
        /*///////////////////////////////////////////////////////////////////////////////////////*/

        //ajoout des animaux dans le zoo
        boolean result1 = zoo.addAnimal(animal);
        System.out.println("Résultat ajout chat: " + result1);

        boolean result2 = zoo.addAnimal(animal2);
        System.out.println("Résultat ajout chien: " + result2);

        boolean result3 = zoo.addAnimal(animal3);
        System.out.println("Résultat ajout lion: " + result3);

        boolean result4 = zoo.addAnimal(animal4);
        System.out.println("Résultat ajout tigre: " + result4);

        //zoo.displayZoo();

        boolean result5 = zoo.addAnimal(animal5);
        System.out.println("Résultat ajout pingouin: " + result5);

        zoo.displayAnimals();
        /*//////////////////////////////////////////////////////////////////////////////////////////*/

        //recherche d'un animal
        int indice = zoo.searchAnimal(animal6);
        System.out.println(indice);

        int indice1 = zoo.searchAnimal(animal7);
        System.out.println(indice1);
        /*//////////////////////////////////////*/

        //test de l'ajout avec les modifications
        System.out.println("\n1. Tentative d'ajouter à nouveau 'katis' (déjà présent):");
        boolean testDuplicate = zoo.addAnimal(animal);
        System.out.println("Résultat: " + testDuplicate);

        System.out.println("\n2. Tentative d'ajouter un autre animal avec le nom 'katis':");
        boolean testSameName = zoo.addAnimal(animal8);
        System.out.println("Résultat: " + testSameName);

        System.out.println("\n3. Tentative d'ajouter Dean (zoo plein):");
        boolean testFullZoo = zoo.addAnimal(animal5);
        System.out.println("Résultat: " + testFullZoo);
        /*//////////////////////////////////////////////////////////////////////////////////////////////*/

        //test de supression d'un animal
        boolean testSupression = zoo.removeAnimal(animal3);
        System.out.println("Résultat: " + testSupression);
        /*/////////////////////////////////////////////////////////////////////*/

        zoo.displayAnimals();

        //test si zoo est plein
        if (zoo.isZooFull()) {
            System.out.println("Plus de place !");
        } else {
            System.out.println("Encore " + (25 - zoo.nbrAnimals) + " places libres");
        }
    }
}