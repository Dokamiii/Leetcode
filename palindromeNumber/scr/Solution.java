package palindromeNumber.scr;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
            
            int numeroInvertido = 0, ultimoNumero = 0, numeros = x;

            while (numeros != 0) {
                ultimoNumero = numeros % 10;
                numeroInvertido = numeroInvertido * 10 + ultimoNumero;
                numeros /= 10;
            }
            
            return numeroInvertido == x;
        } 
}