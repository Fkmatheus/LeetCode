package exe;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([])"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("["));
		System.out.println(isValid("(("));
		System.out.println(isValid(""));
		System.out.println(isValid("]"));

	}
	
	public static boolean isValid(String s) {
        List<Character> pilha = new ArrayList<>();
		
		int contador = 0;
		char alvo;
		
		while (contador < s.length()) {
			
			alvo = s.charAt(contador);
			
			if (alvo == '(' || alvo == '[' || alvo == '{') {
				pilha.add(alvo);
			}
			
			if (pilha.isEmpty()) return false;
			
			if (alvo == ')') {
				if (!(pilha.get(pilha.size() - 1) == '(')) {
					return false;
				}
				
				else {
					pilha.remove(pilha.size() - 1);
				}
			}
			
			if (alvo == ']') {
				if (!(pilha.get(pilha.size() - 1) == '[')) {
					return false;
				}
				
				else {
					pilha.remove(pilha.size() - 1);
				}
			}
			
			if (alvo == '}') {
				if (!(pilha.get(pilha.size() - 1) == '{')) {
					return false;
				}
				
				else {
					pilha.remove(pilha.size() - 1);
				}
				
				
			}
			
			contador++;
		}
		
		if (pilha.size() == 0) {
			return true;
		}
		
		else {
			return false;
		}
    }

}
