package newspaper;

public class Main {
    public static void main(String[] args){
        Publisher publisher=new Publisher();
        Subscriber subscriber=new Subscriber(publisher);
        Newspaper newspaper=new Newspaper();

        publisher.registerObserver(subscriber);
        System.out.println("SUBSCRIBER.DISPLAY");
        publisher.setNewspaper("NAME","HEADLINE","CONTEXT");

        //wenn newspaper aufgerufen wird, werden in Zuge dessen auch die Werte ausgegeben
    }
}
