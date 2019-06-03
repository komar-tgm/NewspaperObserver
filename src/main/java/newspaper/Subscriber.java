package newspaper;

public class Subscriber implements Observer{
    private Newspaper newspaper;
    @Override
    public void update(Newspaper newspaper) {
        this.newspaper=newspaper;
    }
}
