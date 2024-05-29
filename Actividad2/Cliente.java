package Actividad2;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    protected void pagar(Pedido pedido) {
        System.out.println(nombre + " pagó " + pedido.getPrecio() + " por el pedido hecho en " + pedido.getFecha());
    }

    public String getNombre() {
        return nombre;
    }
}