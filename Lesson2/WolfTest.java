public class WolfTest {
    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        wolf.gender = "female";
        wolf.nickname = "Akela";
        wolf.color = "grey";
        wolf.age = 5;
        wolf.weight = 30;

        System.out.println("Gender - " + wolf.gender);
        System.out.println("Nickname - " + wolf.nickname);
        System.out.println("Color - " + wolf.color);
        System.out.println("Age - " + wolf.age);
        System.out.println("Weight - " + wolf.weight);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}