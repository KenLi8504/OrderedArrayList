import java.util.ArrayList;
public class OrderedArrayList <T extends Comparable <T> > extends NoNullArrayList <T>{

  public OrderedArrayList (){
    super();
  }
  public OrderedArrayList (int startingCapacity){
    super(startingCapacity);
  }

  private int findindex(T element){
    if (element == null){
      throw new IllegalArgumentException("You can't have void values in OrderedArrayLists");
    }
    for (int i = 0; i < super.size();){
      if (element.compareTo(super.get(i)) > 0){
        i++;
      }
      else{
        return i;
      }
    }
    return super.size();
  }

   public boolean add(T element){
     if (element == null){
       throw new IllegalArgumentException("You can't have void values in OrderedArrayLists");
     }
     else{
       int newIndex = findindex(element);
       super.add(newIndex,element);
       return true;
     }
  }

  public void add(int index, T element){
    int newIndex = findindex(element);
    super.add(newIndex,element);
  }

  public T set(int index, T element){
    if (element == null){
       throw new IllegalArgumentException("You can't have void values in OrderedArrayLists");
    }
    else{
      T removedElement = super.get(index);
      super.remove(index);
      this.add(element);
      return removedElement;
    }
  }

}
