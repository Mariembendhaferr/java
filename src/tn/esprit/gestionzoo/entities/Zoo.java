package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25 ;
    private int nbrAnimals;

    public Zoo() {}
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        animals = new Animal[nbrCages];
        nbrAnimals = 0;
    }

    public void displayZoo(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo name: " + name + ", city: " + city + ", nbrCages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo name: " + name + ", city: " + city + ", nbrCages: " + nbrCages;
    }

    /*public boolean addAnimal(tn.esprit.gestionzoo.entities.Animal animal) {
        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.name + " ajouté avec succès ");
            return  true;
        }
        else  {
            System.out.println("Le zoo est plein " + animal.name);
            return false;
        }
    }*/

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.getName() + " existe déjà ");
            return false;
        }
        else if (isZooFull()) {
            System.out.println("Le zoo est plein ");
            return false;

        }
        else {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " ajouté avec succès ");
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
            if (animals[i].getName.equals(animal.getName())) {
                return i;
            }
        }
        return -1; //
    }

    public boolean removeAnimal(Animal animal) {
        int indice = searchAnimal(animal);

        if (indice == -1) {
            System.out.println("L'animal " + animal.getName() + " n'existe pas dans le zoo !");
            return false;
        }
        else {
            for (int i = indice; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }

            animals[nbrAnimals - 1] = null;

            nbrAnimals--;

            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " supprimé avec succès !");
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
    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // Setters avec validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("ERREUR: Le nom du zoo ne peut pas être vide ! Nom mis à 'tn.esprit.gestionzoo.entities.Zoo Sans Nom'.");
            this.name = "tn.esprit.gestionzoo.entities.Zoo Sans Nom";
        } else {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }
}//end of class