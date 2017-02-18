/**
 * Created by 310124463 on 16/02/17.
 */
public class ErrorDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
