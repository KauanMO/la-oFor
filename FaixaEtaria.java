import java.util.Scanner;

public class FaixaEtaria {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double idade, pessoas, por, f15 = 0, f30 = 0, f45 = 0 , f60 = 0, f61 = 0;

		for (int i = 1; i <= 15; i++) {
			
			System.out.println("insira a idade:");
			idade = ler.nextDouble();
			if (idade<=15) {
			f15++;
		}else if(idade<=30) {
				f30++;
			}
			else if(idade<=45) {
					f45++;
				}
				else if(idade<=60) {
						f60++;
					}
					else {
						f61++;
					}
				}
			por = (100*f15) / 15;
			System.out.println("A faixa etária de 15 anos ou menos é de "+f15+" que é igual a "+por+"%");
			
			por = (100*f30) / 15;
			System.out.println("A faixa etária entre 15 e 30 anos é de "+f30+" que é igual a "+por+"%");
			
			por = (100*f45) / 15;
			System.out.println("A faixa etária entre 30 e 45 anos é de "+f45+" que é igual a "+por+"%");
			
			por = (100*f60) / 15;
			System.out.println("A faixa etária entre 45 e 60 anos é de "+f60+" que é igual a "+por+"%");
			
			por = (100*f61) / 15;
			System.out.println("A faixa etária de mais de 61 anos é de "+f61+" que é igual a "+por+"%");
		}	
}
