package services;

import dataobjects.OldFaschionPoundValuesDTO;
import lombok.Getter;

@Getter
public class Sub {

  private OldFaschionPoundValuesDTO operationA;
  private OldFaschionPoundValuesDTO operationB;

  public Sub(OldFaschionPoundValuesDTO operationA, OldFaschionPoundValuesDTO operationB) {
    this.operationA = operationA;
    this.operationB = operationB;
  }




  public OldFaschionPoundValuesDTO subCalculator() {
    int subPence = this.operationA.getPence() - this.operationB.getPence();
    int subShillings = this.operationA.getShillings() - this.operationB.getShillings();
    int subPounds = this.operationA.getPounds() - this.operationB.getPounds();
    OldFaschionPoundValuesDTO total = new OldFaschionPoundValuesDTO(subPounds, subShillings,
        subPence);
    return total;
  }

}
