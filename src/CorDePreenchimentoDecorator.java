import java.util.Random;

public class CorDePreenchimentoDecorator extends DecoratorFiguraGeometrica {

	public CorDePreenchimentoDecorator(FiguraGeometrica figuraGeometrica) {
		super(figuraGeometrica);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String desenhar() {
		return figuraGeometrica.desenhar() + " com preenchimento na cor:";
	}

	@Override
	public String comoDesenhar() {
		Random random = new Random();

		int numero = random.nextInt(3);
		String cor = null;

		switch (numero) {

		case 0:
			cor = "azul";
			break;
		case 1:
			cor = "prata";
			break;
		case 2:
			cor = "preto";
			break;
		case 3:
			cor = "amarelo";
			break;
		}

		return cor;
	}

}
