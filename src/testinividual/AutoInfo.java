package testinividual;

import java.util.ArrayList;

public class AutoInfo {

    public static void main(String[] args) {

        ArrayList<Auto> listAuto = new ArrayList<>();
        listAuto.add(new Auto("Lada",2000));
        listAuto.add(new Auto("zaz",2001));
        listAuto.add(new Auto("UAZ",2002));
        listAuto.add(new Auto("Volga",2003));

       AutoInfo info = new AutoInfo();

       info.testAuto(listAuto, new CheckAuto() {
           @Override
           public boolean checkAuto(Auto auto) {
             return  auto.getJahr()>2000;
           }
       });

       //var2
        System.out.println("-------------------------------");
       info.testAuto(listAuto, (Auto a)-> {return a.getJahr()>2004;});

    }

    void testAuto(ArrayList<Auto> list,  CheckAuto ac ){
        for (Auto a: list
             ) {
            if(ac.checkAuto(a)){
                System.out.println(a);
            }
        }

    }





}


