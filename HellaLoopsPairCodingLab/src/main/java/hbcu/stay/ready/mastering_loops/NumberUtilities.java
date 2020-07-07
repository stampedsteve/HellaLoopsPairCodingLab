package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getOddNumbers(int start, int stop) {
        /*Given two integers, start, and stop, return a String concatenation of 
        all even integers between start up to and not including stop
       */
        String result = "";
        for(Integer i=stop;i>=start;i--){
            if(i % 2 != 0){
                Integer storage = i;
                result = storage.toString() + result;
            }
            
        }
        return result;
    }


    public static String getEvenNumbers(int start, int stop) {
     /*Given two integers, start, and stop, return a String concatenation of 
        all even integers between start up to and not including stop
       */
      String result = "";
      for(Integer i=stop-1;i>start;i--){
          if(i % 2 == 0){
              Integer storage = i;
              result = storage.toString() + result;
          }
          
      }
      return result;


        
    }


    public static String getSquareNumbers(int start, int stop, int step) {
       int number;
       Integer square;
       String result = "";
       // int number;
       // int square = number * number;
       for(Integer i=start; i<stop;i+=step){
        number = i;
        square = number * number;
        result += square.toString();
        }
       
        return result;
    }

    public static String getRange(int start) {
        String result = "";
        for(Integer i=0;i<start;i++){
            result += i.toString();
        }
        return result;
    }

    public static String getRange(int start, int stop) {
       String result ="";
        for (Integer i=start; i<stop;i++)
        {
            result+= i.toString();
        }

       
       
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result="";
        for(Integer i=start; i<stop;i+=step){
            result+=i.toString();
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = " ";
        double powerResult; 
        int startValue;
        int conversion;
        for(int i=start;i<stop;i+=step){
            startValue = i;
            powerResult = Math.pow(startValue, exponent);
            conversion = (int)powerResult;
            result += String.valueOf(conversion);


        }
        return result.trim();
    }
}