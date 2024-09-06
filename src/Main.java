public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Task1");
        int age = 11;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // task 2
        System.out.println("Task2");
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // task 3
        System.out.println("Task3");
        int speed = 78;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }

        // task 4
        System.out.println("Task4");
        age = 25;
        if (age <= 2 && age <= 5) {
            System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в садик");}
        if (age <= 7 && age <= 17) {
            System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в школу");}
        if (age <= 18&& age <= 24){
            System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в университет");}
        if (age > 24) {
            System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить на работу :’D");}

        // task 5
        System.out.println("Task5");
        age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен "+ age +", то ему нельзя кататься на аттракционе");}
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен "+ age +", то ему можно кататься на аттракционе в сопровождении");}
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен "+ age +", то ему можно кататься на аттракционе без сопровождения взрослого");}

        // task 6
        System.out.println("Task6");
        int capacity = 102;
        int seating = 60;
        int people = 54;
        if (people < seating) {
            System.out.println("В вагоне есть сидячее место"); }
        if (people > seating && people < capacity) {
            System.out.println("В вагоне остались только стоячие места");}
        if (people > capacity) {
            System.out.println("В вагоне нет мест");}

        // task 7
        System.out.println("Task7");
        int one = 41;
        int two = 87;
        int three = 34;
        if (one > two && one > three) {
            System.out.println("Максимум "+ one); }
        else { if (two > three) {
            System.out.println("Максимум "+ two);}
        else {
            System.out.println("Максимум "+ three);}
        }


    }
}

