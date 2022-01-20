package i_GoldMan;

public class IV_encode {
	String encode(String str)
	{
          //Your code here
          String res = "";
          int count = 1;
          for(int i = 1; i<str.length(); i++){
              if(str.charAt(i) == str.charAt(i-1)){
                  count++;
              }
              else{
                  res += str.charAt(i-1);
                  res += count;
                  count = 1;
                  
              }
          }
          res += str.charAt(str.length()-1);
          res += count;
          return res;
	}
}
