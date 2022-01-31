package Adobe;

public class AmendTheSentence {
	public String amendSentence(String s){
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLowerCase(c)){
                sb.append(c);
            } else if (Character.isUpperCase(c)){
                sb.append(" ");
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString().trim();
    }
}
