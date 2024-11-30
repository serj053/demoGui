package training;

import java.security.PrivilegedAction;

public class Lambda {
    public static void main(String[] args) {
        SimpleInt p1 ;
        p1 = ()-> 1756.0;
        SimpleInt p;
        p = () -> 3.14;

        WithParam s2 = (str)-> {
            String revers = "";
            for(int i=str.length() -1 ; i>=0; i--){
                revers += str.charAt(i);
            }
            return revers;
        };

        System.out.println(s2.str("try"));
    }
}
