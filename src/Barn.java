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
                    if(20 - weight > 1){
                        animals.add((Animal) object);
                        weight++;
                    }
                    break;
                case MEDIUM:
                    if(20 - weight > 2){
                        animals.add((Animal) object);
                        weight+=2;
                    }
                    break;
                case BIG:
                    if(20-weight>3){
                        animals.add((Animal) object);
                        weight+=3;
                    }
                    break;
                default:
                    throw new RuntimeException("Wrong animal size");
            }
        } else throw new RuntimeException("Wrong object instance");
    }
}
