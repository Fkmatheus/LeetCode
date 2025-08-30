package exe;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs =  new String[3];
		
		strs[0] = "c";
		strs[1] = "acc";
		strs[2] = "ccc";
		
		
		System.out.println(longestCommonPrefix(strs));

	}
	
	public static String longestCommonPrefix(String[] strs) {
        
		String prefixo = "";
		String prefixoAntigo = "";
		int inicioPrefixo = 0;
		int fimPrefixo = 0;
		
		boolean primeiroLoop = true;
		
		int sucessos = 0;
		
		if (strs.length == 1) {
			return strs[0];
		}
		
		
		while (fimPrefixo <= strs[0].length()) {
			sucessos = 0;
			
			prefixo = strs[0].substring(inicioPrefixo,fimPrefixo);
				
			for (String s : strs) {
				if (!s.startsWith(prefixo)) {
					break;
				}
					
				else {
					sucessos++;
				}
	
				}
				
			if (sucessos < strs.length && primeiroLoop) {
				System.out.println(strs.length);
				return "";
			}
			
			if (sucessos < strs.length && !primeiroLoop) {
				return prefixoAntigo;
			}
				
			if (sucessos == strs.length) {
				primeiroLoop = false;
				prefixoAntigo = prefixo;
				fimPrefixo++;
				
			}
			
		}
		
		return prefixo;
		
			
	}
		
		
  }


