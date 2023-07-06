package projetoCriaçãoIphone;

public class Iphone {
	private String modelo;
	private String marca;
	private String telefone;
	private String dono;
	
	
	public  Iphone() {
		
	}
	public  Iphone(String stnModelo, String stnMarca, String stnTelefone, String dono) {
		this.marca=stnMarca;
		this.modelo=stnModelo;
		this.telefone=stnTelefone;
		this.dono=dono;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", marca=" + marca + ", telefone=" + telefone + ", dono=" + dono + "]";
	}
	
}
