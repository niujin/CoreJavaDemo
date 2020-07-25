import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        LinkedList<Tag> tagStack = new LinkedList<>();
        while(testCases>0){
            String line = in.nextLine();
            Pattern p = Pattern.compile("<.+?>");
            Matcher m = p.matcher(line);
            boolean isfind=false;
            while(m.find()){
                String rawTag = m.group();
                if(rawTag.charAt(1)!='/'){
                    Tag startingTag = new Tag(TagType.Start, rawTag.substring(1, rawTag.length()-1),m.end());
                    Tag previousTag = tagStack.peek();
                    if(previousTag!=null){
                        previousTag.setHasNest(true);
                    }
                    tagStack.push(startingTag);
                }else{
                    Tag endingTag = new Tag(TagType.Close, rawTag.substring(2,rawTag.length()-1), m.start());
                    Tag startingTag = tagStack.pop();
                    if(startingTag!=null&&!startingTag.getName().equals("")){
                        if(startingTag.getName().equals(endingTag.getName())&&!startingTag.isHasNest()){
                            if(startingTag.getPosition()!=endingTag.getPosition()){
                                isfind=true;
                                System.out.println(line.substring(startingTag.getPosition(),endingTag.getPosition()));
                            }
                        }
                    }
                }

            }
            if(!isfind){
                System.out.println("None");
            }
            //Write your code here


            testCases--;
        }
    }
}

enum TagType{
    Start, Close;
}
class Tag{
    TagType type;
    String name;
    int position;
    boolean hasNest;
    public Tag(TagType type, String name, int position){
        this.type = type;
        this.name = name;
        this.position = position;
    }
    public TagType getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    public void setHasNest(boolean hasNest){
        this.hasNest = hasNest;
    }

    public boolean isHasNest(){
        return this.hasNest;
    }


}

