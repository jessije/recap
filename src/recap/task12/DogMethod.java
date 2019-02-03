package recap.task12;

public class DogMethod {
    private String name;
    private String species;
    private int age;

    public DogMethod(String name, String species, int age){
        this.name=name;
        this.species=species;
        this.age=age;
    }

    public void printData(){
        System.out.println("Name: "+ name+","+" Species: " + species+"," + " Age: " +age);
    }
    public void beagleAge(int... beagleAges) {
        for (int ageOfBeagle : beagleAges) {
            if (ageOfBeagle < 3) {
                System.out.println("Dog is young");
            } else if (ageOfBeagle >= 3 && ageOfBeagle < 6) {
                System.out.println("Dog is adult");
            } else if (ageOfBeagle >= 6) {
                System.out.println("Dog is old");
            }
        }
    }
    public void huskyAge(int... huskyAges) {
        for (int ageofHusky : huskyAges) {
             if (ageofHusky < 4) {
                System.out.println("Dog is young");
            } else if (ageofHusky >= 4 && ageofHusky < 7) {
                System.out.println("Dog is adult");
            } else if (ageofHusky >= 7) {
                System.out.println("Dog is old");
            }
        }
    }
    public void chihAge(int... chihAges) {
        for (int ageofChih : chihAges) {
             if (ageofChih < 3) {
                System.out.println("Dog is young");
            } else if (ageofChih >= 3 && ageofChih < 7) {
                System.out.println("Dog is adult");
            } else if (ageofChih >= 7) {
                System.out.println("Dog is old");
            }
        }
    }
}

