
import java.util.*;
public class HashMap1 {
	public static void main(String[] args){
	
		HashMap<Character, String> map = new HashMap<>();
		map.put('a',"a");
		map.put('b',"b");
		map.put('c',"c");
		map.put('d',"a**2");
		map.put('e',"b**2");
		map.put('f',"c**2");
		map.put('g',"a+b");
		map.put('h',"c+b");
		map.put('i',"a+c");
		map.put('j',"a**2-b**2");
		map.put('k',"b**2-a**2");
		map.put('l',"c**2-a**2");
		map.put('m',"a*b");
		map.put('n',"b*c");
		map.put('o',"c*a");
		map.put('p',"a**2+b**2");
		map.put('q',"b**2+a**2");
		map.put('r',"c**2+a**2");
		map.put('s',"a*b*c");
		map.put('t',"a*b*c");
		map.put('u',"a*b*c");
		map.put('v',"a**3");
		map.put('w',"b**3");
		map.put('a',"c**3");
		map.put('b',"a**3+b**3+c**3");
		map.put('c',"a**4");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter message:- ");
        String s1 = sc.nextLine();
        String f = "";
		for (int i = 0; i < s1.length()-1; i++) {
            f+=map.get(s1.charAt(i))+"+";
        }f+=map.get(s1.charAt(s1.length()-1));
        System.out.println("Final polynomial:- ");
        System.out.println(f);
	}
}
