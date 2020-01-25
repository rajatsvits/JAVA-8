package org.generic.wildcards;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.generic.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonStorageTest {
  Person rajat = new Person("rajat",24);
  Person shri = new Person("shri",16);
  Person kunj = new Person("kunj",18);

  private File file;
  private PersonSaver saver;
  private PersonLoader loader;

  @Test
  public void savesAndLoadPerson() throws Exception{
    Person xyz = new Person("xyz",20);
    saver.save(xyz);
    assertEquals(xyz,loader.Load());
  }

  @Test
  public void savesAndLoadAllPerson() throws Exception{
//    Person[] xyz = new Person[]{new Person("xyz",20),new Person("abc",21)};
//    Person[] xyz = new Person[2];
//    Person[] xyz = new Partner[2];
    List<Partner> xyz = new ArrayList<>();
    xyz.add((Partner) rajat);
    xyz.add((Partner) kunj);
    saver.saveAll(xyz);
    assertEquals(rajat,loader.Load());
    assertEquals(kunj,loader.Load());
  }
}
