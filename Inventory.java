class Inventory {

  String name;
  String serialNum;
  int value;

  public Inventory(String itemName, String serialNumber, int itemValue) {
    this.name = itemName;
    this.serialNum = serialNumber;
    this.value = itemValue;
  }

  public String getName()
  {
    return name;
  }

  public String getSerialNum()
  {
    return serialNum;
  }

  public Integer getValue()
  {
    return value;
  }
}