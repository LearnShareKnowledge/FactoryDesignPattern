/**
 * Created by 310124463 on 16/02/17.
 */
public class OrderDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }
}
