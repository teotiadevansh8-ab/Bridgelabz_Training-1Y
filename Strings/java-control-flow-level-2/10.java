class StudentResult {
    public static void main(String[] args) {

        int[][] marks = {
            {70,80,90},
            {50,60,70},
            {30,40,50}
        };

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percent = total / 3.0;

            char grade;
            if (percent >= 80) grade = 'A';
            else if (percent >= 70) grade = 'B';
            else if (percent >= 60) grade = 'C';
            else if (percent >= 50) grade = 'D';
            else if (percent >= 40) grade = 'E';
            else grade = 'R';

            System.out.println(percent + "% Grade: " + grade);
        }
    }
}
