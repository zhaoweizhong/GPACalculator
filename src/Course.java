public class Course {
    private String courseName;
    private float credit;
    private float score;

    public Course(String courseName, float credit, float score) {
        this.courseName = courseName;
        this.credit = credit;
        this.score = score;
    }

    public float getCreditScore() {
        if (score < 60) {
            return 0;
        } else if (score > 100) {
            return 0;
        } else {
            float courseGPA = 4 - 3 * (100 - score) * (100 - score) / 1600;
            return courseGPA * credit;
        }
    }

    public float getCredit() {
        return credit;
    }
}
