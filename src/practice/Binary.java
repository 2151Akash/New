package practice;

public class Binary {
	
	
	    public int countBinarySubstrings(String s) {
	        int len = s.length();
	        int count = 0;
	        int zero = 0;
	        int one = 0;
	        int zeroCnt = 0;
	        int oneCnt = 0;
	        while (true) {
	            while (zero < len && s.charAt(zero) == '0') {
	                zero++;
	            }
	            zeroCnt = zero - one;
	            count += Math.min(zeroCnt, oneCnt);
	            if (zero == len) {
	                break;
	            }
	            oneCnt = 0;
	            one = zero;
	            while (one < len && s.charAt(one) == '1') {
	                one++;
	            }
	            oneCnt = one - zero;
	            count += Math.min(zeroCnt, oneCnt);
	            if (one == len) {
	                break;
	            }
	            zero = one;
	            zeroCnt = 0;
	        }
	        return count;
	    }
	}
	

