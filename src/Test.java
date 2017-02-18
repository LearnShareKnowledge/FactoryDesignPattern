/**
 * Created by 310124463 on 16/02/17.
 */
public class Test {

    public static void main(String [] args)
    {
        DisplayService service = new OrderDisplayService();

        service.display();

        service = new FeedbackDisplayService();

        service.display();

        service = new ErrorDisplayService();

        service.display();

    }
}
