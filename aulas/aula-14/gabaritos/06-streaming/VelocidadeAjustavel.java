public interface VelocidadeAjustavel { void setVelocidade(double v); double getVelocidade(); default boolean velocidadeValida(double v){return v>=0.5&&v<=3.0;} }
