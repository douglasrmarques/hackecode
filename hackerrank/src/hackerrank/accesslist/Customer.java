package hackerrank.accesslist;

public class Customer {

	private String nome;
	private String data;
	
	public String getNome() {
		return nome;
	}

	public String getData() {
		return data;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		
		if(!(obj instanceof Customer)){
			return false;
		}
		
		Customer customer = (Customer) obj;

		if(this.getNome().equals(customer.getNome())){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return System.identityHashCode(this);
	}

}
