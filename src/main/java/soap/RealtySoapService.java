package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;


@WebService()
public class RealtySoapService {
    @WebMethod
    public Schema getSchema() {
        return new Schema();
    }

    @WebMethod
    public CheckoutSchema getCheckoutSchema() {
        return new CheckoutSchema();
    }

    @WebMethod
    public Reference getReference(String id) {
        return new Reference();
    }

    @WebMethod
    public SearchResult index() {
        return new SearchResult();
    }

    @WebMethod
    public SearchResult search(SearchCriteria searchCriteria, List<SortCriteria> orderCriteria, int offset, int limit) {
        return new SearchResult();
    }

    @WebMethod
    public RealtyObject detail(String id) {
        return new RealtyObject();
    }

    @WebMethod
    public String checkout(CheckoutObject checkoutObject) {
        return "";
    }

    public static void main(String[] argv) {
        Object implementor = new RealtySoapService();
        String address = "http://0.0.0.0:9000/RealtySoap";
        System.out.println("Service starts at:" + address);
        Endpoint.publish(address, implementor);
    }

}
