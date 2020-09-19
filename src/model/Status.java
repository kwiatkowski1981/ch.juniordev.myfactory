package model;
import numbers.Numbers;
import resorces.Machine;


public class Status {

    Machine inOperation;  // In Betrieb
    int numberOfStrokes;  // Hubzahl
    double standStill;  //  Stillstand auf aktuale Storung bezogen
    int numberOfPices; // Stuckzahl
    Priority priority;  // Priotitat
    Numbers weekShould;  // Wochensoll
    Numbers shiftShould; // Schichtsoll

}

