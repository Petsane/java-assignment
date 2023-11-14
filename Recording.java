import java.util.Scanner;
public class Recording {

    private String title;
    private String artist;
    private int playingTime; // in seconds

    // Constructor
    public Recording(String title, String artist, int playingTime) {
        this.title = title;
        this.artist = artist;
        this.playingTime = playingTime;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    // Sorting methods
    public static void sortByTitle(Recording[] recordings) {
        for (int i = 0; i < recordings.length - 1; i++) {
            for (int j = 0; j < recordings.length - i - 1; j++) {
                if (recordings[j].getTitle().compareTo(recordings[j + 1].getTitle()) > 0) {
                    swap(recordings, j, j + 1);
                }
            }
        }
    }

    public static void sortByArtist(Recording[] recordings) {
        for (int i = 0; i < recordings.length - 1; i++) {
            for (int j = 0; j < recordings.length - i - 1; j++) {
                if (recordings[j].getArtist().compareTo(recordings[j + 1].getArtist()) > 0) {
                    swap(recordings, j, j + 1);
                }
            }
        }
    }

    public static void sortByPlayingTime(Recording[] recordings) {
        for (int i = 0; i < recordings.length - 1; i++) {
            for (int j = 0; j < recordings.length - i - 1; j++) {
                if (recordings[j].getPlayingTime() > recordings[j + 1].getPlayingTime()) {
                    swap(recordings, j, j + 1);
                }
            }
        }
    }

    private static void swap(Recording[] array, int i, int j) {
        Recording temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Methods for user input
    public static Recording userInputRecording() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Artist: ");
        String artist = scanner.nextLine();
        System.out.print("Playing Time (in seconds): ");
        int playingTime = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        return new Recording(title, artist, playingTime);
    }

}
