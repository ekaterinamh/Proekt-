
import java.util.Scanner;
public class Zadanie4 {
	final private static String login = "userlogin";
	final private static String password = "userpass";
	final private static String user = "Екатерина";

	private static String u_login;
	private static String u_pass;

	private static void ex1() {

	Scanner scanner = new Scanner(System.in);
	System.out.print("Введите логин : ");
	u_login = scanner.nextLine();
	System.out.print("Введите пароль : ");
	u_pass = scanner.nextLine();
	if (u_login.equals("userlogin") && u_pass.equals("userpass"))
	System.out.println("Вас узнали . Добро пожаловать " + user);
	else {
	System.out.println("Пароль или логин не распознан. Доступ запрещен ");
	}
	}

	public static void main(String[] args) {

	System.out.println("Лабораторная работа № 4 ");
	ex1();
	}
	}