
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String data = in.readLine();
        String [] a = data.split("[^A-Z0-9]");
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for (String i : a){
            if (i.length() > 1) {
                for (int j = 0; j < i.length()-1; j++) {
                    if(ans.length() < sb.length()) ans = sb.toString();
                    sb = new StringBuilder();
                    if(i.charAt(j) >= 'A' && i.charAt(j) <= 'Z' &&
                            i.charAt(j+1) >= '0' && i.charAt(j+1) <= '9'){
                        sb.append(i.charAt(j));
                        for (int k = j + 1; k < i.length(); k++) {
                            if(i.charAt(k) >= '0' && i.charAt(k) <= '9')
                                sb.append(i.charAt(k));
                            else break;
                        }

                    }
                }

            }
        }
        System.out.println(ans.length() < 1 ? "-1" : ans.length() + "\n" +
        ans);
    }
}
