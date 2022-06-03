import jdk.jshell.spi.ExecutionControl;
import  org.junit.jupiter.api.Test;

import  java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

      private List<String> createList(String... elems){
          return new ArrayList<>(Arrays.asList(elems));
      }
    @Test
    void everyStatementTest(){
        List<String> nullt=createList();
        RuntimeException ex;

      ex=  assertThrows(RuntimeException.class,()-> SILab2.function(nullt));
      assertTrue(ex.getMessage().contains("List length should be greater than 0"));

     List<String> listt = createList("0","0","0","0","0");
    ex = assertThrows(RuntimeException.class,() ->SILab2.function((listt)));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> list2 = createList("0", "1", "1", "2", "#", "#", "#", "2", "1");
        assertEquals(list2,SILab2.function((createList("0","0","0","0","#","#","#","0","0"))));
      }

        @Test
    void everyBranchTest() {
        List<String> nullb=createList();
        RuntimeException ex;

        ex=  assertThrows(RuntimeException.class,()-> SILab2.function(nullb));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        List<String> listb = createList("0","0","0","0","0");
        ex = assertThrows(RuntimeException.class,() ->SILab2.function((listb)));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> listb2 = createList("0", "1", "1", "2", "#", "#", "#", "2", "1");
        assertEquals(listb2,SILab2.function((createList("0","0","0","0","#","#","#","0","0"))));

            List<String> listb3 = createList("#", "2" ,"#" , "1", "1","1","1","#","1");
            assertEquals(listb3,SILab2.function((createList("#", "1 " ,"#" , "4" ,"5" ,"6" ,"7", "#" ,"9"))));

      }

//      @Test
//       void functionalTest(){
//
//          List<Integer> listtfalse = createList(0,0,0,0","0");
//           assertFalse(SILab2.function(listtfalse));
//      }

}

