/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Adrian
 */
@Named(value = "ejercicio32")
@RequestScoped
public class ejercicio32 {

    private int n;
    private String fprimo;

  

    /**
     * Creates a new instance of ejercicio32
     */
    public ejercicio32() {
    }

    public String getFprimo() {
        return fprimo;
    }

    public void setFprimo(String fprimo) {
        this.fprimo = fprimo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    

        
 

 
    public String getPrimes(int n) {
        int primes = 0, i = 2;

        String r =" ";
        boolean isPrime = true;
        while (primes < n) {
            isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                r = r + ", " + i;
                primes++;
            }
            i++;
        }
        return "Los primeros " + n + " primos son: " + r.substring(1);
    }
    
    public void process(){
        this.setFprimo(this.getPrimes(this.getN()));
    }

    
}
