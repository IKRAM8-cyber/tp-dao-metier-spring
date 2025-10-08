package presentation;

import dao.Daoimpl;
import dao.Daoimpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        //permet de creer un object Dao de type DAOImpl Couplage fort
        Daoimpl dao=new Daoimpl(); //Instanciation statique ,new,
        //permet de creer un object metier de type MetierImpl
        MetierImpl metier=new MetierImpl();
        //Injection des dependances
        metier.setDao(dao);
        System.out.println("Res=" +metier.calcul());

    }
}

