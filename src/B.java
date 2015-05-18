
public class B extends A
{
  public B (int x) { super(x + 1); }
  public int getNumber() { return super.getNumber() + 1; }
  public String getLetters() { return "B"; }
}
