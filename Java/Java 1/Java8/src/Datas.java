import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);

		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, olimpiadasRio);
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);

		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Exato momento em que eu finalizei todas as forma??es do programa Oracle Next Education - Alura : " + agora.format(formatadorComHoras));

		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		LocalDate inicio = LocalDate.of(2020, Month.SEPTEMBER, 21);
		LocalDate fim = LocalDate.of(2021, Month.MARCH, 9);
		
		Period duracaoCursosAlura = Period.between(inicio, fim);
		
		System.out.println(duracaoCursosAlura);

	}

}
