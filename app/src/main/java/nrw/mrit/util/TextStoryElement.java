package nrw.mrit.util;

public class TextStoryElement extends StoryElement {


    private String content;

    public TextStoryElement(String title, String buttonText, String content){
        super(title,buttonText);
        this.content=content;
    }

    public String getContent(){
        return content;
    }


}
