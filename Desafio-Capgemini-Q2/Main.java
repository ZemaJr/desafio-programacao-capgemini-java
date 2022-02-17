import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    int countMaiusculo = 0;
    int countMinusculo = 0;
    int countDigito = 0;
    int countCaractereEspecial = 0;

    while (true) {

      System.out.print("\nPor favor, insira a sua senha: ");
      Scanner sc = new Scanner(System.in);
      String senha = sc.next();

      if (senha.length() < 6) {
        int digitosRestantes = 6 - senha.length();
        System.out.printf(
            "Sua senha ainda não é segura. Ela possui menos de 6 dígitos, por favor, insira mais %d dígitos. ",
            digitosRestantes);
      }

      for (int i = 0; i < senha.length(); i++) {
        char c = senha.charAt(i);
        if (Character.isUpperCase(c)) {
          countMaiusculo += 1;
        } else if (Character.isLowerCase(c)) {
          countMinusculo += 1;
        } else if (Character.isDigit(c)) {
          countDigito += 1;
        } else if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
            || senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
            || senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
          countCaractereEspecial += 1;
        }
      }

      if (countMaiusculo == 0) {
        System.out.println("Sua senha ainda não é segura. Ela não possui letra maiúscula.");
      } else if (countMinusculo == 0) {
        System.out.println("Sua senha ainda não é segura. Ela não possui letra minúscula.");
      } else if (countDigito == 0) {
        System.out.println("Sua senha ainda não é segura. Ela não possui dígito obrigatório.");
      } else if (countCaractereEspecial == 0) {
        System.out.println("Sua senha ainda não é segura. Ela não possui caractere especial.");
      } else {
        System.out.println("\nSua senha está segura!");
        sc.close();
        break;
      }

    }

  }

}