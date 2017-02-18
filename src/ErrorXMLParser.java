/**
 * Created by 310124463 on 16/02/17.
 */
public class ErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("ErrorXMLParser.parse");
        return "Error XML Message";
    }
}
