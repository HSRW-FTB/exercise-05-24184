import java.util.Date;
public class Student extends User{
    Domain domain = Domain.STUDENT;
    private static int idGen = 10000;
    private Course studycourse;

    private Student(){
        Integer.toString(idGen);
        idGen++;
    }
    public Student(String newFirstname, String newLastname){
        super(Integer.toString(idGen), Domain.STUDENT, newFirstname, newLastname);
        idGen++;
    }
    public Student(String newFirstname, String newLastname, Date newBirthdate){
        super(Integer.toString(idGen), Domain.STUDENT, newFirstname, newLastname, newBirthdate);
        idGen++;
    }

    public Course getStudyCourse(){
        return studycourse;
    }
    public void setStudyCourse(Course newStudycourse){
        studycourse = newStudycourse;
    }

    public String getStudyCourseDescription(){
        switch (studycourse){
            case ME: return "Mechanical Engineering, B.Sc.";
            case MSE: return "Mechatronic Systems Engineering, B.Sc."; 
            case EL: return "Electrical Engineering, B.Sc."; 
            case IE: return "Industrial Engineering, B.Sc."; 
            case BMS: return "Biomaterial Science, B.Sc."; 
            case SCB: return "Science Communication & Bionics, B.Sc."; 
            case MME: return "Mechanical Engineering, M.Sc."; 
            case MBB: return "Bionics, B.Sc.";
            default: return "Study Course";
        }
    }
    public void setStudyCourse(String newStdCourse){
        switch (newStdCourse) {
            case "ME": studycourse = Course.ME; break;
            case "MSE": studycourse = Course.MSE; break;
            case "EL": studycourse = Course.EL; break;
            case "IE": studycourse = Course.IE; break;
            case "BMS": studycourse = Course.BMS; break;
            case "SCB": studycourse = Course.SCB; break;
            case "MME": studycourse = Course.MME; break;
            case "MBB": studycourse = Course.MBB; break;
            default:
        }
    }
}
