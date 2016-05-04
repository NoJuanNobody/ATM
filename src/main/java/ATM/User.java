package ATM;

import java.util.UUID;
import java.util.ArrayList;

/**
 * Created by alejandrolondono on 5/3/16.
 */
public class User {
    String name;
    int id = UUID.randomUUID().hashCode();
    private ArrayList accounts= new ArrayList();
    Log transactionLog = new Log();
}
