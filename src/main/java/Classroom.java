import java.util.Date;
import java.util.*;
public class Classroom {
    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;

    private Classroom(){}

    public Classroom(Course newCourse, String theRoom){
        course = newCourse;
        room = theRoom;
    }
    public Classroom(Course newCourse, String theRoom, Date date){
        course = newCourse;
        room = theRoom;
    }

    public Course getCourse(){
        return course;
    }
    
    public String getRoom(){
        return room;
    }
    public void setRoom(String theRoom){
        room = theRoom;
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

        id = this.course.getID();
        term = this.getTerm();
        return id + "-" + term;
    }

    public void addStudent(Student student){

        participants = new Student[4];
        
        for (int i = 0; i < 4; i++){
            
            participants[i] = student;
        }

    }
        public String getParticipantsEmail()
        {
          
         // String str = "email";
          String email = "";
          String str = ",";
               
            
            for(int i = 0; i<4;i++){
            
            
            email = participants[i].getFQUN();
            
          
                   
                                                        
            }

            //return str;
            return email + str;
                                                        
        }

    public int getTotalPaticipants(){
        return participants.length;
    }
}
