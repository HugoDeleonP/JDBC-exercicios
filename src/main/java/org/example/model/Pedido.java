package org.example.model;

public class Pedido {

    private Integer id;
    private String cliente;
    private String data_pedido;
    private double total;

    public Pedido(Integer id, String cliente, String data_pedido, double total){
        this.id = id;
        this.cliente = cliente;
        this.data_pedido = data_pedido;
        this.total = total;
    }

    public Pedido(){
        this.id = null;
        this.cliente = null;
        this.data_pedido = null;
        this.total = 0;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return
                "+-----------------------------------| Pedido |------------------------------------+" + "\n" +
                "ID: " + id + "\n" +
                "Cliente: " + cliente + "\n" +
                "Data: " + data_pedido + "\n" +
                "Valor total: " + total + "\n" +
                "+---------------------------------------------------------------------------------+";
    }
}
