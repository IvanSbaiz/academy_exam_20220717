package services;

import dataobjects.OldFaschionPoundValuesDTO;
import lombok.Getter;

@Getter
public class Div {

  private OldFaschionPoundValuesDTO operationA;

  private int operationB;

  public Div(OldFaschionPoundValuesDTO operationA, int operationB) {
    this.operationA = operationA;
    this.operationB = operationB;
  }


  public OldFaschionPoundValuesDTO divCalculator() {
    int divPence = this.operationA.getPence() / this.operationB;
    int divShillings = this.operationA.getShillings() / this.operationB;
    int divPounds = this.operationA.getPounds() / this.operationB;
    OldFaschionPoundValuesDTO total = new OldFaschionPoundValuesDTO(divPounds, divShillings,
        divPence);
    return total;
  }

}
