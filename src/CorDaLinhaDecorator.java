import java.util.Random;

public class CorDaLinhaDecorator extends DecoratorFiguraGeometrica {

	public CorDaLinhaDecorator(FiguraGeometrica figuraGeometrica) {
		super(figuraGeometrica);
	}

	@Override
	public String desenhar() {
		return figuraGeometrica.desenhar()+ " com cor da linha: ";
	}

	@Override
	public String comoDesenhar() {
		Random random = new Random();
		
		int numero = random.nextInt(3);
		String cor = null;
		
		switch(numero) {
		
			case 0:
				cor = "verde";
				break;
			case 1:
				cor = "vermelho";
				break;
			case 2:
				cor = "azul";
				break;
			case 3:
				cor = "roxo";
				break;	
		}
	
		return cor;
	}

}
