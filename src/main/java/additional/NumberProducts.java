package additional;

public class NumberProducts {
    public static Integer numberProducts(String s)
    {
        String s1="";
        int m=0;
        while(!s.substring(m,m+1).equals(" ")) {
            s1 = s1+s.substring(m,m+1);
//            System.out.println(s1);
            m++;
        }
        Integer k= Integer.parseInt(s1);
        return k;
    }
}
