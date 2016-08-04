package StreamaAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;


public class Main {
    public static void main(String [] args)
    {

                        ArrayList<Car> p = new ArrayList<Car>();

                        p.add(new Car("BMW","BLACK", 2014, 3135));
                        p.add(new Car("Lada","White",  1999, 1465));
                        p.add(new Car("Porshe","Panamera",  1990, 8668));
                        p.add(new Car("Lancer 8","RED",  2013, 6411));

                       /* h.stream().sorted((x1,x2)-> x1.compare(x2)).forEach(x -> System.out.print(x));*/


                        System.out.println("Picture_name sorted");
                        p.stream().sorted(Comparator.comparing((x) -> x.getBrend())).forEach(x -> System.out.print(x));
        System.out.println("Car name sorted");
        p.stream().sorted((x1,x2)-> x2.compare(x1)).forEach(x -> System.out.print(x));
        System.out.println();
        System.out.println("Years sorted");

       /* System.out.println();
                        System.out.println("Min Number");
                        System.out.println(p.stream().min(Comparator.comparing((x) -> x.getYear())));*/

        System.out.println("min nechetniy year");
        System.out.println(p.stream().min(Comparator.comparing((x) -> x.outOk3())));




        System.out.println();
                        System.out.println("Max Price");
        System.out.println(p.stream().max(Comparator.comparing((x) -> x.getYear())));



                                                     /*   System.out.println("Year--nechetnie");
                                                        p.stream().forEach(x -> {
                                                            if (x.outOk2())System.out.println(x);
                                                        });

                                                        System.out.println("Year--chetnie");
                                                        p.stream().forEach(x -> {
                                                            if (x.outOk3())System.out.println(x);
                                                        });
                                */
      /*  System.out.println("Year-------------");
        h.stream().forEach(x -> {
            if (x.outOk())System.out.println(x);
        });

        System.out.println("Input value :");
        int temp = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            temp = Integer.parseInt(br.readLine());
        }catch(Exception e){}


        final int  temp2 = temp;
        System.out.println();
        System.out.println("Position---------");
        Car.stream().forEach(x -> {if (x.outOK2(temp2)) System.out.println(x);});*/






        /*

        ArrayList<Sportsman> listOfSportsmans = new  ArrayList<Sportsman>();

        listOfSportsmans.add(new Sportsman(1,"Pavlenko Aleksandr","1996"));
        listOfSportsmans.add(new Sportsman(3,"Bezverkhy Anton","1995"));
        listOfSportsmans.add(new Sportsman(2,"Dendy","1989"));
        listOfSportsmans.add(new Sportsman(4,"Xboct","1990"));

        System.out.println(listOfSportsmans.stream().max((x1, x2) ->  x1.compareTo(x2)));
        System.out.println(listOfSportsmans.stream().min((x1, x2) ->  x1.compareTo(x2)));

        System.out.println();
        System.out.println("Sorted-------------");
        listOfSportsmans.stream().sorted((x1, x2) -> x1.reversCompareTo(x2)).forEach(x -> System.out.println(x));

        System.out.println();
        System.out.println("Year-------------");
        listOfSportsmans.stream().forEach(x -> {if (x.outOk()) System.out.println(x);});

        System.out.println("Input value :");
        int temp = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            temp = Integer.parseInt(br.readLine());
        }catch(Exception e){}


        final int  temp2 = temp;
        System.out.println();
        System.out.println("Position---------");
        listOfSportsmans.stream().forEach(x -> {if (x.outOK2(temp2)) System.out.println(x);});
*/
    }
}
