package DTO;

/**
 *
 * @author Tin
 */
public class University extends Organization {

    protected String name;

    public University() {
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }
    @Override 
    public void communicateByTool() {
        System.out.println("in the university, people communicate by voice");
    }
    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    
    public void educate() {
        System.out.println("provide education at university standard");
    } 
    
    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
}
