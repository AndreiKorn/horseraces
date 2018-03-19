import java.util.ArrayList;
import java.util.List;

/**
 * Created by KORN on 10.11.2017.
 */
public class Hippodrome {
    private static Hippodrome game;
    private List<Horse> horses;

    public static void main(String[] args) {
        //Создаём список и добавляем туда 3 лошадей
        List<Horse> horsesList = new ArrayList<>();
        horsesList.add(new Horse("Horse1", 3, 0));
        horsesList.add(new Horse("Horse2", 3, 0));
        horsesList.add(new Horse("Horse3", 3, 0));

        //инициализируем статическую переменную game, передав в нёё список лошадей
        game = new Hippodrome(horsesList);

        //начинаем скачки
        game.run();
        game.printWinner();
    }

    /**
     * Конструктор класса Hippodrome
     * @param horses - список лошадей, участвующих в скачках
     */
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    /**
     * Методы отвечающий за гонки
     */
    public void run() {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {}
        }
    }

    /**
     * Метод, сигнализирующий всем лошадям, что необходимо сдвинуться вперёд
     */
    public void move() {
        for(Horse horse : horses) {
            horse.move();
        }
    }

    /**
     * Выводит в консоль текущее положение всех лошадей
     */
    public void print() {
        for(Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    /**
     * Метод, возвращающий победившую лошадь
     * @return - лошадь-победителя
     */
    public Horse getWinner() {
        Horse winner = horses.get(0);

        for (Horse horse : horses) {
            if (horse.getDistance() > winner.getDistance()) {
                winner = horse;
            }
        }

        return winner;
    }

    /**
     * Выводит в консоль информацию о победителе
     */
    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}