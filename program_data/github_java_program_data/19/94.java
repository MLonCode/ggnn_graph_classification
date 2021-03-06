import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class KnuthMorrisPratt {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
       
    // Find all the occurrences of the pattern in the text and return
    // a list of all positions in the text (starting from 0) where
    // the pattern starts in the text.
    public List<Integer> findPattern(String pattern, String text) {
        ArrayList<Integer> result = new ArrayList<Integer>(text.length()/pattern.length());
        // Implement this function yourself
        String ppt = pattern + '$';
        int border = 0;
        int s[] = new int[pattern.length()];
         
        for(int i = 1; i < pattern.length(); i++)
        {
           if(pattern.charAt(i) == pattern.charAt(border))
               border++;
           else
           {
               while(border > 0)
               {
                   border = s[border - 1];
                   if(pattern.charAt(i) == pattern.charAt(border))
                   {
                       border++;
                       break;
                   }  
               }
           }
           
           s[i] = border;
        }
        
        border = 0;
       
        for(int i = 0; i < text.length(); i++)
        {
            if(border == pattern.length())
                result.add(i-pattern.length());
            
            if(text.charAt(i) == ppt.charAt(border))
                border++;
            else
            {    
                while(border > 0)
               {
                   border = s[border - 1];
                   if(text.charAt(i) == pattern.charAt(border))
                   {
                       border++;
                       break;
                   }  
               }
            }
        }
        if(border == pattern.length())
                result.add(text.length()-pattern.length());
        //System.out.println(Arrays.toString(s));
            
        return result;
    }
    
    static public void main(String[] args) throws IOException {
        new KnuthMorrisPratt().run();
    }

    public void print(List<Integer> x) {
        for (int a : x) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void run() throws IOException {
        FastScanner scanner = new FastScanner();
        String pattern = scanner.next();
        String text = scanner.next();
        List<Integer> positions = findPattern(pattern, text);
        print(positions);
    }
}
