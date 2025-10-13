package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")

public class MetierImpl implements IMetier {
   // @Autowired//Autowired:Injection authomatique
    //@Qualifier("d2")
      private IDao dao; //Couplage faible : le fait de dependre d'une Interface  et non pas d'une Classe

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;

    }

    public MetierImpl() {

    }

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
