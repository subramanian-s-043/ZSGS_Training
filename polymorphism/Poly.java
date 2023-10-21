package polymorphism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Poly {
    final int a;//nssli
    String s;
    {//nsmli
       a=10;
    }
    
    Poly(){
        super();

    }
    Poly(String s){
        super();
        this.s=s;
    }
    public static void main(String[] args) {
        List li=new ArrayList<>();
        li.add(2);;
        li.add("perumal");
        li.add(7.8);
        System.out.println(li.toString());
        Set s =new TreeSet();
        s.add(1);
        s.add(77);
        s.add(5);
        System.out.println(s.toString());
    }
}
