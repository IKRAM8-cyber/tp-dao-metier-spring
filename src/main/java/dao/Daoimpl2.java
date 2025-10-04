package dao;

public class Daoimpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version Web Servive");
        double data=55;
        return data;
    }
}


