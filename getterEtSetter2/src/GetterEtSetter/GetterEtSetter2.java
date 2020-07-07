
package GetterEtSetter;

public class GetterEtSetter2 {
    
    public static void main(String [] arg) {
    
    GetterEtSetter getSet = new GetterEtSetter();
        
        getSet.setNombre("Erick");
        getSet.setApellido("Franco");
        getSet.setEdad(36);
        getSet.setPeso(85);
        
        System.out.println("Mi nomnre es: " + getSet.getNombre());
        System.out.println("Mi apellido es : " + getSet.getApellido());
        System.out.println("Mi edad es " + getSet.getEdad() + " años");
        System.out.println("Tengo un peso de " + getSet.getPeso() +" kilos");
    }

    
    
}
