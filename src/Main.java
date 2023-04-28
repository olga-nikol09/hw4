public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то он совершеннолетний");
        }
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + " , он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача2");
        float temperature = 3.4f;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача3");
        int speed = 35;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задача4");
        int age = 4;
        if (age <= 2) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора спать");
        } else if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детски сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он может отдохнуть");
        }
        System.out.println("Задача5");
        int child = 15;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child + ", то ему нельзя кататься на атракционе");
        } else if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + child + " он может кататься без сопровождения взрослого");
        }
        System.out.println("Задача6");
        int freePlaces = 120;
        int capacity = 120;
        int seatPlace = 60;
        int restPlaces = capacity - seatPlace;
        if (freePlaces < 120 && freePlaces >= restPlaces) {
            System.out.println("Есть стоячие и сидячие места в вагоне ");
        }
        else if (freePlaces < restPlaces) {
            System.out.println("Есть стоячие места");
        }
        else {
            System.out.println("Вагон полностью занят");
        }
        System.out.println("Задача7");
        int one = 55;
        int two = 120;
        int three = 11;
        if (one > two || one  > three ) {
            System.out.println(one + " больше чем " + two + " и " + three);
        } else if (one > two || one < three) {
            System.out.println(three + " больше чем " + two + " и " + one);
        } else {
            System.out.println(two + " больше чем " + one + " и " + three);
        }
    }
}