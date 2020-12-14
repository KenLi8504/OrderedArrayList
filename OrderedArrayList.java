import java.util.ArrayList;
public class OrderedArrayList <T extends Comparable <T> > extends NoNullArrayList <T>{

  public OrderedArrayList (){
    super();
  }

  public int findindex(T element){
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
     int newIndex = findindex(element);
     super.add(newIndex,element);
     return true;
  }



  public void add(int index, T element){
    int newIndex = findindex(element);
    super.add(newIndex,element);
  }

/*
  public T set(int index, T element){

  }
  */
}
