package exercise;

public final class EmployeeAdapterCSV implements Employee {
  private final EmployeeCSV source;

  public EmployeeAdapterCSV(EmployeeCSV source) { this.source = source; }

  @Override
  public String getId() {
    return source.tokens()[0];
  }

  @Override
  public String getFirstName() {
    return source.tokens()[1];
  }

  @Override
  public String getLastName() {
    return source.tokens()[2];
  }

  @Override
  public String getEmail() {
    return source.tokens()[3];
  }
}
