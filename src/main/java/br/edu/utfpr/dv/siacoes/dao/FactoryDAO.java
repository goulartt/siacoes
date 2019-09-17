import br.edu.utfpr.dv.siacoes.dao.ActivityDAO;
import br.edu.utfpr.dv.siacoes.dao.ActivityGroupDAO;
import br.edu.utfpr.dv.siacoes.dao.ActivitySubmissionDAO;
import br.edu.utfpr.dv.siacoes.dao.IDAO;

public class FactoryDAO {
    public IDAO getDAO(String dao){
        if(dao == null)
            return null;

        if(dao.equalsIgnoreCase("Activity"))
            return new ActivityDAO();
        else if(dao.equalsIgnoreCase("ActivityGroup"))
            return new ActivityGroupDAO();
        else if(dao.equalsIgnoreCase("ActivitySubmission"))
            return new ActivitySubmissionDAO();
        
        return null;
    }
}