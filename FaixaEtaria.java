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
			System.out.println("A faixa et�ria de 15 anos ou menos � de "+f15+" que � igual a "+por+"%");
			
			por = (100*f30) / 15;
			System.out.println("A faixa et�ria entre 15 e 30 anos � de "+f30+" que � igual a "+por+"%");
			
			por = (100*f45) / 15;
			System.out.println("A faixa et�ria entre 30 e 45 anos � de "+f45+" que � igual a "+por+"%");
			
			por = (100*f60) / 15;
			System.out.println("A faixa et�ria entre 45 e 60 anos � de "+f60+" que � igual a "+por+"%");
			
			por = (100*f61) / 15;
			System.out.println("A faixa et�ria de mais de 61 anos � de "+f61+" que � igual a "+por+"%");
		}	
}
