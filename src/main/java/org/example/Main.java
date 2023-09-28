package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MediaController mediaController1 = new MediaController();
        VideoPlayer videoPlayer1 = new VideoPlayer();
        MusicPlayer musicPlayer1 = new MusicPlayer();

        mediaController1.playMedia(videoPlayer1);
        mediaController1.playMedia(musicPlayer1);
    }
}