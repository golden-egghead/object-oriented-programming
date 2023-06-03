package DTO;

/**
 *
 * @author Tin
 */
public class BeeColony extends Colony implements IRole {
    String type;

    public BeeColony() {
    }

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "the colony’s type is " + this.type + ", size is about " + super.size + ", and the place is " + super.place;
    }
    
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}