package ejb3.beans;

import ejb3.interfaces.SampleBeanLocal;
import javax.ejb.Stateless;


/**
 * Created by avoroncovs on 17.02.2017.
 */
@Stateless
public class SampleBean implements SampleBeanLocal {

    public String method() {
        return "Response of SampleBean";
    }
}
