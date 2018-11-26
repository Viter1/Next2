package Arrays_Y_Strings;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String laborables [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int actual = 26;
		
		int vacaciones = 22;
		int FinalDeVacaciones = (actual+vacaciones)%5;
		System.out.println(laborables[FinalDeVacaciones]);

	}

}
