import java.util.ArrayList;

public class NoNullArrayList <T> extends ArrayList <T> {

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("You can't have void values in NoNullArrayLists");
    }
    else{
      return super.add(element);
    }
  }

  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("You can't have void values in NoNullArrayLists");
    }
    else{
      super.add(index,element);
    }
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("You can't have void values in NoNullArrayLists");
    }
    else{
      return super.set(index,element);
    }
  }
}
