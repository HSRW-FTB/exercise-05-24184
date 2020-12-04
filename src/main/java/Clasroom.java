


public class Classroom {
    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;

    private Classroom(){}

    public Classroom (Course course, String room){


    }

    public Classroom (Course course, String room, java.util.Date Date){


    }

    public Course getCourse(){
        return course;
    }

    public String getRoom(){
        return room;
    }

    public void setRoom(String room){
        this.room = room;
    }
    
    public String getTerm(){
        return term;
    }

    public void addStudent(Student student ){

        participants = new Student[100];
        int i;

        for (i=0; i<100; i++ ){

        participants[i] = student;
        
        }


    }
}
