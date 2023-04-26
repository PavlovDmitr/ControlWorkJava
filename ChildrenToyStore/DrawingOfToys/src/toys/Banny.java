package toys;

public class Banny extends BaseToy {

    int weight;
    int count;

    public Banny(int id, String name) {
        super(id, name);
        
    }
    
    public Banny(int id) {
        this(id, String.format("%s%d", "Banny", id));
    }

}
