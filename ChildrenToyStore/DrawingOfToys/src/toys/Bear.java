package toys;

public class Bear extends BaseToy {

    public Bear(int id, String name) {
        super(id, name);
        
    }

    public Bear(int id) {
        this(id, String.format("%s%d","Bear", id));
        
    }
    
    
}
