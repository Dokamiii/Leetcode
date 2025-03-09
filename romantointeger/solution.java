package romantointeger;

import java.util.HashMap;
class Solution {

    public int romanToInt(String s) {
        // Mapa para conversão de números romanos para inteiros
        HashMap<String, Integer> romantoint = new HashMap<String, Integer>();
        romantoint.put("I", 1);
        romantoint.put("V", 5);
        romantoint.put("X", 10);
        romantoint.put("L", 50);
        romantoint.put("C", 100);
        romantoint.put("D", 500);
        romantoint.put("M", 1000);
        
        // Variáveis para armazenar o total e o valor anterior
        int total = 0;
        int prev = 0;
        
        // Percorrendo a string de trás para frente
        for (int i = s.length() - 1; i >= 0; i--) {
            String currentChar = String.valueOf(s.charAt(i));  // Caractere atual
            int current = romantoint.get(currentChar);  // Valor atual no mapa
            
            // Se o valor atual for menor que o anterior, subtraímos
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }
            
            // Atualizando o valor anterior
            prev = current;
        }
        
        return total;  // Retornando o total calculado
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "MCMXCIV";  // Exemplo de número romano
        int result = solution.romanToInt(s);
        System.out.println("O valor inteiro de " + s + " é: " + result);
    }

}