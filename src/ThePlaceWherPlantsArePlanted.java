import java.util.ArrayList;

public class ThePlaceWherPlantsArePlanted {
    double emptyHa;
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
    public void WaterFlowersTypeOf(Class type){
        for (int i = 0; i < flowers.size(); i++) {
            if(flowers.get(i).getClass().equals(type)){
                flowers.get(i).chanceOfGrowth = 1.414213562373095 * flowers.get(i).chanceOfGrowth;
            }
        }
    }
    public void HarvestFlowerTypeOf(Class type){
        for (int i = 0; i < flowers.size(); i++) {
            if(flowers.get(i).getClass().equals(type)){
                flowers.remove(i);
            }
        }
    }
    public void buyNewHa(int moneyYouWantToSpend){
        emptyHa += moneyYouWantToSpend / 100000;
    }
}
