package toys;

public class Tiger extends BaseToy {

    public Tiger(int id, String name) {
        super(id, name);
    
    }

    public Tiger(int id) {
        this(id, String.format("%s%d","Tiger", id));
        
    }
    
    
}
