package services;

import dataobjects.OldFaschionPoundValuesDTO;
import lombok.Getter;

@Getter
public class Add {

  private OldFaschionPoundValuesDTO operationA;
  private OldFaschionPoundValuesDTO operationB;


  public Add(OldFaschionPoundValuesDTO operationA, OldFaschionPoundValuesDTO operationB) {
    this.operationA = operationA;
    this.operationB = operationB;
  }

  public OldFaschionPoundValuesDTO addCalculator() {
    int addPence = this.operationA.getPence() + this.operationB.getPence();
    int addShillings = this.operationA.getShillings() + this.operationB.getShillings();
    int addPounds = this.operationA.getPounds() + this.operationB.getPounds();
    OldFaschionPoundValuesDTO total = new OldFaschionPoundValuesDTO(addPounds, addShillings, addPence);
    return total;
  }

}
