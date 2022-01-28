package Microsoft;
import java.util.*;

public class GenerateBinaryNo {
	static ArrayList<String> generate(int N)
    {
        ArrayList<String> a = new ArrayList<String>();
        for(int i=1;i<=N;i++){
            a.add(Integer.toBinaryString(i));
        }
        return a;
    }
}
