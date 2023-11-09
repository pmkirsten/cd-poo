package com.campusdual.exercisespoo.exercise15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

  protected Date expirationDate;

  protected SimpleDateFormat sdf = new SimpleDateFormat();

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public FreshMerchandise(String name, String uniqueID, String responsibleId) {
    super(name, uniqueID, responsibleId);
  }

  public FreshMerchandise(String name, String uniqueID, String responsibleId, int zone,
      String area, String shelf, int quantity, Date expirationDate) {
    super(name, uniqueID, responsibleId, zone, area, shelf, quantity);
    this.expirationDate = expirationDate;
  }

  @Override
  public Object getSpecificData() {
    StringBuilder builder = new StringBuilder();

    builder.append("Localización: ");
    builder.append(getLocation());
    builder.append("\n");
    builder.append("Caducidade: ");
    builder.append(sdf.format(this.getExpirationDate()));

    return builder.toString();
  }

  public void printSpecificDate() {
    System.out.println(this.getSpecificData());
  }

  public static void main(String[] args) {
    FreshMerchandise fm = new FreshMerchandise("Mazás", "001-9", "Froitería de Onte S.L.",
        8, "C", "114D", 53, Calendar.getInstance().getTime());

    fm.printSpecificDate();
  }

}
