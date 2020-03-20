import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		
		Random random = new Random();

		int numero = random.nextInt(2);

		FiguraGeometrica figura = null;
		
		switch (numero) {

		case 0:
			figura = new Quadrado();
			break;
		case 1:
			figura = new Retangulo();
			break;
		case 2:
			figura = new Circulo();
			break;
	
		}
		
		int numeroDec = random.nextInt(2);
		
		switch (numeroDec) {

		case 0:
			figura.desenhar();
			break;
		case 1:
			Random randomDec = new Random();

			int n = random.nextInt(1);
			
			switch(n){
				case 0:
					FiguraGeometrica corLinha = new CorDaLinhaDecorator(figura);
					System.out.println(corLinha.desenhar() + corLinha.comoDesenhar());
		
				case 1:
					FiguraGeometrica corPreenchimento = new CorDePreenchimentoDecorator(figura);
					System.out.println(corPreenchimento.desenhar() + corPreenchimento.comoDesenhar());
			}
			
			break;
		case 2:
			FiguraGeometrica corLinha = new CorDaLinhaDecorator(figura);
			System.out.println(corLinha.desenhar() + corLinha.comoDesenhar());
			
			FiguraGeometrica corPreenchimento = new CorDePreenchimentoDecorator(figura);
			System.out.println(corPreenchimento.desenhar() + corPreenchimento.comoDesenhar());

			break;
	
		}

	}

}
