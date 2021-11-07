public class Formas extends Figura{
    public Formas(String colRelleno, String colBorde) {
        super(colRelleno, colBorde);
    }


    private Estrellas Estrellas;
    private Corazon Corazon;
    private Rayo Rayo;

    public void CrearForma() {
        Estrellas = new Estrellas();
        Corazon = new Corazon();
        Rayo = new Rayo();
         
      }
      public Estrellas dibujarEstrellas(){
        return (Estrellas);
      }
    public Corazon dibujarCorazon(){
            return (Corazon);
    }
    public Rayo dibujarRayo(){
        return (Rayo);
    }

    public void dibuja(){
        return();
    };
}
