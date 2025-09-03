package exercise;

public final class EmployeeAdapterDB implements Employee {
  private final EmployeeDB source;

  public EmployeeAdapterDB(EmployeeDB source) { this.source = source; }

  @Override
  public String getId() {
    return String.valueOf(source.getId());
  }

  @Override
  public String getFirstName() {
    return source.getFirstName();
  }

  @Override
  public String getLastName() {
    return source.getSurname();
  }

  @Override
  public String getEmail() {
    return source.getEmailAddress();
  }
}


