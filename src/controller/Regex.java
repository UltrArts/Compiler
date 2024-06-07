
package controller;

import java.util.List;
import java.util.Arrays;

public class Regex {
    
    public static final String DIGITOS = "-?[0-9]+";
    
    public static final List<String> SPECIAL_SYMBOL  = Arrays.asList("+","-","*","=", "<>", "<", ">", "<=", 
        ">=", "(", ")", "[", "]", ":=", ".", ",", ";", ":", "..","div", "or", "and", "not" ,"if" ,"then", "else", "of", "while", "do", "begin", "end",
      "read", "write", "var", "array", "function", "procedure", "program", "true", "false", "char", "integer", "boolean","=", "<>", "<", ">", "<=", 
        ">=");
    
    public static final List<String> RELATIONAL_OPERATORS = Arrays.asList(">", "<", ">=", "<=", "=", "or", "and", "<>");
    
//    public static
        
    public static final String INDENTIFIER = "[a-zA-Z]+[0-9]*[a-zA-Z]*";

}
