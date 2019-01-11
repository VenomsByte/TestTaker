


package examportal;

public class ExamReport {
    private String FirstName;
    private int UserId;
    private String examDate;
    private String subject;
    private String level;
    private int numberOfQuestions;
    private int attempted;
    private int correct;
    private double score;

    public int getUserID()
    {
        return UserId;
    }
    public void setUserID()
    {
        this.UserId=UserId;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getAttempted() {
        return attempted;
    }

    public void setAttempted(int attempted) {
        this.attempted = attempted;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public double getScore() {
        return ((correct*100.0)/numberOfQuestions);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setStudentName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
