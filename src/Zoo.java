public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25 ;
    int nbrAnimals;

    public Zoo() {}
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
        nbrAnimals = 0;
    }

    public void displayZoo(){
        System.out.println("Zoo name: " + name + ", city: " + city + ", nbrCages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo name: " + name + ", city: " + city + ", nbrCages: " + nbrCages;
    }

    /*public boolean addAnimal(Animal animal) {
        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("Animal " + animal.name + " ajouté avec succès ");
            return  true;
        }
        else  {
            System.out.println("Le zoo est plein " + animal.name);
            return false;
        }
    }*/

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.name + " existe déjà ");
            return false;
        }
        else if (nbrAnimals >= nbrCages) {
            System.out.println("Le zoo est plein " + animal.name);
            return false;

        }
        else {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("Animal " + animal.name + " ajouté avec succès ");
            return true;
        }
    }

    public void displayAnimals() {
        if (nbrAnimals == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            for (int i = 0; i < nbrAnimals; i++) {
                System.out.println((i + 1) + ": " + animals[i]);
            }
        }
        System.out.println("Nombre total d'animaux: " + nbrAnimals );
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1; //
    }

    public boolean removeAnimal(Animal animal) {
        int indice = searchAnimal(animal);

        if (indice == -1) {
            System.out.println("L'animal " + animal.name + " n'existe pas dans le zoo !");
            return false;
        }
        else {
            // Décaler tous les animaux vers la gauche pour combler le vide
            for (int i = indice; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }

            // Supprimer la dernière référence
            animals[nbrAnimals - 1] = null;

            // Décrémenter le compteur d'animaux
            nbrAnimals--;

            System.out.println("Animal " + animal.name + " supprimé avec succès !");
            return true;
        }
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux !");
            return z1;
        }
    }

}//end of class