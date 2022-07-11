package dataobjects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class OldFaschionPoundValuesDTO {

  private int pounds;
  private int shillings;
  private int pence;


  public OldFaschionPoundValuesDTO(int pounds, int shillings, int pence) {
    this.pounds = pounds;
    this.shillings = shillings;
    this.pence = pence;
  }



  public void poundRatio() {
    int ratioPence = this.pence % 12;
    int ratioPenceToShillings = this.pence / 12;
    int ratioShillings = (this.shillings + ratioPenceToShillings) % 20;
    int ratioShillingsToPounds = (this.shillings + ratioPenceToShillings) / 20;
    int ratioPounds = this.pounds + ratioShillingsToPounds;

  }

}
