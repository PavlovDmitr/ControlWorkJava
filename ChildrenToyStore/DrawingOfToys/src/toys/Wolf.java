package toys;

public class Wolf extends BaseToy{

    public Wolf(int id, String name) {
        super(id, name);
        //TODO Auto-generated constructor stub
    }
    
    public Wolf(int id) {
        this(id, String.format("%s%d","Wolf", id));
    }
    
    
}
