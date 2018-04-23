package nrw.mrit.util;

import java.util.Vector;

public class StoryElement {

    private String title;
    private String buttonText;
    private Object content;
    private Vector<StoryElement> linkedElements;

    public StoryElement(String Title, String buttonText){

        this.title=Title;
        this.buttonText=buttonText;
        linkedElements=new Vector<StoryElement>();

    }


    public void addStoryElement(StoryElement e) {
        linkedElements.add(e);
    }



}
