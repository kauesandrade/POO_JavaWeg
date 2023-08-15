
public class TesteAnimalMain {

	public static void main(String[] args) {
		Animal a = new Animal("Homo Sapiens", "Grande", 67);
		
		Cachorro c = new Cachorro("Canis Lupis Familiares", "médio", 20);

		System.out.println(c.latir());
		System.out.println(c.alimentar("ração"));
		System.out.println(c.repousar(5, "min"));
		System.out.println();
		
		
		//-------Polimorfismos-------
		Animal bicho = new Animal();
		
		//mudar tipo para cachorro
		bicho = new Cachorro("Canis Lupis Familiares", "médio", 20);
		
		//transformou para a classe cachorro, guardou as informacao do cachorro do bicho
		Cachorro dog = (Cachorro)bicho;
		
		//--------------------------
		
		System.out.println(bicho.reproduzir());
		System.out.println(c.reproduzir());
		
		Peixe betta = new Peixe();
		
		System.out.println(betta.mostrarPeixe());
		System.out.println(betta.bolhas());
		
		PeixeAguaDoce peixinhoDoce = (PeixeAguaDoce) betta;
		
		Sapo sapinho = new Sapo();
		
		System.out.println("\n "+sapinho.mostrarSapo());
		System.out.println(sapinho.locomover("esquerda", 9));
	}

}
