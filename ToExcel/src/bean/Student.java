package bean;

/**
 * @author Green写代码
 * @date 2022-11-19 11:21
 */
public class Student {
    protected int id;
    protected String classes;
    protected String card;
    protected String name;
    protected String gender;
    protected int score;

    public Student(String classes, String card, String name, String gender, int score) {
        this.classes = classes;
        this.card = card;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", card='" + card + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }
}
