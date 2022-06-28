/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package pkBean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author USUARIO
 */
@Named(value = "functionBean")
@RequestScoped
public class FunctionBean {

    private String response;
    private double number;
    private int terms, unit, method;
    
    public FunctionBean() {
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getTerms() {
        return terms;
    }

    public void setTerms(int terms) {
        this.terms = terms;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
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

    public double sinPrecision(double x){
        double sin = x;
        int n = 1;
        int i = 0;
        
        do{
            sin += ((Math.pow(x,n)/factorial(n) - Math.pow(x,n+2)/factorial(n+2)));
            n = n + 4;
            i++;
        }while(Math.abs(sin-Math.sin(x)) / Math.sin(x) >= 0.0000001);

        return Math.sin(x);


    }
    
    public double sin(double x, int iterNum){
        double result=x;
	boolean flip=true;
	boolean skip=false;
	for(int i=1;i<iterNum;i++)
        {
            if(!skip)
            {
                skip=true;
		if(!flip)
		{
                    result+=(double)((Math.pow(x, i+2))/factorial(i+2));
                    flip=true;
		}
		else
                {
                    result-=(double)((Math.pow(x, i+2))/factorial(i+2));
                    flip=false;
		}
            }
            else if(skip){skip=false;}
	}

		return result;
    }


    
    public void process(){

        if(this.getUnit() != 1){
          this.setNumber(this.getNumber()* Math.PI / 180);
        }
        
        switch (this.getMethod()) {
                case 1:
                    this.setResponse("sin(" + this.getNumber() +")= " + sin(this.getNumber(), this.getTerms()) + " en " + this.getTerms() + " iteraciones");
                    
                    break;
                case 2:
                    double r = sinPrecision(this.getNumber());
                    this.setResponse("sin(" + this.getNumber() +")= " + r);
                    break;   
                default:
                    throw new AssertionError();
        }

        
   
    }
    
}
