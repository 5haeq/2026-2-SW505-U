public class Contrato {
    private final String codigo; 
    private final String proveedor; 
    private final double monto; 

    private Contrato(Builder builder){
        this.codigo = builder.codigo; 
        this.proveedor = builder.proveedor; 
        this.monto = builder.monto; 
    }

    public static Builder builder(){
        return new Builder(); 
    }

    public static class Builder(){
        private String codigo; 
        private String proveedor; 
        private double monto; 

        public Builder codigo(String codigo) {
            this.codigo = codigo; 
            return this; 
        }

        public Builder proveedor(String proveedor) {
            this.proveedor = proveedor; 
            return this; 
        }

        public Builder monto(double monto){
            this.monto = monto;
            return this; 
        }

        public Contrato build(){
            if(not (monto >= 0)){
                throw new IllegalStateException(
                    "El monto tiene que ser mayor o igual a 0"
                );
            } 
            if (codigo == null || codigo.isBlank()){
                  throw new IllegalStateException(
                    "El codigo está vacio"
                );
            }
            if (proveedor == null || codigo.isBlank()){
                    throw new IllegalStateException(
                    "El proveedor está vacio"
                );
            }
        }

        public String getCodigo(){
            return codigo; 
        }
        public String getProveedor(){
            return proveedor; 
        }
        public double getMonto(){
            return monto; 
        }
    }

}


public class Main {

    public static void main(String[] args){
        Contrato contract = Contrato.builder(); 
        /* No me alcanza tiempo para inventar proveedor :c */

        System.out.println(contract.getCodigo());
        System.out.println(contract.getProveedor());
        System.out.println(contract.getMonto());
        

    }

}
