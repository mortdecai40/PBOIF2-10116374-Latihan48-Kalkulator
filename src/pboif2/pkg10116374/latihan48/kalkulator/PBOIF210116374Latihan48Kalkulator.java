package pboif2.pkg10116374.latihan48.kalkulator;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan proses perhitungan dengan kalkulator
 *
 */
public class PBOIF210116374Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        
        double val1 = calc.getValue1();
        double val2 = calc.getValue2();
        
        System.out.println("VALUE 1 = " + val1);
        System.out.println("VALUE 2 = " + val2);
        
        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + calc.add(val1, val2));
        System.out.println("Result Minus is = " + calc.minus(val1, val2));
        System.out.println("Result Multiple is = " + calc.multiplication(val1, val2));
        System.out.println("Result Division is = " + calc.division(val1, val2));
    }
    
}
