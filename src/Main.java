public class Main {
    public static void main(String[] args) {

        // задча 1
        double dog = 8;                 //int, long целые числа... float, double со значением после запятой
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);System.out.println(cat);System.out.println(paper); System.out.println(" ");
        //задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);System.out.println(cat);System.out.println(paper); System.out.println(" ");
        //задача 3
        dog = dog - 3.5; // IDEA ругается на это действие, сменил тип переменной
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);System.out.println(cat);System.out.println(paper); System.out.println(" ");

        // задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");
        // задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);System.out.println(" ");

        // задача 6
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;

        var summaWeight = oneBoxer + twoBoxer;
        System.out.println("общий вес боксёров" + summaWeight + "кг" );
        var raznostWeight = oneBoxer - twoBoxer;
        System.out.println("разница в весе боксёров" + raznostWeight + "кг");System.out.println(" ");

        // задача 7
        var raznostWeight2 = twoBoxer - oneBoxer;
        System.out.println("разница в весе боксёров" + raznostWeight2 + "кг");
        var procentWeight = twoBoxer % oneBoxer;
        System.out.println("разница в весе боксёров" + procentWeight + "кг");
        System.out.println(" ");System.out.println(" ");

        //задача 8
        var hour = 640;
        var workHour = 8;
        var workPeople = hour / workHour;
        System.out.println("Всего работников в компании " + workPeople + " человек");
        var workPeopleall = workPeople + 94;
        var workHourall = workHour * workPeopleall;
        System.out.println("Если в компании работает " + workPeopleall + " человека, то всего " + workHourall + " часов работы может быть поделено между сотрудниками");

    }
}