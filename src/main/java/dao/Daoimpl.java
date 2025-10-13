package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d")
public class Daoimpl implements IDao {
    @Override
    public double getData() {
        /* afficher un message pour recuperer la valeur  de data de la BD   */
        System.out.println("version base de donnees");
        double data=34;
        return data;
    }
}
