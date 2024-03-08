import java.util.ArrayList;

public class Barn {
    ArrayList<Animal> animals;
    int weight = 0;
    public Barn()
    {
        animals = new ArrayList<>();
    }
    public void Add(Object object){
        if(object instanceof Animal){
            switch(((Animal)object).size){
                case SMALL :
                    if(30 - weight > 1){
                        animals.add((Animal) object);
                        weight++;
                    }
                    break;
                case MEDIUM:
                    if(30 - weight > 2){
                        animals.add((Animal) object);
                        weight+=2;
                    }
                    break;
                case BIG:
                    if(30-weight>3){
                        animals.add((Animal) object);
                        weight+=3;
                    }
                    break;
                default:
                    throw new RuntimeException("Wrong animal size");
            }
        } else throw new RuntimeException("Wrong object instance");
    }
    public void PetAnimal(Class type)
    {
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).getClass().equals(type)){
                // You pted animal I think
            }
        }
    }
}
