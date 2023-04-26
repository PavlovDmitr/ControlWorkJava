package toys;

public abstract class BaseToy{
    
    protected int idToy;
    protected String nameToy;
    protected int weight;
    protected int count;

    /**
     * @param id id Toy
     * @param nameToy name Toy
     * @param weight chance drop Toy
     * @param count count of Toy
     */


    public BaseToy(int id, String name, int weight, int count){
        this.idToy = id;
        this.nameToy = name;
        this.count = count;
        this.weight = weight;

    }

    public int getIdToy() {
        return idToy;
    }
    
    public String getNameToy() {
        return nameToy;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <=1){weight=1}
        else if(weight>=100){weight=100}
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count<=1) {count=1}
        this.count = count;
    }

    

}
