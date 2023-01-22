public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("female");
        wolf.setNickname("Akela");
        wolf.setColor("grey");
        wolf.setAge(5);
        wolf.setWeight(30);

        System.out.println("Gender " + wolf.getGender());
        System.out.println("Nickname " + wolf.getNickname());
        System.out.println("Color " + wolf.getColor());
        System.out.println("Age " + wolf.getAge());
        System.out.println("Weight " + wolf.getWeight());
    }
}