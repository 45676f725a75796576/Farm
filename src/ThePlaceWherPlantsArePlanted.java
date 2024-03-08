import java.util.ArrayList;

public class ThePlaceWherPlantsArePlanted {
    int emptyHa;
    ArrayList<Flower> flowers;
    public ThePlaceWherPlantsArePlanted(){
        emptyHa = 100;
        flowers = new ArrayList<>();
    }
    public void Add(Object object)
    {
        if(object instanceof Flower){
            flowers.add((Flower) object);
            emptyHa-=((Flower)object).neededArea;
        } else throw new RuntimeException("Wrong object instance");
    }
}
