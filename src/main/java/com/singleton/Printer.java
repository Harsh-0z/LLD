package com.singleton;



public class Printer {
    private static volatile Printer printer;
    private Printer(){
        // for reflection api block
        if(printer != null){
            throw new IllegalStateException("Printer already exists");
        }
    }

    public static Printer getInstance(){
        if(printer == null){
            //synchronized block just one time till the object is not created
            //after that any no of thread can access it .
            synchronized (Printer.class){
                if(printer == null){
                    printer = new Printer();
                }
            }
        }

        return printer;

    }


}

