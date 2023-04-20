public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var boxerOne=78.2;
        var boxerTwo=82.7;
        var allBoxer=boxerOne+boxerTwo;
        System.out.println("Общий вес боксеров "+allBoxer+"кг ");
        var differenceBoxer=boxerOne-boxerTwo;
        System.out.println("Разница в весе "+differenceBoxer+ "кг");
        var difBoxer=boxerTwo-boxerOne;
        System.out.println("Разница весов боксеров " +difBoxer+ "кг");
        var diBoxer=boxerTwo % boxerOne;
        System.out.println("Разница весов "+diBoxer+"кг ");

        var allHour=640;
        var hourOne=8;
        var staffAll=allHour / hourOne;
        System.out.println("Всего работников в компании " +staffAll+ "человек");

        var staffPlus=staffAll+94;
        var hourPlus=staffPlus*hourOne;
        System.out.println("Если в компании работает "+staffPlus+ "человек, то всего "+hourPlus+ "часов работы может быть поделено между сотрудниками");
    }
}