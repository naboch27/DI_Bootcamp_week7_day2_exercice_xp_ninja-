import Exercice_1.Student;
import Exercice_2.Player;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Kiran", 4, 12345);

        System.out.println("============Result Student ===============");

        System.out.println("Student name is : " + student.getStdName());

        System.out.println("Student Roll is : " + student.getStdRollNo());

        System.out.println("Student Id is : " + student.getStdId());

        System.out.println("============Result Student 2===============");

        System.out.println(student.toString());


        System.out.println("============Result Player ===============");

        Player player = new Player("Sachin", 40, "Cricket");

        System.out.println("Player name is : "+player.getName());

        System.out.println("Player Age is : "+player.getAge());

        System.out.println("Player game type is : "+player.getGameType());

        System.out.println("============Result Player 2 ===============");

        System.out.println(player.toString());

    }

}
