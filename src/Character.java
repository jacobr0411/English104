public class Character {

    private String name;
    private int hydration, physical, mentalHealth;


    Character() {
        this.name = name;
        this.hydration = (int) Math.floor(Math.random() * 10);
        this.physical = (int) Math.floor(Math.random() * 10);
        this.mentalHealth = (int) Math.floor(Math.random() * 10);
    }

    public void displayStats() {
        System.out.printf("Name: %s\nHydration: %d\nPhysical Health: %d\nMental Health: %d\n", name, hydration, physical, mentalHealth);
    }

    public Integer getHydration() {
        return hydration;
    }

    public Integer getPhysical() {
        return physical;
    }

    public Integer getMental() {
        return mentalHealth;
    }

    private boolean statChecker(int stat) {
        if (stat >= 10) {
            System.out.println("Already maxed");
            return false;
        } else
            return true;
    }
    private boolean deathCheck(int stat){
        if (stat <= 0){
            System.out.println("You can not continue like this");
            return false;
        }
        else
            return true;
    }
    public void increaseHydration(int amount) {
        if (statChecker(hydration)) {
            hydration += amount;
            System.out.printf("Hydration was increased by %d\n", amount);
            System.out.println();
        }
    }
    public void increasePhysical(int amount) {
        if (statChecker(physical)) {
            physical += amount;
            System.out.printf("Physical health was increased by %d\n", amount);
            System.out.println();
        }
    }
    public void increaseMental(int amount) {
        if (statChecker(mentalHealth)) {
            mentalHealth += amount;
            System.out.printf("Mental health was increased by %d\n", amount);
            System.out.println();
        }
    }
    public void decreaseHydration(int amount){
        if (deathCheck(amount)){
            hydration = hydration- amount;
            System.out.println("Hydration was decreased by "+amount);
            System.out.println();
        }
    }
    public void decreasePhysical(int amount){
        if (deathCheck(amount)){
            physical = physical- amount;
            System.out.println("Physical health was decreased by "+amount);
            System.out.println();
        }
    }
    public void decreaseMental(int amount){
        if (deathCheck(amount)){
            mentalHealth = mentalHealth- amount;
            System.out.println("Mental Health was decreased by "+amount);
            System.out.println();
        }
    }
}
