import java.util.*;
class TwelveDays 
{
     static List<String> list=new ArrayList<String>();
    static
    {
        list.add("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.");
     list.add("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     list.add("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
     }
    String verse(int verseNumber) 
    {
      if(verseNumber>=1 &&verseNumber<=12)
      {
      String TwelveDays=list.get(verseNumber-1)+"\n";
      return TwelveDays;
      }
       return ""; 
    }

    String verses(int startVerse, int endVerse) 
    {
        String lyric="";
      for(int start=startVerse;start<endVerse;start++)
        {
              if(start>=1 &&start<=12)
                  lyric+=verse(start)+"\n";
        }
        if(endVerse>=1 &&endVerse<=12)
                  lyric+=verse(endVerse);
        return lyric;
    }
    
    String sing() {
      return verses(1,12);
    }
}
