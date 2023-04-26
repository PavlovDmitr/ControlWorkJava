package toys;

public class Fox extends BaseToy {

    

    public Fox(int id, String name) {
        super(id, name);
        //TODO Auto-generated constructor stub
    }
    
    public Fox(int id) {
        this(id, String.format("%s%d", "Fox", id));
    }
}
