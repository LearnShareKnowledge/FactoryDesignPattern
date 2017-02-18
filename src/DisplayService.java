/**
 * Created by 310124463 on 16/02/17.
 */
public abstract  class DisplayService {

    public void display()
    {
        String message = getParser().parse();

        System.out.println(message);
    }

    public abstract XMLParser getParser();
}
