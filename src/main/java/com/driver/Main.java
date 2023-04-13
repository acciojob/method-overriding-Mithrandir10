package com.driver;




public class Main {



    class A{

        public String meth(){
            return "Invoking method from class A";
        }
    }


    class B extends A{


        public String meth(){

            return  "Method is overridden in Extendend class B";
        }
    }

  
  public void main(String[] args){
  

      B obj1=new B();
     
      System.out.println(obj1.meth());

  }
  
}
