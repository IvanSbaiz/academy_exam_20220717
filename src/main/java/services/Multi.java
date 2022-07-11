package services;

import dataobjects.OldFaschionPoundValuesDTO;
import lombok.Getter;

@Getter
public class Multi {

  private OldFaschionPoundValuesDTO operationA;
  private int operationB;

  public Multi(OldFaschionPoundValuesDTO operationA, int operationB) {
    this.operationA = operationA;
    this.operationB = operationB;
  }


  public OldFaschionPoundValuesDTO multiCalculator() {
    int multiPence = this.operationA.getPence() * this.operationB;
    int multiShillings = this.operationA.getShillings() * this.operationB;
    int multiPounds = this.operationA.getPounds() * this.operationB;
    OldFaschionPoundValuesDTO total = new OldFaschionPoundValuesDTO(multiPounds, multiShillings,
        multiPence);
    return total;
  }

}
