package org.cgmlti.adso.ciclos;

public class breeak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Cuando contador llegue a 5
            // quiero que salga del ciclo
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}