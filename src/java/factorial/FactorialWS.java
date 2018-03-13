/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "FactorialWS")
public class FactorialWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public Integer factorial(@WebParam(name = "parameter") int num) {
        int res = 1;
        while(num!=0) {
            res = res*num;
            num--;
        }
        return res;
    }
}
