package Adobe;

public class ImplementATOI {
	int atoi(String str) {
    	if (!isValidNumber(str)) {
    	    return -1;
    	}
    	int mult = 1;
    	int val = 0;
    	for(int i = str.length()-1; i >= 1; i--) {
    	    val += mult * (str.charAt(i) - '0');
            mult *= 10;
    	}
    	if (str.charAt(0) == '-') {
    	    return -val;
    	}
    	val += mult * (str.charAt(0) - '0');
    	return val;
    }
    
    boolean isValidNumber(String s) {
        for(int i = 1; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        if (!(s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
            if (s.charAt(0) != '-') {
                return false;
            }
        }
        return true;
    }
}
