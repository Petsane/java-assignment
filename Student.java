public class Student {
    // Attributes
    private String name;
    private int[] grades;
    
    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new int[0]; // Initialize an empty grades array
    }
    
    // Method to add a grade to the student's grades array
    public void addGrade(int grade) {
        // Create a new array with increased size to accommodate the new grade
        int[] newGrades = new int[grades.length + 1];
        
        // Copy existing grades to the new array
        System.arraycopy(grades, 0, newGrades, 0, grades.length);
        
        // Add the new grade to the end of the array
        newGrades[grades.length] = grade;
        
        // Update the grades array
        grades = newGrades;
    }
    
    // Method to calculate the average grade of the student
    public double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0; // Return 0 if no grades are available to avoid division by zero
        }
        
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        
        // Calculate the average grade
        return (double) sum / grades.length;
    }
    
    // Method to get the grade status of the student
    public String getGradeStatus() {
        double averageGrade = calculateAverageGrade();
        
        // Determine the grade status
        if (averageGrade >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    
    public void questionOnePointOne(){
        // 1.1 Create an object of the Student class with the name "John" and add grades
        Student john = new Student("John");
        john.addGrade(80);
        john.addGrade(75);
        john.addGrade(90);
        john.addGrade(85);

        // Display the student's information
        System.out.println("Student: " + john.name);
        System.out.println("Grades: " + java.util.Arrays.toString(john.grades));
        System.out.println("Average Grade: " + john.calculateAverageGrade());
        System.out.println("Grade Status: " + john.getGradeStatus());
    }
    
    public void questionOnePointTwo(){
        
        // 1.1 Create an object of the Student class with the name "John" and add grades
        Student john = new Student("John");
        john.addGrade(80);
        john.addGrade(75);
        john.addGrade(90);
        john.addGrade(85);

        // 1.2 Calculate the total grade points earned by the student
        int totalGradePoints = 0;
        for (int grade : john.grades) {
            totalGradePoints += grade;
        }
        System.out.println("Total Grade Points: " + totalGradePoints);

    }
    
    public void questionOnePointThree(){

        // 1.3 Count the number of occurrences of the letter 'l' in the string
        String text = "Hello, World!";
        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == 'l') {
                count++;
            }
        }

        System.out.println("Number of occurrences of 'l' in "+ text +": " + count);

    }
    
    public void questionOnePointFour(){

        // 1.4 Create an array called numbers that stores the integers 5, 10, 15, 20, and 25
        int[] numbers = {5, 10, 15, 20, 25};

        // Write a loop to calculate the sum of the numbers in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The sum of {5, 10, 15, 20, 25}: " + sum);
    }
    
}
