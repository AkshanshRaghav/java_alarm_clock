import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filepath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filepath= filepath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
         while (LocalTime.now().isBefore(alarmTime)){
             try {
                 Thread.sleep(1000);
                 int hours = LocalTime.now().getHour();
                 int minutes = LocalTime.now().getMinute();
                 System.out.printf("\r%02d:%02d",hours,minutes);
             } catch (InterruptedException e) {
                 System.out.println("Thread has been interrupted");
             }
         }
        System.out.println("\nALARM RINGING");
        PlaySound(filepath);
    }
    private void PlaySound(String filepath) {
         File file = new File(filepath);
         try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
             Clip clip = AudioSystem.getClip();
             clip.open(audioStream);
             clip.start();
             System.out.println("press enter to stop the alarm");
             scanner.nextLine();
             clip.close();
             scanner.close();
         }
         catch (IOException e){
             System.out.println("Something went wrong");
         }
         catch (UnsupportedAudioFileException e){
             System.out.println("audio file is not supportive");
         }
         catch (LineUnavailableException e){
             System.out.println("audio is unavailable");
         }


    }
}
