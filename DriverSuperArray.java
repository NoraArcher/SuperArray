import java.util.Arrays;

public class DriverSuperArray {

  //Methods Added 5.11.20
  public static void removeDuplicates(SuperArray s) {
    //keep the first occurence!! and modify the parameter do
    //not make a new super array!!
    for (int i = s.size() - 1; i >= 0; i--) {
      if ( i != s.indexOf(s.get(i)) ) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray c = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if ( b.contains( a.get(i) ) ) {
        c.add(a.get(i));
      }
    }
    removeDuplicates(c);
    return c;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray c = a;     SuperArray lesser = b;     int k = 1;
    if ( a.size() < b.size() ) {
      c = b;    lesser = a;     k = 0;
    }
    for (int i = 0; i < lesser.size(); i++) {
      c.add( k, lesser.get(i) );      k += 2;
    }
    return c;
  }


  public static void main(String[] args) {



    System.out.println("Resize, Add, and Size Tests-"); //test trying get with a too large index after a resize
    if (true) {
      SuperArray skis = new SuperArray();
      for (int i = 0; i < 16; i++) {
        skis.add("B : T");
      }
      System.out.println("It should print 'B : T' four times, each on a new line.");
      for(int i = 0; i < skis.size(); i+= 4) {
        System.out.println( skis.get(i) );
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Get and Set Tests-");
    if (true) {
      SuperArray books = new SuperArray();
      if (books.get(6).equals("There is no element at this index; the size of the super array is 0") ) {
        System.out.println("get test: SUCCESS");
      } else {
        System.out.println("\t\t\tget test: FAIL...tried to retrieve:" + books.get(6));
      }
      if (books.get(11).equals("There is no element at this index; the size of the super array is 0")) {
        System.out.println("get test: SUCCESS");
      } else {
        System.out.println("\t\t\tget test: FAIL...tried to retrieve:" + books.get(11));
      }
      books.add("The Namesake");                  books.add("Babe");
      books.add("Stamped From The Beginning");    books.add("A Tale of Two Cities");
      if (books.get(2) == "Stamped From The Beginning") {
        System.out.println("get test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tget test: FAIL...tried to retrieve:" + books.get(2) + "\n");
      }
      if ( books.set(3, "I Capture The Castle").equals("A Tale of Two Cities") ) {
        System.out.println("set test: SUCCESS");
      } else {
        System.out.println("\t\t\tset test: FAIL...this was your result:" + books);
      }
      if ( books.get(3).equals("I Capture The Castle") ) {
        System.out.println("set test: SUCCESS");
      } else {
        System.out.println("\t\t\tset test: FAIL...tried to change:" + books.get(3));
      }
      books.add("Life of Pi");  books.add("Paradise Lost");
      if ( books.set(4, "Sluaghterhouse 5").equals("Life of Pi") ) {
        System.out.println("set test: SUCCESS");
      } else {
        System.out.println("\t\t\tset test: FAIL...this was your result:" + books);
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Nov 3rd Do Now Tests-");
    if (true) {
      SuperArray german = new SuperArray();
      if (german.isEmpty() == true) {
        System.out.println("isEmpty test: SUCCESS");
      } else {
        System.out.println("\t\t\tisEmpty test: FAIL... your super array looks like " + german);
      }
      german.add("Kneipp-Kur");
      if (german.isEmpty() == false) {
        System.out.println("isEmpty test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tisEmpty test: FAIL... your super array looks like " + german + "\n");
      }
      SuperArray disease = new SuperArray();
      disease.add("tuberculosis");    disease.add("polio");
      disease.add("osteoperosis");
      disease.clear();
      if (disease.size() == 0) {
        System.out.println("clear test: SUCCESS");
      } else {
        System.out.println("\t\t\tclear test: FAIL... your super array's size is " + disease.size());
      }
      if ( disease.get(1).equals("There is no element at this index; the size of the super array is 0") ) {
        System.out.println("clear test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tclear test: FAIL... your super array looks like " + disease + "\n");
      }
      if (german.toString().equals("[Kneipp-Kur]")) {
        System.out.println("toString test: SUCCESS");
      } else {
        System.out.println("\t\t\ttoString test: FAIL... the string version is " + german);
      }
      german.add("Wassertreten");
      if (german.toString().equals("[Kneipp-Kur, Wassertreten]")) {
        System.out.println("toString test: SUCCESS\n");
      } else {
        System.out.println("\t\t\ttoString test: FAIL... the string version is " + german + "\n");
      }
      if (german.contains("Bayern") == false) {
        System.out.println("contains test: SUCCESS");
      } else {
        System.out.println("\t\t\tcontains test: FAIL... your super array looks like " + german);
      }
      german.add("Bayern");
      if (german.contains("Bayern") == true) {
        System.out.println("contains test: SUCCESS");
      } else {
        System.out.println("\t\t\tcontains test: FAIL... your super array looks like " + german);
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Nov 3rd Classwork Tests-");
    if (true) {
      SuperArray europe = new SuperArray();
      europe.add("Czech Republic");   europe.add("Slovakia");
      europe.add("Deutschland");      europe.add("Andorra");
      europe.add("France");
      europe.add(2, "Latvia");
      if ( europe.get(2).equals("Latvia") ) {
        System.out.println("indexed add test: SUCCESS");
      } else {
        System.out.println("\t\t\tindexed add test: FAIL");
      }
      if ( europe.get(5).equals("France") ) {
        System.out.println("indexed add test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tindexed add test: FAIL\n");
      }
      if ( europe.remove(1).equals("Slovakia") ) {
        System.out.println("remove test: SUCCESS");
      } else {
        System.out.println("\t\t\tremove test: FAIL");
      }
      if ( europe.get(1).equals("Latvia") ) {
        System.out.println("remove test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tremove test: FAIL\n");
      }
      if ( europe.indexOf("Deutschland") == 2) {
        System.out.println("indexOf test: SUCCESS");
      } else {
        System.out.println("\t\t\tindexOf test: FAIL");
      }
      String delete = europe.remove(2);
      if ( europe.indexOf("Deutschland") == -1) {
        System.out.println("indexOf test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tindexOf test: FAIL\n");
      }
      String[] arr1 = {"Czech Republic", "Latvia", "Andorra", "France"};
      String[] arr2 = {};
      if ( Arrays.equals( europe.toArray(), arr1 ) ) {
        System.out.println("toArray test: SUCCESS");
      } else {
        System.out.println("\t\t\ttoArray test: FAIL");
      }
      SuperArray shingles = new SuperArray();
      if ( Arrays.equals( shingles.toArray(), arr2 ) ) {
        System.out.println("toArray test: SUCCESS");
      } else {
        System.out.println("\t\t\ttoArray test: FAIL");
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Constructor Tests-");
    if (true) {
      String[] jailhousechef = {"banana french toast", "cheese steak", "hot cereal"};
      SuperArray original = new SuperArray();
      SuperArray capacityType = new SuperArray(4);
      SuperArray arrayTo = new SuperArray(jailhousechef);
      original.add("banana french toast");  original.add("cheese steak");
      original.add("hot cereal");           capacityType.add("banana french toast");
      capacityType.add("cheese steak");     capacityType.add("hot cereal");
      if ( original.toString().equals( capacityType.toString() ) &&
           arrayTo.toString().equals( capacityType.toString() ) ) {
        System.out.println("constructor test: SUCCESS");
      } else {
        System.out.println("\t\t\tconstructor test: FAIL");
      }
      if ( arrayTo.size() == capacityType.size() &&
           original.size() == capacityType.size() ) {
        System.out.println( "constructor test: SUCCESS" );
      } else {
        System.out.println( "\t\t\tconstructor test: FAIL" );
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Nov 5th Do Now Tests-");
    if (true) {
      SuperArray necessities = new SuperArray();
      necessities.add("purell");        necessities.add("water");
      necessities.add("toilet paper");  necessities.add("shelter");
      necessities.add("toilet paper");  necessities.add("toilet paper");
      necessities.add("food");
      removeDuplicates(necessities);
      if ( necessities.toString().equals("[purell, water, toilet paper, shelter, food]") ) {
        System.out.println("removeDuplicates test: SUCCESS");
      } else {
        System.out.println("\t\t\tremoveDuplicates test: FAIL");
      }
      String[] repeat = {"hello", "hello", "hello"};
      SuperArray Srepeat = new SuperArray(repeat);
      removeDuplicates(Srepeat);
      if ( Srepeat.toString().equals("[hello]") ) {
        System.out.println("removeDuplicates test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tremoveDuplicates test: FAIL\n");
      }
      String[] mrKarray = {"9", "1", "2", "2","3","4"};
      String[] mrKarray2 = {"0", "4", "4","2","2","9"};
      SuperArray mrKSarray = new SuperArray(mrKarray); //a
      SuperArray mrKSarray2 = new SuperArray(mrKarray2); //b
      SuperArray CCC = findOverlap(mrKSarray, mrKSarray2);
      if ( CCC.toString().equals("[9, 2, 4]") ) {
        System.out.println("Overlap test: SUCCESS");
      } else {
        System.out.println("\t\t\tOverlap test: FAIL");
      }
      SuperArray nothinglike = new SuperArray();
      SuperArray you = new SuperArray();
      nothinglike.add("Look at you go!");     you.add("I just adore you");
      nothinglike.add("I wish that");         you.add("I knew");
      nothinglike.add("What makes you think I'm so special");
      SuperArray AAA = findOverlap(nothinglike, you);
      if ( AAA.size() == 0 ) {
        System.out.println("Overlap test: SUCCESS");
      } else {
        System.out.println("\t\t\tOverlap test: FAIL");
      }
    }

    System.out.println("\n---------------------------\n");

    System.out.println("Nov 5th Classwork Tests-");
    if (true) {
      String[] preBarn = {"duck", "pig", "spider", "cow"};
      SuperArray barnyard = new SuperArray(preBarn);
      barnyard.reverse();
      if ( barnyard.get(2).equals("pig") ) {
        System.out.println("reverse test: SUCCESS");
      } else {
        System.out.println("\t\t\treverse test: FAIL; index 2 of the reverse is " + barnyard.get(2));
      }
      if ( barnyard.toString().equals("[cow, spider, pig, duck]") ) {
        System.out.println("reverse test: SUCCESS\n");
      } else {
        System.out.println("\t\t\treverse test: FAIL; the reverse is " + barnyard.toString() + "\n");
      }
      String[] mrKarray = {"9", "1", "2", "2","3","4"};
      String[] mrKarray2 = {"0", "4", "4","2","2","9"};
      SuperArray mrKSarray = new SuperArray(mrKarray); //a
      SuperArray mrKSarray2 = new SuperArray(mrKarray2); //b
      SuperArray CCC = findOverlap(mrKSarray, mrKSarray2);
      if ( mrKSarray.lastIndexOf("2") == 3 ) {
        System.out.println("lastIndexOf test: SUCCESS");
      } else {
        System.out.println("\t\t\tlastIndexOf test: FAIL");
      }
      if ( mrKSarray2.lastIndexOf("4") == 2 ) {
        System.out.println("lastIndexOf test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tlastIndexOf test: FAIL\n");
      }
      SuperArray notCCC = new SuperArray();
      notCCC.add("9");    notCCC.add("7.5");    notCCC.add("4");
      SuperArray DDD = new SuperArray(25);
      DDD.add("9");   DDD.add("2");   DDD.add("4");
      if ( !notCCC.equals(CCC) ) {
        System.out.println("equals test: SUCCESS");
      } else {
        System.out.println("\t\t\tequals test: FAIL");
      }
      if ( DDD.equals(CCC) ) {
        System.out.println("equals test: SUCCESS\n");
      } else {
        System.out.println("\t\t\tequals test: FAIL\n");
      }
      String[] ayo = {"a","b","c","d","e","f"};   String[] byo = {"0","1","2","3"};
      SuperArray Ayo = new SuperArray(ayo);       SuperArray Byo = new SuperArray(byo);
      String[] azo = {"a","b","c"};   String[] bzo = {"0","1","2","3", "4"};
      SuperArray Azo = new SuperArray(azo);       SuperArray Bzo = new SuperArray(bzo);
      if ( zip(Ayo, Byo).toString().equals("[a, 0, b, 1, c, 2, d, 3, e, f]") ) {
        System.out.println("zip test: SUCCESS");
      } else {
        System.out.println("\t\t\tzip test: FAIL...zip is returning: " + zip(Ayo, Byo));
      }
      if ( zip(Azo, Bzo).toString().equals("[a, 0, b, 1, c, 2, 3, 4]") ) {
        System.out.println("zip test: SUCCESS");
      } else {
        System.out.println("zip test: FAIL...zip is returning: " + zip(Azo, Bzo));
      }

    }

    System.out.println("\n---------------------------\n");

    System.out.println("Nov 9th Classwork Tests-");
    if (true) {
      System.out.println("Monday lesson is not out yet");
      String[] animls = {"cat", "dog"};             SuperArray anima = new SuperArray(animls);
      String[] anmals = {"bird", "mouse", "rat"};   anima.add(anmals);
      if (anima.size() == 5) {
        System.out.println("add array test: SUCCESS");
      } else {
        System.out.println("add array test: FAIL");
      }
      if ( anima.toString().equals("[cat, dog, bird, mouse, rat]") ) {
        System.out.println("add array test: SUCCESS\n");
      } else {
        System.out.println("add array test: FAIL\n");
      }
    }



  }
}
