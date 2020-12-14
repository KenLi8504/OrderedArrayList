import java.util.ArrayList;
public class OrderedArrayList <T extends Comparable <T> > extends NoNullArrayList <T>{

  private int findindex(T element){
    for (int i = 0; i < this.size;){
      if (element.compareTo(this.get(i)) < 0){
        i++
      }
      else{
        return i;
      }
    }
  }

  public boolean add(T element){

  }

  public void add(int index, T element){

  }

  public T set(int index, T element){

  }
}
