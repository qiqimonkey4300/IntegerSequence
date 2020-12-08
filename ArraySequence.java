import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return (data.length);
  }

  public boolean hasNext(){
    return currentIndex < length();
  }

  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException("There is no next element.");
    } else {
      currentIndex++;
      return data[currentIndex - 1];
    }
  }

  
}
