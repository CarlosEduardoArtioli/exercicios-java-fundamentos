package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.ano = 2021;
		
		Data data2 = new Data(31, 12, 2021);
		
		System.out.println("Data: " + data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
	}
}
