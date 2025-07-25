package day6;

interface Camera {
 void takePhoto();
 void recordVideo();
}
interface GPS {
 void locate();
}

interface MediaPlayer {
 void playMusic();
 void stopMusic();
}

class SmartPhone implements Camera, GPS, MediaPlayer {


 public void takePhoto() {
     System.out.println("Photo captured using SmartPhone camera.");
 }

 public void recordVideo() {
     System.out.println("Recording video in 1080p HD.");
 }

 
 public void locate() {
     System.out.println("Current location: Hyderabad, India.");
 }

 // Implementing MediaPlayer methods
 public void playMusic() {
     System.out.println("Playing music...");
 }

 public void stopMusic() {
     System.out.println("Music stopped.");
 }
}

public class MultipleInterfaceExample {
 public static void main(String[] args) {
     SmartPhone myPhone = new SmartPhone();

     myPhone.takePhoto();
     myPhone.recordVideo();

     
     myPhone.locate();

     myPhone.playMusic();
     myPhone.stopMusic();
 }
}
