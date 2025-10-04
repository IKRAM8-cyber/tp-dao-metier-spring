package dao;

public class Daoimpl implements IDao {
    @Override
    public double getData() {
        /* afficher un message pour recuperer la valeur  de data de la BD   */
        System.out.println("version base de donnees");
        double data=34;
        return data;
    }
}
