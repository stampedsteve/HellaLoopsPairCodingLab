package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        int count = 0;
        for(int i=1;i<6;i++){
            int firstMul = i;
            if(count % 5 == 0 && count != 0){
                result+="\n";
            }
            for(int d = 1; d<6; d++){
                int secondMul = d;
              Integer product= firstMul * secondMul;
        
              result += String.format("%4s|", product.toString() + " ");;
              count += 1;
                //String.format("My answer is %15.8f", 47.65734);
                //String.format("| %4.8f", product + "|");
            }
        }
        return result += "\n";
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        int count = 0;
        for(int i=1;i<11;i++){
            int firstMul = i;
            if(count % 5 == 0 && count != 0){
                result+="\n";
            }
            for(int d = 1; d<11; d++){
                int secondMul = d;
              Integer product= firstMul * secondMul;
        
              result += String.format("%4s|", product.toString() + " ");;
              count += 1;
                //String.format("My answer is %15.8f", 47.65734);
                //String.format("| %4.8f", product + "|");
            }
        }
        return result += "\n";
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        int count = 0;
        for(int i=1;i<tableSize+1;i++){
            int firstMul = i;
            if(count % 5 == 0 && count != 0){
                result+="\n";
            }
            for(int d = 1; d<tableSize+1; d++){
                int secondMul = d;
              Integer product= firstMul * secondMul;
        
              result += String.format("%4s|", product.toString() + " ");;
              count += 1;
                //String.format("My answer is %15.8f", 47.65734);
                //String.format("| %4.8f", product + "|");
            }
        }
        return result += "\n";
    }
}
