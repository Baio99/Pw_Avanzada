/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package pkBean;


import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "sinBean")
@Dependent
public class SinBean {
    private String response, number, terms, unit, method;
    
    public SinBean() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1); 
    }  

    public float[] sinPrecision(float x){
        float sin = x;
        float previous = sin;
        int n = 1;
        int i = 0;
        do{
            previous = sin;
            sin = (float)(sin + (Math.pow(x,n)/factorial(n) - Math.pow(x,n+2)/factorial(n+2)));
            n = n + 4;
            i++;
        }while(Math.abs(sin-previous) / Math.abs(sin) >= 0.000001);

        return new float[]{sin, (float)i};
    }
    
    public float sin(float x, int iterNum){
        float sin = 0;
        int n = 1;
        for (int i = 1; i <= iterNum; i++) {
            sin = (float)(sin + (Math.pow(x,n)/factorial(n) - Math.pow(x,n+2)/factorial(n+2)));
            n = n + 4;
        }
 
        return sin;
    }


    
    public void process(){

        this.setResponse(this.getNumber() + this.getMethod() + this.getTerms() + this.getUnit() + "");
        
   
    }

    
}
    

