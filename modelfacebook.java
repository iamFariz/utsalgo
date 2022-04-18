package Model;

import java.util.ArrayList;

public class modelfacebook {
    public String user;
    public String photo;
    public String caption;
    public int like = 0;
    public ArrayList komen = new ArrayList<>();
    public String share;

    public modelfacebook(){
    }
    public modelfacebook(String useracc, String photo,String captionPost, int likePost, ArrayList komenPost, String sharelink) {
    this.user= useracc;
    this.photo= photo;
    this.caption = captionPost;
    this.like= likePost;
    this.komen= komenPost;
    this.share= sharelink;
    }

    public void post(){
        System.out.println();
        System.out.println(this.user);
        System.out.println("-------------------");
        System.out.println(this.photo);
        System.out.println("-------------------");
        System.out.println(this.caption);
        System.out.println("[1]Like: " + this.like + "  [2]Comment: " + this.komen.size() + "  [4]Show Comment" + "  [5]Copy Link");
        System.out.println();
    }
    public void postingan(){
        System.out.println();
        System.out.println(this.user);
        System.out.println("-------------------");
        System.out.println(this.photo);
        System.out.println("-------------------");
        System.out.println(this.caption);
        System.out.println("[1]Like: " + this.like + "  [2]Comment: " + this.komen.size() + "  [3]Show Comment" + "  [4]Copy Link");
        System.out.println("[0]Pilih Postingan Lain");
        System.out.println();
    }

    public int likes(int suka){
        like = like + 1;
        return like;
    }

    public <ArrayList> ArrayList Comments(String komentar){
        for (int i = 0; i < 1; i++){
            komen.add(komentar);
        }
        return (ArrayList) komen;
    }

    public void showComment(){
        for (int i = 0; i < komen.size(); i++)
            System.out.println(komen.get(i));
    }

}
