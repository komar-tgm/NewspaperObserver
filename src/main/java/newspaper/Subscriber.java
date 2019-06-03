package newspaper;

public class Subscriber implements Observer{
    private Newspaper newspaper;
    private Publisher publisher;
    private String name;

    public Subscriber(Publisher publisher){
        this.name="";
    }
    @Override
    public void update(Newspaper newspaper) {
        this.newspaper=newspaper;
        display();
    }
    public void display(){
        System.out.println(this.newspaper.toString());
    }
}
