package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpingAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("Dao","metier");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
