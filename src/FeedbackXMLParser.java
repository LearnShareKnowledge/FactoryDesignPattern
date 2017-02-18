/**
 * Created by 310124463 on 16/02/17.
 */
public class FeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("FeedbackXMLParser.parse");
        return "Feedback XML message";
    }
}
