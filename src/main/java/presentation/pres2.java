package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {

    public static void main() throws Exception {
        //Daoimpl dao=new Daoimpl();
         Scanner scanner = new Scanner(new File("config.txt"));
         String daoClassName=scanner.nextLine();
         //Instanciation Dynamique :il faut charger la classe en memoire
         Class cDao= Class.forName(daoClassName);
         IDao dao= (IDao) cDao.getConstructor().newInstance();

        //MetierImpl metier=new MetierImpl();
         String metierClassName=scanner.nextLine();
         Class<?> cMetier= Class.forName(metierClassName);
         IMetier metier=(IMetier) cMetier.getConstructor().newInstance();

         //metier.setDao(dao);INgection des dependances
        //Chercher une methode dans la classe Imetier qui s'apelle setdao avec presition de type d'argument qu'elle recoit

        Method setdao=cMetier.getDeclaredMethod("setdao",IDao.class);
        //Pour executer la methode set dao sur l'object metier

        setdao.invoke(metier,dao); // ceci est l'Injection des dependances

        System.out.println("Res="+metier.calcul());


    }
    }
