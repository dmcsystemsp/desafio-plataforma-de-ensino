package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlataformaEnsino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
				
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Dados da "+ i +"a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Título: ");
			String title = sc.nextLine();
			if(ch =='c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				list.add(new Video(title, url, seconds));
			}else if(ch=='t') {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões :");
				int questionCount = sc.nextInt();
				list.add(new Task(title, description, questionCount));
			}
		}
		
		System.out.println();
		int sum =0;
		for(Lesson curso : list) {
			sum+= curso.duration();
		}
		System.out.println("DURAÇÃO TOTAL DO CUSRO = "+sum + " segundos");
		sc.close();

	}

}
