public class Main {
    public static void main(String[] args) {
        var musicPlayer = new MusicPlayer() {
            
            @Override
            public void playMusic() {
                System.out.println("Tocando a musica");
            }
            @Override
            public void pauseMusic() {
                System.out.println("Pausando a musica");
                
            }
            public void stopMusic() {
                System.out.println("Parando a musica");

            }
        };
        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        musicPlayer.stopMusic();
    }
}
