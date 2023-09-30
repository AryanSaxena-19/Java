package Java.study;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
class Code implements Comparable<Code>{
    private  String sectionNo;
    private  String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo()+o.getLectureNo();
        return code1.compareTo(code2);
    }
}
public class Main {
    public static void main(String[] args) {

        Map<Code, String> lectures = new HashMap<>();
        lectures.put(new Code("S01","L05"), "Rahul");
        lectures.put(new Code("S01","L02"), "Aryan");
        lectures.put(new Code("S02","L03"), "Rohit");
        lectures.put(new Code("S01","L02"), "Saumya");
        lectures.put(new Code("S01","L04"), "Mohit");
        lectures.put(new Code("S01","L06"), "Mayank");

        for(Map.Entry<Code, String> entry: lectures.entrySet()){
            System.out.println("Key: "+entry.getKey()+" Value:"+entry.getValue());
        }
    }
}