package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal() {}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }


    public String toString(){
        return "tn.esprit.gestionzoo.entities.Animal [family=" + family + ", name=" + name + ", age=" + age + "]";
    }

    // Getters
    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // Setters avec validation
    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("ERREUR: L'âge ne peut pas être négatif ! Âge mis à 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }



}