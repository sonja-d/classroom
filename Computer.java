public class Computer {
  private String computerName;
  private String operatingSystem;
  private float processTact;
  private float memory;
  private int hardDrive;

  public Computer() {
  }

  public Computer(String computerName, String operatingSystem, float processTact, float memory, int hardDrive) {
      this.computerName = computerName;
      this.operatingSystem = operatingSystem;
      this.processTact = processTact;
      this.memory = memory;
      this.hardDrive = hardDrive;
  }

  public String getComputerName() {
      return this.computerName;
  }

  public void setComputerName(String computerName) {
      this.computerName = computerName;
  }
 
  public String getOperatingSystem() {
      return this.operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
  }

  public float getProcessTact() {
      return this.processTact;
  }

  public void setProcessTact(float processTact) {
      this.processTact = processTact;
  }

  public float getMemory() {
      return this.memory;
  }

  public void setMemory(float memory) {
      this.memory = memory;
  }

  public int getHardDrive() {
      return this.hardDrive;
  }

  public void setHardDrive(int hardDrive) {
      this.hardDrive = hardDrive;
  }

  public void printInConsole() {
      System.out.println("Computer name: " + this.getComputerName());
      System.out.println("Operating system: " + this.getOperatingSystem());
      System.out.println("Process tact: " + this.getProcessTact() + " GHz");
      System.out.println("Memory: " + this.getMemory() + " GB");
      System.out.println("Hard drive: " + this.getHardDrive() + " GB");
      System.out.println();
  }

}