import java.util.Random;
import java.util.Scanner;

public class Dungeon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hp = 100;
        boolean hasItems;

        System.out.println("Your direction?");
        System.out.print("> ");
        String direction = sc.nextLine().toUpperCase();

        if (direction.equals("S") || direction.equals("SOUTH")) {
            System.out.println("You ran into a wall and die ...");
            hp -= 100;
            System.out.printf("Your health: '%d'", hp);
        } else if (direction.equals("W") || direction.equals("WEST")) {
            System.out.println("Going west");
            System.out.println("There is nothing in this room");
            System.out.println("The only direction is going north");

            System.out.println("Going north");
            System.out.println("There is a dragon in this room, you're trying to defeat him");
            int dragonHp = 150;
            int yourDamage = new Random().nextInt(500);
            dragonHp -= yourDamage;

            if (dragonHp < 0) {
                System.out.printf("The dragon is dying (damage: %d)! You're the new Siegfried!", yourDamage);
            } else {
                System.out.printf("You only did '%d' damage. Remaining HP of dragon: '%d'", yourDamage, dragonHp);
                System.out.println("The dragon is starting his attack, you cannot escape an die");
                hp -= 100;
                System.out.printf("Your health: '%d'", hp);
            }
        } else if (direction.equals("E") || direction.equals("EAST")) {
            System.out.println("Going east");
            System.out.println("The room is empty. What direction?");
            System.out.print("> ");
            String direction2 = sc.nextLine().toUpperCase();
            switch (direction2) {
                case "N", "NORTH": {
                    System.out.println("You're entering the secret room with the treasures. What is your answer to the riddle?");
                    System.out.println("Riddle: 'Who lived longer, the ghost or the poltergeist?'");
                    System.out.print("> Your answer: ");

                    String answer = sc.nextLine().toLowerCase();

                    if (answer.equals("a non-being can never have been.")) {
                        System.out.println("You're rewarded with the crown of rowena ravenclaw");
                        hasItems = true;
                        System.out.printf("Having items? %s", hasItems);
                    } else {
                        System.out.println("Every golden object in the room is turning into blood, you're drowning");
                        hp -= 100;
                        System.out.printf("Your health: '%d'", hp);
                    }
                }
                case "S", "SOUTH": {
                    System.out.println("You're falling through a trapdoor and die");
                    hp -= 100;
                    System.out.printf("Your health: '%d'", hp);
                }
                case "W", "WEST": {
                    System.out.println("You are entering a room filled with orks an die");
                    hp -= 100;
                    System.out.printf("Your health: '%d'", hp);
                }
                case "E", "EAST": {
                    System.out.println("You are entering a poisoned room an die");
                    hp -= 100;
                    System.out.printf("Your health: '%d'", hp);
                }
            }
        } else if (direction.equals("N") || direction.equals("NORTH")){
            System.out.println("You are distracted by your beauty in a mirror and ultimately die from it.");
            hp -= 100;
            System.out.printf("Your health: '%d'", hp);
        } else {
            System.out.println("Invalid direction ...");
        }

        sc.close();
    }

}