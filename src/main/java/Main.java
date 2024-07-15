import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i);
            String name = scanner.next();
            System.out.println("Введите скорость машины №" + i);



                  while (true) {



                      if (scanner.hasNextInt()) {
                          int speed = scanner.nextInt();
                          if (speed > 0 & speed <= 250) {
                              race.calculate(name, speed);
                              break;
                          }
                          else {
                              System.out.println("Введено неверное значение. Попробуйте еще раз.");
                          }

                      } else {
                          scanner.nextLine();
                          System.out.println("Введите целое число");
                      }
                  }
        }
        System.out.println("Самая быстрая машина: " + race.leader);
    }
}



class Race {
     String leader = "";
     int leaderDistace = 0;

    void calculate(String name, int speed) {
        int distance;
        distance = 24 * speed;
        if (distance > leaderDistace) {
            leader = name;
            leaderDistace = distance;
        }
    }
}