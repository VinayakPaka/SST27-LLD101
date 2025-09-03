package exercise;

public final class EmployeeAdapterLDAP implements Employee {
  private final EmployeeLDAP source;

  public EmployeeAdapterLDAP(EmployeeLDAP source) { this.source = source; }

  @Override
  public String getId() {
    return source.get("uid");
  }

  @Override
  public String getFirstName() {
    return source.get("givenName");
  }

  @Override
  public String getLastName() {
    return source.get("sn");
  }

  @Override
  public String getEmail() {
    return source.get("mail");
  }
}


