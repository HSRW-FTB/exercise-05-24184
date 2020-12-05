
import java.util.Date;

public class Professor extends User{
    Domain domain = Domain.STAFF;
    private Faculty faculty = Faculty.TUB;
    private Campus campus = Campus.KLE;
    private int phone = 0;


    private Professor(){}

    public Professor (String id, String firstname, String lastname){

        super(id, Domain.STAFF, firstname, lastname);


    }

    public Professor (String id, String firstname, String lastname, Date birthdate){

        super(id, Domain.STAFF, firstname, lastname, birthdate);





    }

    public void setFaculty(Faculty faculty){
        this.faculty = faculty;

        if (faculty == Faculty.TUB || faculty == Faculty.LS || faculty == Faculty.GO){

            campus = Campus.KLE;
        }

        else {
            campus = Campus.KL;
        }



    }

    public Faculty getFaculty(){
        return faculty;
    }

    public String getFacultyString(){
        switch (faculty){
        
            case TUB: return "Technology and Bionics"; 
            case LS: return "Life Sciences"; 
            case GO: return "Society and Economics"; 
            case KU: return "Communication and Environment";
            default: return "Faculty";
        }

    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public String getPhone(){

        switch (campus){
                
            case KLE: return "+49 2821 806 73" + phone;
            case KL: return "+49 2842 908" + phone;
            default: return "Phone Number:";

    }

        


    }



}
