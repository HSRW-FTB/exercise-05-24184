import java.util.Date;
import java.util.*;

public class Classroom {
    
    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;

    private Classroom(){}
    
    public Classroom(Course course, String room){
        
        this.course = course;
        this.room = room;
    }
    
    
    public Classroom(Course course, String room, Date date){
        this.course = course;
        this.room = room;
    }
    

    public Course getCourse(){
        
        return course;
    }
    
    public String getRoom(){
        return room;
    }
    public void setRoom(String theRoom){
        this.room = room;
    }

    public String getTerm(){
        
        Calendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        if(month > 2 && month < 10)
        {
            term = "SS" + year;
            return term;
        }
        else
        {
            term = "WS" + year + "/" + ((year % 2000) + 1);
            return term;
        }
    }

    public String getID(){
        return id;
    }

    public void addStudent(Student student){
        
            for (int i = 0; i < 100; i++){
                participants = new Student[100];
                participants[i] = student;
            }
    
        }
    public String getParticipantsEmail(){
        int i = 0;
        if (i < participants.length){
            i++;
            //String studentid = Arrays.toString(participants);
            
        }
        return "";
        
    }

    public int getTotalPaticipants(){
        
        return 1506990209;
    }
}
