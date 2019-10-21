import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Demo {



    // Complete the whichSweetShouldIBring function below.
    static String whichSweetShouldIBring(List<String> votes) {
      TreeMap<String,Integer> sweetCount = new TreeMap<>();
      for(String vote : votes)
      {
         if(sweetCount.containsKey(vote))
         {
             sweetCount.put(vote, sweetCount.get(vote) + 1);
         }
         else
         {
        	 sweetCount.put(vote, 1);
         }
      }
      
      int max = 0;
      Map.Entry<String,Integer> maxEntry = null;
      for (Map.Entry<String,Integer> entry : sweetCount.entrySet())
      {
    	  if(entry.getValue() > max)
    	  {
    		  maxEntry = entry;
    		  max = entry.getValue();
    	  }
    	  else if(entry.getValue() == max)
    	  {
    		  if(maxEntry != null)
    		  {
    			  if(maxEntry.getKey().compareTo(entry.getKey()) < 0)
    				  maxEntry = entry;
    		  }
    	  }
      }
      return maxEntry.getKey();
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int votesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> votes = new ArrayList<>();
//
//        IntStream.range(0, votesCount).forEach(i -> {
//            try {
//                votes.add(bufferedReader.readLine());
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

    	List<String> votes = new ArrayList<>();
    	votes.add("Gulab-jamun");
    	votes.add("Laddu");
    	votes.add("jalebi");
    	votes.add("barfi");
    	votes.add("Laddu");
    	votes.add("Gulab-jamun");
    	votes.add("Gulab-jamun");
    	votes.add("jalebi");
    	votes.add("Gajar-halwa");
    	votes.add("Gajar-halwa");
    	votes.add("barfi");
    	votes.add("Gajar-halwa");
    	
       
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(-5);
        a.add(4);
        a.add(-2);
        a.add(3);
        a.add(1);
        a.add(-1);
        a.add(-6);
        a.add(-1);
        a.add(0);
        a.add(5);
        System.out.println(shaktimaan(a));
       // System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
    
    static int shaktimaan(List<Integer> power) {

        int[] arr = power.stream().mapToInt(i->i).toArray();
        int minPowReq = 0;
        int remPow = 0;
        
        	
        for(int i =0; i<arr.length;i++)
        {
            if((arr[i]<0 && remPow == 0) || (remPow +arr[i] <= 0 ))
            {
                minPowReq =minPowReq + Math.abs(arr[i]) + 1;
                remPow = remPow + Math.abs(arr[i]) + 1;
            }
            
            
                remPow = remPow + arr[i];
            
        }
     return minPowReq;

        }
    
    static int maximalDifference(List<Integer> a) {
        int[] arr = a.stream().mapToInt(i->i).toArray();
        //Integer[] arr = a.toArray();
        int maxDiff = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
            int target = arr[i];
            for(int j = i+1; j<arr.length; j++)
            {
                if(target > arr[j])
                {
                    continue;
                }
                else
                {
                    if((arr[j] - target) > maxDiff)
                    {
                        maxDiff = (arr[j] - target);
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        return maxDiff;
        }
}


