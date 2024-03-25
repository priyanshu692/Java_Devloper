package Interface;

public class Interface2 {
    public static void main(String[] args) {
        smartphone phone1 = new smartphone();
        phone1.videocall();
        phone1.click();
        phone1.record();
    }
}
class  phone{
    void call(){
        System.out.println("make a call");
    }
    void sms(){
        System.out.println("write a sms");
    }

}
interface  camera{
    void click();
    void record();

}
interface  musicPlayer{
    void play();
    void pause();
    void stop();

}
class smartphone extends phone implements camera, musicPlayer{
   public  void videocall(){
       System.out.println("videocall in smartphone");
   }
   public void record(){
       System.out.println("record a video");
   }
   public void click(){
       System.out.println("click a photo");
   }
    public void play(){

    }
    public void pause(){

    }
    public void stop(){

    }
}