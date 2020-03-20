
public abstract class DecoratorFiguraGeometrica extends FiguraGeometrica {

	protected FiguraGeometrica figuraGeometrica;
	
	public DecoratorFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
		this.figuraGeometrica = figuraGeometrica;
	}
	
	public abstract String comoDesenhar();

}
