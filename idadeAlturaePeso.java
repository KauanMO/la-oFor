import java.util.Scanner;

public class idadeAlturaePeso {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double idade, altura, peso, idadeMaior50=0, mediaAltura=0, pesoMenor40=0, mediaPesoMenor40, pesoMaisVelha=0, pesoMaisNova=0;
		
		
		for (int i=1; i<=25; i++) {
			
			System.out.println("Insira a "+i+"a idade");
			idade = ler.nextDouble();
			
			System.out.println("Insira a "+i+"a altura");
			altura = ler.nextDouble();
			
			System.out.println("Insira o "+i+"o peso");
			peso = ler.nextDouble();
			
			pesoMaisVelha = peso;
			pesoMaisNova = peso;
			
			if (idade<pesoMaisNova) {
				pesoMaisNova=peso;
			}
			
			if (idade>pesoMaisVelha) {
				pesoMaisVelha=peso;
			}
			
			if (idade>50) {
				idadeMaior50++;
			}
			
			if (idade <=20 && idade>=10) {
				mediaAltura = (mediaAltura + altura);
			}
		
			if (peso<40) {
				pesoMenor40++;
			}
		
		}
		
		mediaAltura = mediaAltura/25;
		
		mediaPesoMenor40 = ((pesoMenor40*100)/25);
		
		System.out.println("A quantidade de pessoas com idade maior que 50 anos é de: "+idadeMaior50);
		
		System.out.println("A média de altura das pessoas com idade entre 10 e 20 anos é de: "+mediaAltura);
		
		System.out.println("A média de pessoas com peso inferior a 40kg é de: "+mediaPesoMenor40+"% do total de pessoas avaliadas");
	}

}
