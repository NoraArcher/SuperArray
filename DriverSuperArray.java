import java.util.Arrays;
public class DriverSuperArray {
  public static void main(String[] args) {



    System.out.println("Resize, add, size, and get test all in one-"); //test trying get with a too large index after a resize
    if (true) {
      SuperArray skis = new SuperArray();
      for (int i = 0; i < 16; i++) {
        String type = "";
        if (Math.random() > 0.1) type = "hey";
        if (Math.random() > 0.2) type = "Random-Access Memory";
        if (Math.random() > 0.3) type = "Nuclear Reactor";
        if (Math.random() > 0.4) type = "Snow Board";
        if (Math.random() > 0.5) type = "DDR4";
        if (Math.random() > 0.6) type = "Soviet RBMK";
        if (Math.random() > 0.7) type = "Burton Deep Thinker";
        if (Math.random() > 0.8) type = "Cashmere";
        if (Math.random() > 0.9) type = "Polyester";
        if (Math.random() <= 0.1) type = "Silk Milk";
        skis.add(" : " + type);
      }
      System.out.println("(this test needs to be revised)");
      for(int i = 0; i < skis.size(); i+= 4) {
        System.out.println( skis.get(i) );
      }
    }

    System.out.println("\nDifferent get and set tests-");
    if (true) {
      SuperArray books = new SuperArray();
      if (books.get(6).equals("There is no element at this index; the size of the super array is 0") ) {
        System.out.println("get test: SUCCESS");
      } else {
        System.out.println("get test: FAIL");
      }
      if (books.get(11).equals("There is no element at this index; the size of the super array is 0")) {
        System.out.println("get test: SUCCESS");
      } else {
        System.out.println("get test: FAIL");
      }
      books.add("The Namesake");
      books.add("Babe");
      books.add("Stamped From The Beginning");
      books.add("A Tale of Two Cities");
      if (books.get(2) == "Stamped From The Beginning") {
        System.out.println("get test: SUCCESS");
      } else {
        System.out.println("get test: FAIL");
      }
      if ( books.set(3, "I Capture The Castle").equals("A Tale of Two Cities") ) {
        System.out.println("set test: SUCCESS");
      } else {
        System.out.println("set test: FAIL");
      }
      if ( books.get(3).equals("I Capture The Castle") ) {
        System.out.println("set/get test: SUCCESS");
      } else {
        System.out.println("set/get test: FAIL");
      }
      books.add("Life of Pi");
      books.add("Paradise Lost");
      if ( books.set(4, "Sluaghterhouse 5").equals("Life of Pi") ) {
        System.out.println("set test: SUCCESS");
      } else {
        System.out.println("set test: FAIL");
      }
    }

    System.out.println("\nTuesday Do Now Methods Test-");
    if (true) {
      SuperArray german = new SuperArray();
      if (german.isEmpty() == true) {
        System.out.println("isEmpty test: SUCCESS");
      } else {
        System.out.println("isEmpty test: FAIL");
      }
      german.add("Kneipp-Kur");
      if (german.isEmpty() == false) {
        System.out.println("isEmpty test: SUCCESS");
      } else {
        System.out.println("isEmpty test: FAIL");
      }
      SuperArray disease = new SuperArray();
      disease.add("tuberculosis");
      disease.add("polio");
      disease.add("osteoperosis");
      disease.clear();
      if (disease.size() == 0) {
        System.out.println("clear test: SUCCESS");
      } else {
        System.out.println("clear test: FAIL");
      }
      if ( disease.get(1).equals("There is no element at this index; the size of the super array is 0") ) {
        System.out.println("clear test: SUCCESS");
      } else {
        System.out.println("clear test: FAIL");
      }
      if (german.toString().equals("[Kneipp-Kur]")) {
        System.out.println("toString test: SUCCESS");
      } else {
        System.out.println("toString test: FAIL\n" + german.toString());
      }
      german.add("Wassertreten");
      if (german.toString().equals("[Kneipp-Kur, Wassertreten]")) {
        System.out.println("toString test: SUCCESS");
      } else {
        System.out.println("toString test: FAIL\n" + german.toString());
      }
      if (german.contains("Bayern") == false) {
        System.out.println("contains test: SUCCESS");
      } else {
        System.out.println("contains test: FAIL");
      }
      german.add("Bayern");
      if (german.contains("Bayern") == true) {
        System.out.println("contains test: SUCCESS");
      } else {
        System.out.println("contains test: FAIL");
      }
    }

    System.out.println("\nTuesday Classwork Methods Test-");
    if (true) {
      SuperArray europe = new SuperArray();
      europe.add("Czech Republic");//0 --> 0 --> 0 --> 0
      europe.add("Slovakia");//1 --> 1 --> X
      europe.add("Deutschland");//2 --> 3 --> 2 --> X
      europe.add("Andorra");//3 --> 4 --> 3 --> 2
      europe.add("France");//4 --> 5 --> 4 --> 3
      europe.add(2, "Latvia"); // X --> 2 --> 1 --> 1
      if ( europe.get(2).equals("Latvia") ) {
        System.out.println("indexed add test: SUCCESS");
      } else {
        System.out.println("indexed add test: FAIL");
      }
      if ( europe.get(5).equals("France") ) {
        System.out.println("indexed add test: SUCCESS");
      } else {
        System.out.println("indexed add test: FAIL");
      }
      if ( europe.remove(1).equals("Slovakia") ) {
        System.out.println("remove test: SUCCESS");
      } else {
        System.out.println("remove test: FAIL");
      }
      if ( europe.get(1).equals("Latvia") ) {
        System.out.println("remove test: SUCCESS");
      } else {
        System.out.println("remove test: FAIL");
      }
      if ( europe.indexOf("Deutschland") == 2) {
        System.out.println("indexOf test: SUCCESS");
      } else {
        System.out.println("indexOf test: FAIL");
      }
      String delete = europe.remove(2);
      if ( europe.indexOf("Deutschland") == -1) {
        System.out.println("indexOf test: SUCCESS");
      } else {
        System.out.println("indexOf test: FAIL");
      }
      String[] arr1 = {"Czech Republic", "Latvia", "Andorra", "France"};
      String[] arr2 = {};
      if ( Arrays.equals( europe.toArray(), arr1 ) ) {
        System.out.println("toArray test: SUCCESS");
      } else {
        System.out.println("toArray test: FAIL");
      }
      SuperArray shingles = new SuperArray();
      if ( Arrays.equals( shingles.toArray(), arr2 ) ) {
        System.out.println("toArray test: SUCCESS");
      } else {
        System.out.println("toArray test: FAIL");
      }

      System.out.println("\nConstructor Test-");
      String[] jailhousechef = {"banana french toast", "cheese steak", "hot cereal"};
      SuperArray original = new SuperArray();
      SuperArray capacityType = new SuperArray(4);
      SuperArray arrayTo = new SuperArray(jailhousechef);
      original.add("banana french toast");
      original.add("cheese steak");
      original.add("hot cereal");

      capacityType.add("banana french toast");
      capacityType.add("cheese steak");
      capacityType.add("hot cereal");

      if ( original.toString().equals( capacityType.toString() ) &&
           arrayTo.toString().equals( capacityType.toString() ) ) {
        System.out.println("constructor test: SUCCESS");
      } else {
        System.out.println("constructor test: FAIL");
      }
      if ( arrayTo.size() == capacityType.size() &&
           original.size() == capacityType.size() ) {
        System.out.println( "constructor test: SUCCESS" );
      } else {
        System.out.println( "constructor test: FAIL" );
      }
    }

    System.out.println("\nThursday Do Now Methods Test-");
    if (true) {
      System.out.println("lesson not out yet.");
      String[] preBarn = {"duck", "pig", "spider", "cow"};
      SuperArray barnyard = new SuperArray(preBarn);
      barnyard.reverse();
      if ( barnyard.get(2).equals("pig") ) {
        System.out.println("reverse test: SUCCESS");
      } else {
        System.out.println("reverse test: FAIL; index 2 of the reverse is " + barnyard.get(2) );
      }
      if ( barnyard.toString().equals("[cow, spider, pig, duck]") ) {
        System.out.println("reverse test: SUCCESS");
      } else {
        System.out.println("reverse test: FAIL; the reverse is " + barnyard.toString() );
      }
    }



  }
}
