# Esquema código:

abstract class Persona(val id: Int, val nombre: String)

class Cliente(id: Int, nombre: String, val email: String) : Persona(id, nombre)

class Producto(val id: Int, val nombre: String, val precio: Double, var stock: Int) {
    fun actualizarStock(cantidad: Int) {
        if (stock >= cantidad) stock -= cantidad else throw IllegalArgumentException("Stock insuficiente")
    }
}

class Pedido(val id: Int, val cliente: Cliente, val productos: MutableList<Producto> = mutableListOf()) {
    fun calcularTotal(): Double {
        return productos.sumOf { it.precio }
    }

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }
}

interface Enviable {
    fun enviar()
}

class PedidoEnviado(id: Int, cliente: Cliente) : Pedido(id, cliente), Enviable {
    override fun enviar() {
        println("Pedido enviado")
    }
}
