package Feb_01_2024_Test;


class Audio{
    public void playMedia(String filePath, int volume, Float equliser ){
        System.out.println("FilePath "+filePath);
    
        System.out.println("Volume Level: "+volume);

        System.out.println("Possibly Equalizer Settings :"+equliser);
    }


    public void playMedia(String filePath, Float speed, int volume){
        System.out.println("Vedio File Path : "+filePath);

        System.out.println("Playback speed "+speed);

        System.out.println("Audio Setting "+volume);
    }
    


    public void playMedia(int quality,int details ){
        System.out.println("Quality setting "+quality);

        System.out.println("Potentially authention details"+ details);
    }

}
public class Question_2
{
    public static void main(String[] args)
    {
        Audio a1 = new Audio();
        a1.playMedia("Song",10,(float)50.0);
        
        a1.playMedia("Vedio",(float)1.5,15);
        
        a1.playMedia(720, 15);
    }
}