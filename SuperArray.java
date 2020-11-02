public class SuperArray {



  private String[] data;
  private int size; //the current size


  public SuperArray() {
    data = new String[10];
    for (int i = 0; i < data.length; i++) {
      data[i] = "BLANK";
    }
    size = 0;
  }


  public int size() { //Section c
    return size;
  }

  public boolean add(String element) { //Section d
    if (size == data.length) {
      resize();
    }
    data[size] = element; //null pointer exception!!!!
    size ++;
    return true;
    //appends element to data, the next null value,
    //if capaacity is reached resize and try again
  }

  public String get(int index) { //Section e
    if ( (index >= size) || (index < 0) ) {
      return ("There is no element at this index; the size of the super array is " + size);
    }
    return data[index];
  }

  public String set(int index, String element) { // Section f
    if ( (index >= size) || (index < 0) ) {
      return "There is no element at this index to be replaced.";
    }
    String toReturn = data[index];
    data[index] = element;
    return toReturn;
    //replace the element at index with new element, assume index < size-1
  }


  private void resize() { //Section g
    String[] newsie = new String[data.length + 5];
    for (int i = 0; i < data.length; i++) {
      newsie[i] = data[i];
    }
    data = newsie;
    //Increase the capacity by: creating a larger array,
    //copying the values from the original array to the new one.
    // and assigning the new one to the instance variable.
  }



}
