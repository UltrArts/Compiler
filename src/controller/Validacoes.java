
package controller;


public class Validacoes {
    
    public static boolean simbolo(String caratere) {

        for (int i = 0; i < Regex.SPECIAL_SYMBOL.size() - 1; i++) {
            if (Regex.SPECIAL_SYMBOL.get(i).equalsIgnoreCase(caratere)) {
                return true;
            }
        }

        return false;
    }
    
    public static boolean is_relational_operator(String car){
         for (int i = 0; i < Regex.RELATIONAL_OPERATORS.size() - 1; i++) {
            if (Regex.RELATIONAL_OPERATORS.get(i).equalsIgnoreCase(car)) {
                return true;
            }
        }
        return false;
    }
    


    public static boolean digito(String caratere) {
        return caratere.matches(Regex.DIGITOS);
    }

    static boolean identificador(String caratere) {
        return caratere.matches(Regex.INDENTIFIER);
    }
    

    public static String validar(String str1) {
        String str = "";
        if (str1.endsWith(" ")) {
            str = str1.substring(0, str1.length() - 1);
        } else {
            str = str1;
        }
        if (simbolo(str)) {
            if(is_relational_operator(str))
                return "RELATIONAL OPERATOR";
            else
            return "SPECIAL SYMBOL";
        } else if (digito(str)) {
            return "DIGIT";
        } else if (identificador(str)) {
            return "IDENTIFIER";
        } else {
            return "ERRO";
        }
    }
}
