package ejb3.interfaces;

import javax.ejb.Local;


/**
 * Created by avoroncovs on 17.02.2017.
 */
@Local
public interface SampleBeanLocal {
    String method();
}
