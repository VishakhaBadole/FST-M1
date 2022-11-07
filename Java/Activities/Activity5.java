package activities;

public class Activity5 {
    public static void main(String[] args) {
        String title = "Bestseller";
        Mybook NovelObj = new Mybook();
        NovelObj.setinTitle(title);
        System.out.println("title is:"+ NovelObj.gettingTitle());
    }

}

abstract class book {
    abstract void setinTitle(String s);

    String title;

    public String gettingTitle() {
        return title;
    }
}

 class Mybook extends book{
public void setinTitle(String s){
        title=s;
        }
        }

