package Solution7_6_5;

public class Teacher extends People{

    String subject;

    public Teacher(String name, int age, String profession, String subject ) {
        super(name, age, profession);
        this.subject = subject;
    }

    @Override
    public String getName() {       //Следует обратить внимание, что принимаемые параметры остаются пустыми!
        return name;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getSubject(String subject) {return subject;} //add new methods

    public String giveALesson(String lesson) {return "The lesson was ended.";}
}
