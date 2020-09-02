import java.util.*;

public class printNTimes{

    private void nTimes(int n, String str){

        for(int i =0 ;i<n; i++){
            System.out.println(str);
        }

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int ntimes = scan.nextInt();
        System.out.print("Enter a String: ");
        String str = scan.next();

        printNTimes prt = new printNTimes();
        prt.nTimes(ntimes,str);

    }
}

search_queries =[
# 'iphone7 images',
# 'Eminem - Love The Way You Lie ft. Rihanna',
# 'Eminem - Till I Collapse album art',
# 'Fort Minor - Remember The Name album art',
# 'Imagine Dragons - Believer album art',
# 'Imran Khan - Satisfya album art',
# 'Kehlani & G-Eazy - Good Life album art',
# 'Lean On album art',
# 'Let Me Love You ft. Justin Bieber album art',
# 'Sam Tinnesz - Legends Are Made album art',
# 'The Script - Hall of Fame album art',
# 'Sia - Unstoppable (Divergent FMV) album art',
# 'Tokyo Drift - Teriyaki Boyz album art',
# 'Wiz Khalifa - See You Again album art',
# ]
# 