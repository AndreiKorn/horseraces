/**
 * Created by KORN on 10.11.2017.
 */
public class Horse {
    private String name;
    private double speed;
    private  double distance;

    /**
     * Конструктор класса Horse
     * @param name - имя лошади
     * @param speed - скорость
     * @param distance - стартовая позиция
     */
    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Изменяет текущую позицию лошади
     */
    public void move() {
        distance += (speed * Math.random());
    }

    /**
     * Выводит в консоль позицию лошади, обозначая пройденный путь количеством точек перед именем
     */
    public void print() {
        for (int i = 0; i < (int) distance; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }
}
