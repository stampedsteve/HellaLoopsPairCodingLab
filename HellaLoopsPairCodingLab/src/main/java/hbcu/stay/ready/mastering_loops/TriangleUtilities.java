package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    
    public static String getTriangle(int numberOfRows) {
        StringBuilder newStr = new StringBuilder();
        for(int i=1; i<numberOfRows; i++){
            String star = "*";
            newStr.append(star.repeat(i));
            newStr.append("\n");    
        }
        return newStr.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder newStr = new StringBuilder();
            String star = "*";
            newStr.append(star.repeat(numberOfStars));  
            return newStr.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder newStr = new StringBuilder();
        for(int i=1; i<5; i++){
            String star = "*";
            newStr.append(star.repeat(i));
            newStr.append("\n");    
        }
        return newStr.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder newStr = new StringBuilder();
        for(int i=1; i<10; i++){
            String star = "*";
            newStr.append(star.repeat(i));
            newStr.append("\n");    
        }
        return newStr.toString();
    }
}
