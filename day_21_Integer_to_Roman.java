public class day_21_Integer_to_Roman {
    public static void main(String[] args) {
      System.out.println(intToRoman(1994));  
    }
    public static String intToRoman(int num) {
        String ans = "";
        String[] ones= {"","I","II","III","IV","V","VI","VII","VIII","IX"};        
        String[] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands= {"","M","MM","MMM"};
        ans = thousands[num/1000]  + hundreds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
        return ans;
    }
}
