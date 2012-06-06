package cleancodematters.datagriddemo.server;

public class Page {
  private int first;
  private int count;

  public Page() {
  }
  
  public Page( int first, int count ) {
    this.first = first;
    this.count = count;
  }

  public int getFirst() {
    return first;
  }

  public int getCount() {
    return count;
  }

  public void setFirst( int first ) {
    this.first = first;
  }

  public void setCount( int count ) {
    this.count = count;
  }

  
  // generated by Eclipse
  @Override
  public int hashCode() {
    int prime = 31;
    int result = 1;
    result = prime * result + count;
    result = prime * result + first;
    return result;
  }

  // generated by Eclipse
  @Override
  public boolean equals( Object obj ) {
    if( this == obj )
      return true;
    if( obj == null )
      return false;
    if( getClass() != obj.getClass() )
      return false;
    Page other = (Page) obj;
    if( count != other.count )
      return false;
    if( first != other.first )
      return false;
    return true;
  }
  

}