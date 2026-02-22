public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade(){
        if (this.size > 0){
            int lastGrade = this.grades[this.size];
            return lastGrade;
        }else {
            System.out.println("Student has no grades yet.");
        }
        return lastGrade();
    }

    public double calculateAvg(){
        if (this.size > 0){
            int sum = 0;
            for (int n = 0; n<this.size; n++){
            sum += this.grades[n];
            double average = sum / this.size;
            return average;
            }
        }else {
            System.out.println("Student has no grades yet, no average available.");
        }
        return calculateAvg();
    }
}