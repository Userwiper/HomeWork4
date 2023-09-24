public class Main {
    public static void main(String[] args) {
/* Задача 1 */
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний, нужно немного подождать");
        }
        /*Задача 2*/
        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("На улице "+ temperature +" градусов можно идти без шапки ");
        }
        else {
            System.out.println("На улице "+ temperature + " градуса нужно надеть шапку");
        }
        /*Задача 3*/
        int speed = 65;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ехать спокойно");
        }
        else {
            System.out.println("Если скорость "+ speed + " то придется заплатить штраф");
        }
        /*Задача 4*/
        int agePerson = 26;
        boolean ageSchool = agePerson >= 7 && agePerson <=17;
        boolean ageUniver = agePerson >=18 && agePerson <=24;
        boolean ageWork = agePerson > 24;

        if (agePerson <=6 && agePerson >=2) {
            System.out.println("Если возраст человека "+ agePerson + " то ему нужно ходить в детский сад");
        }
        else if (ageSchool){
            System.out.println("Если возраст человека "+ agePerson + " то ему нужно ходить в школу" );
        }
        else if (ageUniver) {
            System.out.println("Если возраст человека "+ agePerson + " то ему нужно ходить в Университет");
        }
        else if (ageWork){
            System.out.println("Если возраст человека "+ agePerson + " то ему нужно ходить на работу");
        }
        /*Задача 5*/
        int ageChild = 14;
        boolean support = ageChild >= 5 && ageChild <=14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка "+ ageChild +" то он не может кататься на аттракционе");
        }
        else if (support){
            System.out.println("Если возраст ребенка " + ageChild + " то он может кататься на аттракционе в сопровождении взрослых");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка "+ ageChild + " то он может кататься на аттракционе без сопровождения взрослых");
        }
        /*Задача 6*/
        int totalCapacity = 102;
        int numberOfSeats = 60;
        int situation = 103;
        if (situation <= numberOfSeats) {
            System.out.println("Есть сидячее место в вагоне");
        }
        else if (situation > numberOfSeats && situation <= totalCapacity) {
            System.out.println("Есть стоячее место в вагоне");
        }
        else {
            System.out.println("Вагон забит");
        }
        /*Задача 7*/
int one = 4;
int two = 5;
int three = 3;
if (one > two && one > three) {
    System.out.println("Первое число самое большое " + one);
} else if (two >one && two > three){
    System.out.println("Второе число самое большое " + two);
}
else {
    System.out.println("Третье число самое большое " + three);
}
    }
}