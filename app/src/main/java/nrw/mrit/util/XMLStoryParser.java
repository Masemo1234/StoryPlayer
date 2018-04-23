package nrw.mrit.util;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.nio.file.Path;

public class XMLStoryParser {

    private XmlPullParserFactory xmlFactoryObject;
    private XmlPullParser myparser;
    private Path path;

    public XMLStoryParser(Path path) throws XmlPullParserException {

        this.path=path;
        xmlFactoryObject = XmlPullParserFactory.newInstance();
        myparser = xmlFactoryObject.newPullParser();


    }


    //TODO parsing


}
