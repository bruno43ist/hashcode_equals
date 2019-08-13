package application;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		
		//MESMO HASHCODE PARA DADOS IGUAIS (a = c = 74113750)
		//PODE TER COLISÕEX (HASHCODES LIMITADOS A 32BITS)
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		//SE O HASHCODE DE DOIS OBJETOS FOREM DIFERENTES, ENTÃO OS DOIS OBJETOS SÃO DIFERENTES
		
		boolean tof = a.hashCode() == b.hashCode();//DARA FALSE
		boolean tof1 = a.hashCode() == c.hashCode();//DARA TRUE
		
		System.out.println(tof);
		System.out.println(tof1);
	}

}
