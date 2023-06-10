import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
       @Test
       public void test_crear_coche_con_velocidad_creo_CarloPerez(){
              coche nuevoCoche = new coche();
              Assertions.assertEquals(0, nuevoCoche.velocidad);
       }
       @Test
       public void test_acelerar_coche_su_velocidad_aumenta_CarlosPerez(){
              coche nuevoCoche = new coche();
              nuevoCoche.acelerar(30);
              Assertions.assertEquals(30, nuevoCoche.velocidad);
       }
       @Test
       public void test_acelerar_coche_su_velocidad_Disminuye_CarlosPerez(){
              coche nuevoCoche = new coche();
              nuevoCoche.velocidad = 50;
              nuevoCoche.decelerar(88);
              Assertions.assertEquals(0, nuevoCoche.velocidad);
       }
}
