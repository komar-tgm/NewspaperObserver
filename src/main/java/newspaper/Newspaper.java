package newspaper;

public class Newspaper {
    private String name;
    private String headline;
    private String context;

    public Newspaper(){
        this.name="";
        this.headline="";
        this.context="";
    }
    public void setAll(String name,String headline,String context){
        this.name=name;
        this.headline=headline;
        this.context=context;
    }

    @Override
    public String toString(){
        return this.name+" "+this.headline+" "+this.context;
    }
}
