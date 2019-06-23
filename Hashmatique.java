import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashmatique {


    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Hey Jude", "Hey Jude, don't make it bad \n" 
                    + "Take a sad song and make it better \n" 
                    + "Remember to let her into your heart \n"
                    + "Then you can start to make it better");
        trackList.put("Here Comes the Sun", "Here comes the sun (doo doo doo) \n"
                                            + "Here comes the sun, and I say \n"
                                            + "It's all right");
        trackList.put("Let It Be", "When I find myself in times of trouble, Mother Mary comes to me \n"
                                    + "Speaking words of wisdom, let it be \n"
                                    + "And in my hour of darkness she is standing right in front of me \n"
                                    + "Speaking words of wisdom, let it be");
        trackList.put("Yellow Submarine", "In the town where I was born \n"
                                          + "Lived a man who sailed to sea \n"
                                          + "And he told us of his life \n"
                                          + "In the land of submarines \n"
                                          + "So we sailed up to the sun \n"
                                          + "'Til we found a sea of green \n"
                                          + "And we lived beneath the waves \n"
                                          + "In our yellow submarine");  
        
        System.out.println(trackList.get("Let It Be") + "\n");
        Set<String> keys = trackList.keySet();
        for(String songNames : keys) {
            System.out.print(songNames + ": ");
            System.out.println(trackList.get(songNames) + "\n");
        }
    }
}