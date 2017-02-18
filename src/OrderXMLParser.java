/**
 * Created by 310124463 on 16/02/17.
 */
public class OrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("OrderXMLParser.parse");
        return "Order XML message";
    }
}
