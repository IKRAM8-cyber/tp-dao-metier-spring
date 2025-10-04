package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
      private IDao dao; //Couplage faible : le fait de dependre d'une Interface  et non pas d'une Classe
    @Override
    public double calcul() {
        double data= dao.getData();
        double res=data*12;
        return res;
    }
/** Set pour  permettre d'ingecter  dans la  variable dao
    un object d'une classe qui implimente l'interface Idao
 */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
