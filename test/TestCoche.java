import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
       @Test
       public void test_crear_coche_con_velocidad_creo(){
              coche nuevoCoche = new coche();
              Assertions.assertEquals(0, nuevoCoche.velocidad);
       }
}
