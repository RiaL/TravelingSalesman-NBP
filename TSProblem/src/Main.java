/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import api.Population;

/**
 *
 * @author bartek
 */
public class Main {

    public static void main(String[] argv) throws Exception {

        Population pop = new Population(50);

        pop.emulate();
    }
}
