
package bean;

public class operaciones {
    float acumulador=0;
    
    public void calcular_suma(float valor){
        acumulador =acumulador + valor;
    }
    float descumulador=0;
    
    public void calcular_resta(float valor){
        descumulador =descumulador - valor;
    }
    float producto=0;
    float resultado=0;
    public void calcular_multiplica(float valor){
        if (producto == 0){
            producto=valor;
        }else if (producto !=0){
            resultado = producto*valor;
            producto=resultado;

        }
        
    }
    
   float dividendo=0;
    float divisor=0;
    public void calcular_resto(float valor){
       if (dividendo == 0){
            dividendo=valor;
        }else if (dividendo !=0){
            divisor = dividendo/valor;
            dividendo=divisor;

        }
    }
}
