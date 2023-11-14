import java.util.Scanner;

public class QuestionTwo {

    public void questionTwoPointTwo(){

        Scanner scanner = new Scanner(System.in);

        // Create an array of Recording objects
        System.out.println("\nQuestion 2.1 is a class model in Recording.java file");
        System.out.println("\nQuestion 2.2");
        Recording[] recordings = new Recording[2];

        // Prompt the user to input data for each Recording
        for (int i = 0; i < recordings.length; i++) {
            System.out.println("\nEnter details for Recording " + (i + 1));
            recordings[i] = Recording.userInputRecording();
        }

        // Prompt the user to specify the sorting field
        System.out.print("\nSort Recordings by (title/artist/playing time): ");
        String sortField = scanner.nextLine().toLowerCase();

        // Use the appropriate sorting method based on user input
        switch (sortField) {
            case "title":
                Recording.sortByTitle(recordings);
                break;
            case "artist":
                Recording.sortByArtist(recordings);
                break;
            case "playing time":
                Recording.sortByPlayingTime(recordings);
                break;
            default:
                System.out.println("Invalid sorting field.");
                return;
        }

        // Display the sorted Recordings
        System.out.println("\nSorted Recordings:");
        for (Recording recording : recordings) {
            System.out.println("Title: " + recording.getTitle() +
                    ", Artist: " + recording.getArtist() +
                    ", Playing Time: " + recording.getPlayingTime() + " seconds");
        }
        System.out.print("\n");
    }
}
