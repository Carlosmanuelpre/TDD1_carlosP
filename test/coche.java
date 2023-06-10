public class coche {

        public int velocidad;

        public void acelerar(int aceleracion) {
                velocidad += aceleracion;

        }

        public void decelerar(int deceleracion) {
                velocidad -= deceleracion;
                if (velocidad < 0) velocidad = 0;
        }
}
