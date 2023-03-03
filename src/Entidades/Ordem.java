package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
	private static final SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	private List<OrdemItens> itens = new ArrayList<>();

	private Cliente cliente;

	private Date momentoPedido;
	private OrdemStatus status;

	public Ordem(Date momentoPedido, OrdemStatus status, Cliente cliente) {
		this.momentoPedido = momentoPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public List<OrdemItens> getItens() {
		return itens;
	}

	public void setItens(List<OrdemItens> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Date momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public void addProduto(OrdemItens item) {
		itens.add(item);
	}

	public void addRemove(OrdemItens item) {
		itens.remove(item);
	}

	public double total() {
		double soma = 0;
		for (OrdemItens i : itens) {
			soma += i.subTotal();
		}

		return soma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(data.format(momentoPedido));
		sb.append(" Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (OrdemItens item : itens) {
			sb.append(item + "\n");
		}

		return sb.toString();

	}
}