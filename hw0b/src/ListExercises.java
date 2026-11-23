import org.checkerframework.common.value.qual.EnsuresMinLenIf;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int s = 0;
        /*
        for (int i = 0; i < L.size(); i++)
        {
            s += L.get(i);
        }等价
         */

        for(int num : L)
        {
            s += num;
        }
        return s;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> m_list = new ArrayList<>();
        for(int num : L)
        {
            if(num % 2 == 0)
            {
                m_list.add(num);
            }
        }
        return m_list;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> m_list = new ArrayList<>();
        for(int num : L1)
        {
            if(L2.contains(num) && !m_list.contains(num))
            {
                m_list.add(num);
            }
        }
        return m_list;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for(String ch : words)
        {
            for(int i = 0;i < ch.length();i++)
            {
                if(ch.charAt(i) == c)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
